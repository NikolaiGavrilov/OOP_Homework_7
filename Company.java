public class Company {

    private String name;

    private int maxSalary;

    private Publisher jobAgency;



    public Company(String name, Publisher jobAgency, int maxSalary) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(Vacancy vacancy){
        int salary = maxSalary;
        jobAgency.sendOffer(name, salary, vacancy);
    }
    
}
