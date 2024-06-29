package it.develhope.exercise.controller;

import it.develhope.exercise.model.ControllerResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("v2/ciao/{provincia}")
    public ControllerResponse ciao(@PathVariable String provincia ,
                                   @RequestParam String nome){

        ControllerResponse cResponse = new ControllerResponse();
        String s;

        if(provincia.isBlank()){
            s = "ciao! " + nome + " com'è il tempo da te?";
        }else {
            s = "ciao! " + nome + " com'è il tempo in " + provincia + "?";
        }
        cResponse.setNome(nome);
        cResponse.setProvincia(provincia);
        cResponse.setSaluto(s);

        return cResponse;
    }

}
