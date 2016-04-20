package softuni;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by RoYaL on 4/18/2016.
 */
public class User implements Ageable {

    @Autowired
    private Meowable meowable;

    public String name;

    public int age;

    public void ageInYears() {
        age++;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    public Meowable getMeowable() {
        return this.meowable;
    }
}
