package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    //construtor padrão sem argumentos
    public Employee() {
    }
    //construtor com argumentos
    public Employee(Integer id, String name, Double salary) {
        super();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    //para aumentar o salario do funcionario
    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
