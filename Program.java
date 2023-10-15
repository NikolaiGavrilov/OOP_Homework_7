public class Program {

    /**
     *  TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency, 120000);
        Company yandex = new Company("Yandex", jobAgency, 95000);
        Company geekBrains = new Company("GeekBrains", jobAgency, 98000);
        Company formerMcDonalds = new Company("Вкусно и Точка", jobAgency, 60000);

        Vacancy vacancy1 = new Vacancy("Уборщик помещений", 20000, 0);
        Vacancy vacancy2 = new Vacancy("Front-end developer", 100000, 3);
        Vacancy vacancy3 = new Vacancy("Python developer", 65000, 1);
        Vacancy vacancy4 = new Vacancy("Java developer", 80000, 3);
        Vacancy vacancy5 = new Vacancy("Programming lecturer", 85000, 2);
        Vacancy vacancy6 = new Vacancy("QA manual", 45000, 0);
        Vacancy vacancy7 = new Vacancy("Сотрудник ресторана 'ВКУСНО И ТОЧКА'", 35000, 0);
        Vacancy vacancy8 = new Vacancy("QA Automation Engineer", 65000, 0);

        Student student1 = new Student("Вася");
        Student student2 = new Student("Петя");
        Junior junior1 = new Junior("Михаил Михайлов");
        Junior junior2 = new Junior("Сергей Сергеев");
        Middle middle1 = new Middle("Иванов Иван Иванович");
        Middle middle2 = new Middle("Ильин Илья Ильич");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(student2);
        jobAgency.registerObserver(junior1);
        jobAgency.registerObserver(junior2);
        jobAgency.registerObserver(middle1);
        jobAgency.registerObserver(middle2);

        for (int i = 0; i < 1; i++){
            google.needEmployee(vacancy1);
            System.out.println("");
            google.needEmployee(vacancy2);
            System.out.println("");
            yandex.needEmployee(vacancy3);
            System.out.println("");
            geekBrains.needEmployee(vacancy4);
            System.out.println("");
            geekBrains.needEmployee(vacancy5);
            System.out.println("");
            yandex.needEmployee(vacancy6);
            System.out.println("");
            formerMcDonalds.needEmployee(vacancy7);
            System.out.println("");
            yandex.needEmployee(vacancy8);
            System.out.println("");
        }

    }

}
