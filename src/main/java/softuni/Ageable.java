package softuni;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by RoYaL on 4/18/2016.
 */
public interface Ageable {

    void ageInYears();

    int getAge();

    Meowable getMeowable();
}
