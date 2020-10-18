package moa.parser.jaxb;

import moa.model.Farmer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "Farmers")
@XmlAccessorType(value = XmlAccessType.FIELD)
public class JAXBFarmer {

    @XmlElement(name = "Farmer")
    private List<Farmer> farmerList;

    public List<Farmer> getFarmerList() {
        return farmerList;
    }

    public void setFarmerList(List<Farmer> farmerList) {
        this.farmerList = farmerList;
    }
}
