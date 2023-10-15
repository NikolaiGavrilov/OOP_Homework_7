public class Middle implements Observer{

    private String name;
    private int salary = 80000;
    private int experience = 3;

    public Middle(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.salary > vacancy.getSalary()*2 || this.experience > (vacancy.getExpLevel()+2)){
            System.out.printf("Миддл %s: Я слишком крут для этой вакансии (компания: %s; \n%s)\n",
                    name, nameCompany, vacancy);
        }
        else if (this.salary > vacancy.getSalary() && this.experience >= vacancy.getExpLevel()){
            System.out.printf("Миддл %s: Я не соглашусь работать за такие копейки (компания: %s; \n%s)\n",
                    name, nameCompany, vacancy);
        }
        else if (this.experience < vacancy.getExpLevel()){
            System.out.printf("Миддл %s: Мне пока не хватает опыта для отклика на эту вакансию (компания: %s; \n%s)\n",
                    name, nameCompany, vacancy);
        }
        else if (this.salary <= vacancy.getSalary() && this.experience >= vacancy.getExpLevel()){
            System.out.printf("Миддл %s: Мне нужна эта работа! (компания: %s; \n%s)\n",
                    name, nameCompany, vacancy);
            agreeToOffer(nameCompany, salary, vacancy);
        }
        else {
            System.out.printf("Миддл %s: Эта вакансия мне не подходит. (компания: %s; \n%s)\n",
                    name, nameCompany, vacancy);
        }
    }

    @Override
    public boolean agreeToOffer(String nameCompany, int salary, Vacancy vacancy) {
        return true;
    }
}
