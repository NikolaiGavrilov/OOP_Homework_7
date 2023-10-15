public class Vacancy {
    
    public String type;
    public double salary;
    public int expLevel;
    
    public int getExpLevel() {
        return expLevel;
    }
    public void setExpLevel(int expLevel) {
        this.expLevel = expLevel;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Vacancy(String type, double salary, int expLevel) {
        this.type = type;
        this.salary = salary;
        this.expLevel = expLevel;
    }

    @Override
    public String toString() {
        return "Вакансия [Должность: " + type + ", Предлагаемая зарплата: " + salary + ", Требуемый опыт работы: " + expLevel + "]";
    }

}
