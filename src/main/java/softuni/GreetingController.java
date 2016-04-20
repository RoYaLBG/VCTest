package softuni;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @Autowired
    private Ageable ageable;

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

    @RequestMapping("/softuni")
    public String softUniIndex(@RequestParam String name, Model model) {
        ageable.ageInYears();
        ageable.ageInYears();
        ageable.ageInYears();

        model.addAttribute("company", "SoftUni");
        model.addAttribute("current_user", name);
        model.addAttribute("ageable", ageable);



        return "softuni_index";
    }

}