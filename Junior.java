public class Junior implements Observer {

    private String name;
    private int salary = 60000;
    private int experience = 1;
    private int countOfAgreements = 0;

    public int getExperience() {
        return experience;
    }

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, Vacancy vacancy) {
        if (countOfAgreements >= 1)
        {
            System.out.printf("Джуниор %s: \nЯ УЖЕ НАШЕЛ РАБОТУ! КАК ОТПИСАТЬСЯ ОТ ЭТОЙ РАССЫЛКИ?!!11 \n(компания: %s; %s)\n",
                            name, nameCompany, vacancy);
        } else {
            if (this.salary > vacancy.getSalary()*2 || this.experience > (vacancy.getExpLevel()+2)){
                System.out.printf("Джуниор %s: \nЯ слишком крут для этой вакансии \n(компания: %s; %s)\n",
                        name, nameCompany, vacancy);
            }
            else if (this.salary > vacancy.getSalary() && this.experience >= vacancy.getExpLevel()){
                System.out.printf("Джуниор %s: \nЯ не соглашусь работать за такие копейки \n(компания: %s; %s)\n",
                        name, nameCompany, vacancy);
            }
            else if (this.experience < vacancy.getExpLevel()){
                System.out.printf("Джуниор %s: \nМне пока не хватает опыта для отклика на эту вакансию \n(компания: %s; %s)\n",
                        name, nameCompany, vacancy);
            }
            else if (this.salary <= vacancy.getSalary() && this.experience >= vacancy.getExpLevel()){
                if (vacancy.isVacancyAvailable()== false){
                    System.out.printf("Джуниор %s: \nУпс, кажется, вакансия уже неактуальна, и её забыли удалить. Придётся искать дальше... \n(компания: %s; %s)\n",
                            name, nameCompany, vacancy);
                } else {
                    System.out.printf("Джуниор %s: \nМне нужна эта работа! \n(компания: %s; %s)\n",
                            name, nameCompany, vacancy);
                    countOfAgreements +=1;
                    agreeToOffer(nameCompany, salary, vacancy);
                    vacancy.setVacancyAvailable(false);
                }
            }
            else {
                System.out.printf("Джуниор %s: \nЭта вакансия мне не подходит. \n(компания: %s; %s)\n",
                        name, nameCompany, vacancy);
            }
        }
    }

    @Override
    public boolean agreeToOffer(String nameCompany, int salary, Vacancy vacancy) {
        return true;
        
    }
}
