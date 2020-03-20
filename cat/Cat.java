package cat;

public class Cat {
    String name;
    int weight;
    int age;
    String color;
    String ownerAddres;
    int health;
    int power;

    public Cat() {

    }


    public Cat(String name, String color) {
        setName(name);
        setColor(color);
    }

    public Cat(int health, String ownerAddres, int power) {
        setHealth(health);
        setOwnerAddres(ownerAddres);
        setPower(power);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 3 && name != null)
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 3)
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOwnerAddres() {
        return ownerAddres;
    }

    public void setOwnerAddres(String ownerAddres) {
        this.ownerAddres = ownerAddres;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void printInfo () {
        System.out.println("Имя кота: " + getName());
    }

    public void fightCat(Cat enemyCat) {
        health -= enemyCat.getPower();
    }
}
