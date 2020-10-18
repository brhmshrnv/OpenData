package moa.parser.sax;

import moa.model.Farmer;
import moa.service.FarmerService;
import moa.service.impl.FarmerServiceImpl;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.util.List;

public class SaxParserMain {

    public static void main(String[] args) {

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();

            String xml = "C:\\Users\\ibrahim\\Desktop\\XMLProcessing\\src\\main\\java\\482.xml";
            SaxContentHandler handler = new SaxContentHandler();
            parser.parse(xml,handler);

            List<Farmer> farmerList = handler.getFarmerList();
            farmerList.forEach(System.out::println);

            FarmerService service = new FarmerServiceImpl();

            /*service.saveBatchFarmers(farmerList);*/

            farmerList.forEach(service::saveFarmer);







        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }


    }

}
