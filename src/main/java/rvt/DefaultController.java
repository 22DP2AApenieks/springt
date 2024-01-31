package rvt;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

    /*public static int smallest(int[] int Arr) {
        int smallest = intArr[0];
        for (int)
        }
        return smallest;
    }
    */
    
    
   @GetMapping(value = "/")
    String index(@RequestParam(name="name", required=false, defaultValue="null") String name, Model model) {
        return "index";
    }
    @GetMapping(value = "/students")
    public ModelAndView students(){
        ModelAndView modelAndView = new ModelAndView("Students");
        return modelAndView;
    }
    @GetMapping(value = "/about")
    public ModelAndView about(){
        ModelAndView modelAndView = new ModelAndView("about");
        return modelAndView;
    }  
}
