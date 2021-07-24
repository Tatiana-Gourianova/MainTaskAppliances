package by.tc.task01.service.validation;

import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

public class Validator2 {
    public class Validator1 {

        public final Logger LOGGER = Logger.getLogger(Validator1.class.getSimpleName());

        public  void validate() {
            String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
            String fileName = "files/ApplianceList.xml";
            String schemaName = "files/Appliance.xsd";
            SchemaFactory factory = SchemaFactory.newInstance(language);
            File schemaLocation = new File(schemaName);
            try {
                // создание схемы
                LOGGER.info("создание схемы");
                Schema schema = factory.newSchema(schemaLocation);
                // создание валидатора на основе схемы
                LOGGER.info("создание валидатора на основе схемы");
                Validator validator = schema.newValidator();
                // проверка документа
                LOGGER.info("проверка документа");
                Source source = new StreamSource(fileName);
                validator.validate(source);
                System.out.println(fileName + " is valid.");
            } catch (SAXException e) {
                LOGGER.info("validation "+ fileName + " is not valid because "
                        + e.getMessage());
            } catch (IOException e) {
                LOGGER.info(fileName + " is not valid because "
                        + e.getMessage());
            }
        }
    }

}
