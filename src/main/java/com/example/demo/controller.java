package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.DayOfWeek;
import java.time.LocalDate;

@Controller

//Codelab eksempel
public class controller {
   //Endpoint ("") : url
    @GetMapping("/")
    public String hello() {
        String text = "hej";
        return text;
    }
       //1 - Create an endpoint greets the user with friendly message
       @GetMapping ("/")
        public String Index() {
            return "Welcome to this page";

        }

      //2 - create an endpoint that echo's the users GET
      @GetMapping ("/parameterexercise")
      public String parameter (@RequestParam String input) {
        return input + " " + "";
   }

      //3 - Create endpoint to mimic www.. with plain tekst
      @GetMapping ("/friday")
      public String DayOfWeek () {
        DayOfWeek today =  LocalDate.now().getDayOfWeek();
        int todayNumber = today.getValue();

        //if - else statement
          if (todayNumber == 5) {
              return "Det er fredag";

          } else {

              return "Det er ikke fredag";
          }
      }
}





