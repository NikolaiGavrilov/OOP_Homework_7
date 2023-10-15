public class Student implements Observer{

    private String name;
    private int salary = 2000;
    private int experience = 0;


    public int getExperience() {
        return experience;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (this.salary <= vacancy.getSalary() && this.experience >= vacancy.getExpLevel()){
            System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; \n%s)\n",
                    name, nameCompany, vacancy);
            agreeToOffer(nameCompany, salary, vacancy);
        }
        else if (this.experience < vacancy.getExpLevel()){
            System.out.printf("Студент %s: Мне пока не хватает опыта для отклика на эту вакансию (компания: %s; \n%s)\n",
                    name, nameCompany, vacancy);
        }
        else {
            System.out.printf("Студент %s: Эта вакансия мне не подходит. (компания: %s; \n%s)\n",
                    name, nameCompany, vacancy);
        }
    }

    @Override
    public boolean agreeToOffer(String nameCompany, int salary, Vacancy vacancy) {
        return true;
    }

    // @Override
    // public void receiveOffer(String nameCompany, int salary) {
    //     if (this.salary <= salary){
    //         System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
    //                 name, nameCompany, salary);
    //         this.salary = salary;
    //     }
    //     else {
    //         System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
    //                 name, nameCompany, salary);
    //     }
    // }


}
