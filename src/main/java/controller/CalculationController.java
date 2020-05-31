package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CalculationController {
    @RequestMapping("/start")
    public String Calinterface() {
        return "interface";
    }

    @RequestMapping("/calculate")
    public String Calculate(@RequestParam Map<String, String> requestParams, Model model) {
        float num1 = Float.parseFloat(requestParams.get("num1"));
        float num2 = Float.parseFloat(requestParams.get("num2"));
        String operator = requestParams.get("operator");

        System.out.println(num1);
        System.out.println(operator);

        String result="";
        switch (operator) {
            case "+":
                result =  Float.toString(num1+num2);
                operator="Addition";
                break;
            case "-":
                result =  Float.toString(num1-num2);
                operator="Subtraction";
                break;
            case "*":
                result =  Float.toString(num1*num2);
                operator="Multiplication";
                break;
            case "/":
                result =  Float.toString(num1/num2);
                operator="Subtraction";
                break;
        }

model.addAttribute("result",result);
model.addAttribute("num1",num1);
model.addAttribute("num2",num2);
model.addAttribute("operator",operator);
        return "interface";
    }
}
