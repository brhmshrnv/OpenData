package moa.parser.sax;

import moa.model.Farmer;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class SaxContentHandler extends DefaultHandler {


    private List<Farmer> farmerList;
    private Farmer temp;
    private  boolean isFarmer;
    private  boolean isId;
    private  boolean isSName;
    private  boolean isCemiHa;
    private  boolean isArpa;
    private  boolean isGargidali;
    private  boolean isGuneBax;
    private  boolean isPambiq;
    private  boolean isSekCug;
    private  boolean isKartof;
    private  boolean isTerevez;
    private  boolean isBostan;
    private  boolean isUzum;
    private  boolean isMeyve;
    private  boolean isCay;
    private  boolean isDiger;
    private  boolean isKend;
    private  boolean isAdRayon;
    private  boolean isRayon;

    private int limit;
    private int counter=0;

    public SaxContentHandler() {
        this.farmerList = new ArrayList<>();
    }

    public SaxContentHandler(int limit) {
        this();
        this.limit = limit;
    }

    public List<Farmer> getFarmerList() {
        return farmerList;
    }

    @Override
    public void startDocument() throws SAXException {
     //   System.out.println("XML senedini oxumaga basladi");
    }



    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
     //  System.out.println(qName + " elementini oxumaga basladi");

        if (qName.equals("Farmer")){
            temp= new Farmer();
            isFarmer = true;
        }else if (qName.equals("sira")){
            isId = true;
        }else if (qName.equals("sname")){
            isSName = true;
        }else if (qName.equals("cemi_ha")){
            isCemiHa = true;
        }else if (qName.equals("arpa")){
            isArpa = true;
        }else if (qName.equals("qargidali")){
            isGargidali = true;
        }else if (qName.equals("gun_bax")){
            isGuneBax = true;
        }else if (qName.equals("pambiq")){
            isPambiq = true;
        }else if (qName.equals("sek_cug")){
            isSekCug = true;
        }else if (qName.equals("kartof")){
            isKartof = true;
        }else if (qName.equals("terevez")){
            isTerevez = true;
        }else if (qName.equals("bostan")){
            isBostan = true;
        }else if (qName.equals("uzum")){
            isUzum = true;
        }else if (qName.equals("meyve")){
            isMeyve = true;
        }else if (qName.equals("cay")){
            isCay = true;
        }else if (qName.equals("diger")){
            isDiger = true;
        }else if (qName.equals("kend")){
            isKend = true;
        }else if (qName.equals("adrayon")){
            isAdRayon = true;
        }else if (qName.equals("rayon")){
            isRayon = true;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String data = new String(ch , start,length);
       // System.out.println("oxudugumuz data : " + data);

        if (isId && !data.equals("NULL") && !data.equals(" ")){
            temp.setId(Double.parseDouble(data));
        }else if (isSName && !data.equals("NULL") && !data.equals(" ")){
            temp.setsName(data);
        }else if (isCemiHa && !data.equals("NULL") && !data.equals(" ")){
            temp.setCemiHa(Double.parseDouble(data));
        }else if (isArpa && !data.equals("NULL") && !data.equals(" ")){
            temp.setArpa(Double.parseDouble(data));
        }else if (isGargidali && !data.equals("NULL") && !data.equals(" ")){
            temp.setGargidali(Double.parseDouble(data));
        }else if (isGuneBax && !data.equals("NULL") && !data.equals(" ")){
            temp.setGunBax(Double.parseDouble(data));
        }else if (isPambiq && !data.equals("NULL") && !data.equals(" ")){
            temp.setPambiq(Double.parseDouble(data));
        }else if (isSekCug && !data.equals("NULL") && !data.equals(" ")){
            temp.setSekCug(Double.parseDouble(data));
        }else if (isKartof && !data.equals("NULL") && !data.equals(" ")){
            temp.setKartof(Double.parseDouble(data));
        }else if (isTerevez && !data.equals("NULL") && !data.equals(" ")){
            temp.setTerevez(Double.parseDouble(data));
        }else if (isBostan && !data.equals("NULL") && !data.equals(" ")){
            temp.setBostan(Double.parseDouble(data));
        }else if (isUzum && !data.equals("NULL") && !data.equals(" ")){
            temp.setUzum(Double.parseDouble(data));
        }else if (isMeyve && !data.equals("NULL") && !data.equals(" ")){
            temp.setMeyve(Double.parseDouble(data));
        }else if (isCay && !data.equals("NULL") && !data.equals(" ")){
            temp.setCay(Double.parseDouble(data));
        }else if (isDiger && !data.equals("NULL") && !data.equals(" ")){
            temp.setDiger(Double.parseDouble(data));
        }else if (isKend){
            temp.setKend(data);
        }else if (isAdRayon){
            temp.setAdRayon(data);
        }else if (isRayon && !data.equals("NULL") && !data.equals(" ")){
            temp.setRayon(Double.parseDouble(data));
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
      // System.out.println(qName + " elementini oxudu bitirdi");
      //  System.out.println("Bir Farmer tam sekilde oxundu, data = "+ temp);

        if (qName.equals("Farmer")){

            if (counter<limit) {
                farmerList.add(temp);
            }
            counter++;
            temp= null;
           isFarmer = false;
        }else if (qName.equals("sira")){
            isId = false;
        }else if (qName.equals("sname")){
            isSName = false;
        }else if (qName.equals("cemi_ha")){
            isCemiHa = false;
        }else if (qName.equals("arpa")){
            isArpa = false;
        }else if (qName.equals("qargidali")){
            isGargidali = false;
        }else if (qName.equals("gun_bax")){
            isGuneBax = false;
        }else if (qName.equals("pambiq")){
            isPambiq = false;
        }else if (qName.equals("sek_cug")){
            isSekCug = false;
        }else if (qName.equals("kartof")){
            isKartof = false;
        }else if (qName.equals("terevez")){
            isTerevez = false;
        }else if (qName.equals("bostan")){
            isBostan = false;
        }else if (qName.equals("uzum")){
            isUzum = false;
        }else if (qName.equals("meyve")){
            isMeyve = false;
        }else if (qName.equals("cay")){
            isCay = false;
        }else if (qName.equals("diger")){
            isDiger = false;
        }else if (qName.equals("kend")){
            isKend = false;
        }else if (qName.equals("adrayon")){
            isAdRayon = false;
        }else if (qName.equals("rayon")){
            isRayon = false;
        }

    }

    @Override
    public void endDocument() throws SAXException {
       // System.out.println("XML senedini oxumaq bitdi");


    }
}
