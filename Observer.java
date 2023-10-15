public interface Observer {

    void receiveOffer(String nameCompany, int salary, Vacancy vacancy);
    boolean agreeToOffer(String nameCompany, int salary, Vacancy vacancy);

}
