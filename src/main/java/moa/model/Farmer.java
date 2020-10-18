package moa.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Farmer")
@XmlAccessorType(XmlAccessType.FIELD)
public class Farmer {

    private double id;
    @XmlElement(name = "sname")
    private String sName;
    @XmlElement(name = "arpa")
    private double arpa;
    @XmlElement(name = "qargidali")
    private double gargidali;
    @XmlElement(name = "cemi_ha")
    private double cemiHa;
    @XmlElement(name ="gun_bax")
    private double gunBax;
    @XmlElement(name = "pambiq")
    private double pambiq;
    @XmlElement(name = "sek_cug")
    private double sekCug;
    @XmlElement(name = "kartof")
    private double kartof;
    @XmlElement(name = "terevez")
    private double terevez;
    @XmlElement(name = "bostan")
    private double bostan;
    @XmlElement(name = "uzum")
    private double uzum;
    @XmlElement(name = "meyve")
    private double meyve;
    @XmlElement(name = "cay")
    private double cay;
    @XmlElement(name = "diger")
    private double diger;
    @XmlElement(name = "kend")
    private String kend;
    @XmlElement(name = "adrayon")
    private String adRayon;
    @XmlElement(name = "rayon")
    private double rayon;


    public Farmer() {
        this("",0,0,0,0,0,0,0,0,0,0,0,0,0,"","",0);

    }

    public Farmer(String sName, double arpa, double gargidali, double cemiHa, double gunBax, double pambiq, double sekCug, double kartof, double terevez, double bostan, double uzum, double meyve, double cay, double diger, String kend, String adRayon, double rayon) {
        this.sName = sName;
        this.arpa = arpa;
        this.gargidali = gargidali;
        this.cemiHa = cemiHa;
        this.gunBax = gunBax;
        this.pambiq = pambiq;
        this.sekCug = sekCug;
        this.kartof = kartof;
        this.terevez = terevez;
        this.bostan = bostan;
        this.uzum = uzum;
        this.meyve = meyve;
        this.cay = cay;
        this.diger = diger;
        this.kend = kend;
        this.adRayon = adRayon;
        this.rayon = rayon;
    }

    public Farmer(double id, String sName, double arpa, double gargidali, double cemiHa, double gunBax, double pambiq, double sekCug, double kartof, double terevez, double bostan, double uzum, double meyve, double cay, double diger, String kend, String adRayon, double rayon) {
        this.id = id;
        this.sName = sName;
        this.arpa = arpa;
        this.gargidali = gargidali;
        this.cemiHa = cemiHa;
        this.gunBax = gunBax;
        this.pambiq = pambiq;
        this.sekCug = sekCug;
        this.kartof = kartof;
        this.terevez = terevez;
        this.bostan = bostan;
        this.uzum = uzum;
        this.meyve = meyve;
        this.cay = cay;
        this.diger = diger;
        this.kend = kend;
        this.adRayon = adRayon;
        this.rayon = rayon;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public double getArpa() {
        return arpa;
    }

    public void setArpa(double arpa) {
        this.arpa = arpa;
    }

    public double getGargidali() {
        return gargidali;
    }

    public void setGargidali(double gargidali) {
        this.gargidali = gargidali;
    }

    public double getCemiHa() {
        return cemiHa;
    }

    public void setCemiHa(double cemiHa) {
        this.cemiHa = cemiHa;
    }

    public double getGunBax() {
        return gunBax;
    }

    public void setGunBax(double gunBax) {
        this.gunBax = gunBax;
    }

    public double getPambiq() {
        return pambiq;
    }

    public void setPambiq(double pambiq) {
        this.pambiq = pambiq;
    }

    public double getSekCug() {
        return sekCug;
    }

    public void setSekCug(double sekCug) {
        this.sekCug = sekCug;
    }

    public double getKartof() {
        return kartof;
    }

    public void setKartof(double kartof) {
        this.kartof = kartof;
    }

    public double getTerevez() {
        return terevez;
    }

    public void setTerevez(double terevez) {
        this.terevez = terevez;
    }

    public double getBostan() {
        return bostan;
    }

    public void setBostan(double bostan) {
        this.bostan = bostan;
    }

    public double getUzum() {
        return uzum;
    }

    public void setUzum(double uzum) {
        this.uzum = uzum;
    }

    public double getMeyve() {
        return meyve;
    }

    public void setMeyve(double meyve) {
        this.meyve = meyve;
    }

    public double getCay() {
        return cay;
    }

    public void setCay(double cay) {
        this.cay = cay;
    }

    public double getDiger() {
        return diger;
    }

    public void setDiger(double diger) {
        this.diger = diger;
    }

    public String getKend() {
        return kend;
    }

    public void setKend(String kend) {
        this.kend = kend;
    }

    public String getAdRayon() {
        return adRayon;
    }

    public void setAdRayon(String adRayon) {
        this.adRayon = adRayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "Farmer{" +
                "sira=" + id +
                ", sName='" + sName + '\'' +
                ", cemiHa=" + cemiHa +
                ", arpa=" + arpa +
                ", gargidali=" + gargidali +
                ", gunBax=" + gunBax +
                ", pambiq=" + pambiq +
                ", sekCug=" + sekCug +
                ", kartof=" + kartof +
                ", terevez=" + terevez +
                ", bostan=" + bostan +
                ", uzum=" + uzum +
                ", meyve=" + meyve +
                ", cay=" + cay +
                ", diger=" + diger +
                ", kend='" + kend + '\'' +
                ", adRayon='" + adRayon + '\'' +
                ", rayon=" + rayon +
                '}';
    }
}
