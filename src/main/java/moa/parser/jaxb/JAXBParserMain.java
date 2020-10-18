package moa.parser.jaxb;

import moa.model.Farmer;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class JAXBParserMain {

    public static void main(String[] args) {

        try {
            JAXBContext context = JAXBContext.newInstance(JAXBFarmer.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            String xml = "src/main/java/482.xml";
            List<Farmer> farmerList = (List<Farmer>) unmarshaller.unmarshal(new FileReader(xml));

            farmerList.forEach(System.out::println);

        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
