package abstractAnimals;

import animals.AnimalInterface;

import java.util.ArrayList;

public abstract class Animal implements AnimalInterface {

    private final int birthday;
    private final int birthmonth;
    private final int birthyear;
    private final String name;
    private int id;

    private ArrayList<String> skills;

    protected Animal(String name, int birthday, int birthmonth, int birthyear) {
        this.birthday = birthday;
        this.birthmonth = birthmonth;
        this.birthyear = birthyear;
        this.skills = new ArrayList<>();
        this.name = name;
    }

    protected Animal(int id, String name, int birthday, int birthmonth, int birthyear, ArrayList<String> skills) {
        this.birthday = birthday;
        this.birthmonth = birthmonth;
        this.birthyear = birthyear;
        this.skills = skills;
        this.id = id;
        this.name = name;
    }

    @Override
    public void addAnimalSkill(String skill) {
        skills.add(skill);
    }

    @Override
    public void delAnimalSkill(int index) {
        skills.remove(index);
    }

    public ArrayList<String> getSkills() {
        return skills;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getBirthmonth() {
        return birthmonth;
    }

    public int getBirthyear() {
        return birthyear;
    }

    public String getName() {
        return name;
    }

    public static double calcAge(int birthday, int birthmonth, int birthyear) {

        return 0;
    }
}
