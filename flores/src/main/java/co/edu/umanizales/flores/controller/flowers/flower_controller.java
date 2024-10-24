package co.edu.umanizales.flores.controller.flowers;

import co.edu.umanizales.flores.model.Flower;
import co.edu.umanizales.flores.service.flower_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



    @RestController
    @RequestMapping("/flores")
    public class flower_controller {
        @Autowired
        private flower_service flowerService;


        @GetMapping("/lista-de-rojas")
        public List<Flower> getflowerred() {
            return flowerService.getflowerred();
        }

        @GetMapping("/lista-de-rosados")
        public List<Flower> getflowerpink() {
            return flowerService.getflowerspink();
        }

        @GetMapping("/lista-de-amarillas")
        public List<Flower> getfloweryellow() {
            return flowerService.getfloweryellow();
        }

        @PostMapping("/precio")
        public List <Flower> postflowerPrice(@RequestParam double minprice) {
            return flowerService.postflowerPrice(minprice);
        }
    }


