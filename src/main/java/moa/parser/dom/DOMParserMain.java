package moa.parser.dom;

import moa.model.Farmer;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DOMParserMain {

    public static void main(String[] args) {

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            String xml = "src/main/java/482.xml";
            Document document =  builder.parse(xml);

            NodeList farmerNodeList = document.getElementsByTagName("Farmer");
            List<Farmer> farmerList= new ArrayList<>();
            for (int i = 0; i < farmerNodeList.getLength(); i++) {
                Element  farmerElement = (Element) farmerNodeList.item(i);
                double id = Double.parseDouble(farmerElement.getElementsByTagName("sira").item(0).getTextContent());
                String sName= farmerElement.getElementsByTagName("s_name").item(0).getTextContent();
                double cemiHa = Double.parseDouble(farmerElement.getElementsByTagName("cemi_ha").item(0).getTextContent());
                double arpa = Double.parseDouble(farmerElement.getElementsByTagName("arpa").item(0).getTextContent());
                double gargidali = Double.parseDouble(farmerElement.getElementsByTagName("gargidali").item(0).getTextContent());
                double gunBax = Double.parseDouble(farmerElement.getElementsByTagName("gun_bax").item(0).getTextContent());
                double pambig = Double.parseDouble(farmerElement.getElementsByTagName("pambiq").item(0).getTextContent());
                double sekCug = Double.parseDouble(farmerElement.getElementsByTagName("sek_cug").item(0).getTextContent());
                double kartof = Double.parseDouble(farmerElement.getElementsByTagName("kartof").item(0).getTextContent());
                double terevez = Double.parseDouble(farmerElement.getElementsByTagName("terevez").item(0).getTextContent());
                double bostan = Double.parseDouble(farmerElement.getElementsByTagName("bostan").item(0).getTextContent());
                double uzum = Double.parseDouble(farmerElement.getElementsByTagName("uzum").item(0).getTextContent());
                double meyve = Double.parseDouble(farmerElement.getElementsByTagName("meyve").item(0).getTextContent());
                double cay = Double.parseDouble(farmerElement.getElementsByTagName("cay").item(0).getTextContent());
                double diger = Double.parseDouble(farmerElement.getElementsByTagName("diger").item(0).getTextContent());
                String kend = farmerElement.getElementsByTagName("kend").item(0).getTextContent();
                String adRayon = farmerElement.getElementsByTagName("adrayon").item(0).getTextContent();
                double rayon = Double.parseDouble(farmerElement.getElementsByTagName("rayon").item(0).getTextContent());



                Farmer farmer = new Farmer(sName,arpa,gargidali,cemiHa,gunBax,pambig,sekCug,kartof,terevez,bostan,uzum,meyve,cay,diger,kend,adRayon,rayon);

                farmerList.add(farmer);

                farmerList.forEach(System.out::println);

            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }


    }
}
