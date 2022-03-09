package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

   static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYY");

    private Date manufactureDate;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName()
                + " (used) $ "
                + String.format("%.2f",getPrice())
                + " (ManufactureDate: "
                + sdf.format(manufactureDate)
                + ")";
    }
}
