package entities;

public class Company extends TaxPayer {

    private Integer numberOfEmploees;

    public Company() {
        super();
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmploees = numberOfEmployees;
    }

    public Integer getNumberOfEmploees() {
        return numberOfEmploees;
    }

    public void setNumberOfEmploees(Integer numberOfEmploees) {
        this.numberOfEmploees = numberOfEmploees;
    }

    @Override
    public Double tax() {
        if (numberOfEmploees < 10) {
            return getAnualIncome() * 0.16;
        } else {
            return getAnualIncome() * 0.14;
        }

    }

}
