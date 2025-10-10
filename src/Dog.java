public class Dog {
    String name;
    int age;

    public Dog(String _name, int _age) {
        name = _name;
        age = _age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int ageInHumanYears() {
        return getAge() * 7;
    }

    @Override
    public String toString() {
        return "This name of the dog is "+ getName()+" and is "+getAge()+" years old.";
    }

}
