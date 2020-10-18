package moa.parser.stax;

import moa.model.Farmer;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MOAStaxParser {


    private static XMLInputFactory factory = null;
    private static XMLEventReader reader = null;
    private static String xml =null;


    public static void xmlParsing(int limit){
        try {

           factory = XMLInputFactory.newFactory();
           xml = "C:\\Users\\ibrahim\\Desktop\\Java\\15.XMLOperations\\src\\482.xml";
           reader= factory.createXMLEventReader(new FileInputStream(xml));

            List<Farmer> farmerList = new ArrayList<>();
            Farmer temp = null;
            boolean isFarmer=false;
            boolean isId=false;
            boolean isSName=false;
            boolean isCemiHa=false;
            boolean isArpa=false;
            boolean isGargidali=false;
            boolean isGuneBax=false;
            boolean isPambiq=false;
            boolean isSekCug=false;
            boolean isKartof=false;
            boolean isTerevez=false;
            boolean isBostan=false;
            boolean isUzum=false;
            boolean isMeyve=false;
            boolean isCay=false;
            boolean isDiger=false;
            boolean isKend=false;
            boolean isAdRayon=false;
            boolean isRayon=false;

            int counter =0;



            while (reader.hasNext()) {
                XMLEvent event = reader.nextEvent();

                if (event.getEventType() == XMLStreamConstants.START_DOCUMENT) {
                    System.out.println("xml senedini oxumaga basladiq");
                }else if (event.getEventType() == XMLStreamConstants.END_DOCUMENT){
                    System.out.println("xml senedini oxuduq bitirdik");
                }else if (event.getEventType() == XMLStreamConstants.START_ELEMENT) {

                    StartElement startElement = (StartElement) event;
                    String name = startElement.getName().toString();
                    if (name.equals("Farmer")){
                        isFarmer =true;
                        temp = new Farmer();
                    }else if (name.equals("sira")){
                        isId=true;
                    }else if (name.equals("sname")){
                        isSName=true;
                    }else if (name.equals("cemi_ha")){
                        isCemiHa=true;
                    }else if (name.equals("arpa")){
                        isArpa=true;
                    }else if (name.equals("qargidali")){
                        isGargidali=true;
                    }else if (name.equals("gun_bax")){
                        isGuneBax=true;
                    }else if (name.equals("pambiq")){
                        isPambiq=true;
                    }else if (name.equals("sek_cug")){
                        isSekCug=true;
                    }else if (name.equals("kartof")){
                        isKartof=true;
                    }else if (name.equals("terevez")){
                        isTerevez=true;
                    }else if (name.equals("bostan")){
                        isBostan=true;
                    }else if (name.equals("uzum")){
                        isUzum=true;
                    }else if (name.equals("meyve")){
                        isMeyve=true;
                    }else if (name.equals("cay")){
                        isCay=true;
                    }else if (name.equals("diger")){
                        isDiger=true;
                    }else if (name.equals("kend")){
                        isKend=true;
                    }else if (name.equals("adrayon")){
                        isAdRayon=true;
                    }else if (name.equals("rayon")){
                        isRayon=true;
                    }
                }
                else if (event.getEventType() == XMLStreamConstants.CHARACTERS) {

                    Characters characters = (Characters) event;
                    if (isId && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setId(Double.parseDouble(characters.getData()));
                    }else if (isSName && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setsName(characters.getData());
                    }else if (isCemiHa && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setCemiHa(Double.parseDouble(characters.getData()));
                    }else if (isArpa && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setArpa(Double.parseDouble(characters.getData()));
                    }else if (isGargidali && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setGargidali(Double.parseDouble(characters.getData()));
                    }else if (isGuneBax && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setGunBax(Double.parseDouble(characters.getData()));
                    }else if (isPambiq && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setPambiq(Double.parseDouble(characters.getData()));
                    }else if (isSekCug && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setSekCug(Double.parseDouble(characters.getData()));
                    }else if (isKartof && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setKartof(Double.parseDouble(characters.getData()));
                    }else if (isTerevez && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setTerevez(Double.parseDouble(characters.getData()));
                    }else if (isBostan && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setBostan(Double.parseDouble(characters.getData()));
                    }else if (isUzum && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setUzum(Double.parseDouble(characters.getData()));
                    }else if (isMeyve && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setMeyve(Double.parseDouble(characters.getData()));
                    }else if (isCay && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setCay(Double.parseDouble(characters.getData()));
                    }else if (isDiger && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setDiger(Double.parseDouble(characters.getData()));
                    }else if (isKend){
                        temp.setKend(characters.getData());
                    }else if (isAdRayon){
                        temp.setAdRayon(characters.getData());
                    }else if (isRayon && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setRayon(Double.parseDouble(characters.getData()));
                    }


                }else if (event.getEventType() == XMLStreamConstants.END_ELEMENT){

                    EndElement endElement = (EndElement) event;
                    String name = endElement.getName().toString();
                    if (name.equals("Farmer")){
                        isFarmer =false;

                        if (counter < limit) {
                            farmerList.add(temp);
                            counter++;
                        }
                        else {
                            break;
                        }

                        temp = null;
                    }else if (name.equals("sira")){
                        isId=false;
                    }else if (name.equals("sname")){
                        isSName=false;
                    }else if (name.equals("cemi_ha")){
                        isCemiHa=false;
                    }else if (name.equals("arpa")){
                        isArpa=false;
                    }else if (name.equals("qargidali")){
                        isGargidali=false;
                    }else if (name.equals("gun_bax")){
                        isGuneBax=false;
                    }else if (name.equals("pambiq")){
                        isPambiq=false;
                    }else if (name.equals("sek_cug")){
                        isSekCug=false;
                    }else if (name.equals("kartof")){
                        isKartof=false;
                    }else if (name.equals("terevez")){
                        isTerevez=false;
                    }else if (name.equals("bostan")){
                        isBostan=false;
                    }else if (name.equals("uzum")){
                        isUzum=false;
                    }else if (name.equals("meyve")){
                        isMeyve=false;
                    }else if (name.equals("cay")){
                        isCay=false;
                    }else if (name.equals("diger")){
                        isDiger=false;
                    }else if (name.equals("kend")){
                        isKend=false;
                    }else if (name.equals("adrayon")){
                        isAdRayon=false;
                    }else if (name.equals("rayon")){
                        isRayon=false;
                    }

                }

            }

            System.out.println("iscilerin siyahisi");
            farmerList.forEach(farmer -> System.out.println(farmer));
        }catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void xmlParsing(){
        try {

            factory = XMLInputFactory.newFactory();
            xml = "C:\\Users\\ibrahim\\Desktop\\Java\\15.XMLOperations\\src\\482.xml";
            reader= factory.createXMLEventReader(new FileInputStream(xml));

            List<Farmer> farmerList = new ArrayList<>();
            Farmer temp = null;
            boolean isFarmer=false;
            boolean isId=false;
            boolean isSName=false;
            boolean isCemiHa=false;
            boolean isArpa=false;
            boolean isGargidali=false;
            boolean isGuneBax=false;
            boolean isPambiq=false;
            boolean isSekCug=false;
            boolean isKartof=false;
            boolean isTerevez=false;
            boolean isBostan=false;
            boolean isUzum=false;
            boolean isMeyve=false;
            boolean isCay=false;
            boolean isDiger=false;
            boolean isKend=false;
            boolean isAdRayon=false;
            boolean isRayon=false;

            int counter =0;



            while (reader.hasNext()) {
                XMLEvent event = reader.nextEvent();

                if (event.getEventType() == XMLStreamConstants.START_DOCUMENT) {
                    System.out.println("xml senedini oxumaga basladiq");
                }else if (event.getEventType() == XMLStreamConstants.END_DOCUMENT){
                    System.out.println("xml senedini oxuduq bitirdik");
                }else if (event.getEventType() == XMLStreamConstants.START_ELEMENT) {

                    StartElement startElement = (StartElement) event;
                    String name = startElement.getName().toString();
                    if (name.equals("Farmer")){
                        isFarmer =true;
                        temp = new Farmer();
                    }else if (name.equals("sira")){
                        isId=true;
                    }else if (name.equals("sname")){
                        isSName=true;
                    }else if (name.equals("cemi_ha")){
                        isCemiHa=true;
                    }else if (name.equals("arpa")){
                        isArpa=true;
                    }else if (name.equals("qargidali")){
                        isGargidali=true;
                    }else if (name.equals("gun_bax")){
                        isGuneBax=true;
                    }else if (name.equals("pambiq")){
                        isPambiq=true;
                    }else if (name.equals("sek_cug")){
                        isSekCug=true;
                    }else if (name.equals("kartof")){
                        isKartof=true;
                    }else if (name.equals("terevez")){
                        isTerevez=true;
                    }else if (name.equals("bostan")){
                        isBostan=true;
                    }else if (name.equals("uzum")){
                        isUzum=true;
                    }else if (name.equals("meyve")){
                        isMeyve=true;
                    }else if (name.equals("cay")){
                        isCay=true;
                    }else if (name.equals("diger")){
                        isDiger=true;
                    }else if (name.equals("kend")){
                        isKend=true;
                    }else if (name.equals("adrayon")){
                        isAdRayon=true;
                    }else if (name.equals("rayon")){
                        isRayon=true;
                    }
                }
                else if (event.getEventType() == XMLStreamConstants.CHARACTERS) {

                    Characters characters = (Characters) event;
                    if (isId && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setId(Double.parseDouble(characters.getData()));
                    }else if (isSName && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setsName(characters.getData());
                    }else if (isCemiHa && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setCemiHa(Double.parseDouble(characters.getData()));
                    }else if (isArpa && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setArpa(Double.parseDouble(characters.getData()));
                    }else if (isGargidali && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setGargidali(Double.parseDouble(characters.getData()));
                    }else if (isGuneBax && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setGunBax(Double.parseDouble(characters.getData()));
                    }else if (isPambiq && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setPambiq(Double.parseDouble(characters.getData()));
                    }else if (isSekCug && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setSekCug(Double.parseDouble(characters.getData()));
                    }else if (isKartof && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setKartof(Double.parseDouble(characters.getData()));
                    }else if (isTerevez && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setTerevez(Double.parseDouble(characters.getData()));
                    }else if (isBostan && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setBostan(Double.parseDouble(characters.getData()));
                    }else if (isUzum && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setUzum(Double.parseDouble(characters.getData()));
                    }else if (isMeyve && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setMeyve(Double.parseDouble(characters.getData()));
                    }else if (isCay && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setCay(Double.parseDouble(characters.getData()));
                    }else if (isDiger && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setDiger(Double.parseDouble(characters.getData()));
                    }else if (isKend){
                        temp.setKend(characters.getData());
                    }else if (isAdRayon){
                        temp.setAdRayon(characters.getData());
                    }else if (isRayon && !characters.getData().equals("NULL") && !characters.getData().equals(" ")){
                        temp.setRayon(Double.parseDouble(characters.getData()));
                    }


                }else if (event.getEventType() == XMLStreamConstants.END_ELEMENT){

                    EndElement endElement = (EndElement) event;
                    String name = endElement.getName().toString();
                    if (name.equals("Farmer")){
                        isFarmer =false;
                        farmerList.add(temp);
                        counter++;

                        temp = null;
                    }else if (name.equals("sira")){
                        isId=false;
                    }else if (name.equals("sname")){
                        isSName=false;
                    }else if (name.equals("cemi_ha")){
                        isCemiHa=false;
                    }else if (name.equals("arpa")){
                        isArpa=false;
                    }else if (name.equals("qargidali")){
                        isGargidali=false;
                    }else if (name.equals("gun_bax")){
                        isGuneBax=false;
                    }else if (name.equals("pambiq")){
                        isPambiq=false;
                    }else if (name.equals("sek_cug")){
                        isSekCug=false;
                    }else if (name.equals("kartof")){
                        isKartof=false;
                    }else if (name.equals("terevez")){
                        isTerevez=false;
                    }else if (name.equals("bostan")){
                        isBostan=false;
                    }else if (name.equals("uzum")){
                        isUzum=false;
                    }else if (name.equals("meyve")){
                        isMeyve=false;
                    }else if (name.equals("cay")){
                        isCay=false;
                    }else if (name.equals("diger")){
                        isDiger=false;
                    }else if (name.equals("kend")){
                        isKend=false;
                    }else if (name.equals("adrayon")){
                        isAdRayon=false;
                    }else if (name.equals("rayon")){
                        isRayon=false;
                    }

                }

            }

            System.out.println("iscilerin siyahisi");
            farmerList.forEach(farmer -> System.out.println(farmer));
        }catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
