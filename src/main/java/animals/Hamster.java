package animals;

import abstractAnimals.HomeAnimal;

import java.util.ArrayList;

public class Hamster extends HomeAnimal {
    public Hamster(String name, int birthday, int birthmonth, int birthyear) {
        super(name, birthday, birthmonth, birthyear);
    }

    public Hamster(int id, String name, int birthday, int birthmonth, int birthyear, ArrayList<String> skills) {
        super(id, name, birthday, birthmonth, birthyear, skills);
    }

    @Override
    public String toString() {
        return "id:" + super.getId() + " Хомяк: " + super.getName() + " Дата рождения: "  + this.getBirthday() + "." + this.getBirthmonth() + "." + this.getBirthyear();
    }
}
