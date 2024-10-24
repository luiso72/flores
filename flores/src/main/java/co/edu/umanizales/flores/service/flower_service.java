package co.edu.umanizales.flores.service;
import co.edu.umanizales.flores.model.Flower;
import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Data
    @Service
    public class flower_service {
    private ArrayList<Flower> flowers;


    public flower_service(ArrayList<Flower> flowers) {
        this.flowers = flowers;


    }

    @PostConstruct
    public void init() {
        flowers = new ArrayList<>();
        Flower flor1 = new Flower("tulipan", (byte) 3, 3000);
        Flower flor2 = new Flower("Rosa", (byte) 2, 5000);
        Flower flor3 = new Flower("margarita", (byte) 1, 6000);
        Flower flor4 = new Flower("clavel", (byte) 3, 7000);
        Flower flor5 = new Flower("Lirio", (byte) 2, 8000);
        Flower flor6 = new Flower("Girasol", (byte) 1, 9000);


        flowers.add(flor1);
        flowers.add(flor2);
        flowers.add(flor3);
        flowers.add(flor4);
        flowers.add(flor5);
        flowers.add(flor6);


    }

    public List<Flower> getflowerred() {
        List<Flower> flowerred = new ArrayList<>();
        for (Flower flower : flowers) {

            if (flower.getColours() == (byte) 2) {
                flowerred.add(flower);
            }
        }
        return flowerred;
    }

    public List<Flower> getfloweryellow() {
        List<Flower> floweryellow = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getColours() == (byte) 3) {
                floweryellow.add(flower);
            }
        }
        return floweryellow;

    }

    public List<Flower> getflowerspink() {
        List<Flower> flowerspink = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getColours() == (byte) 1) {
                flowerspink.add(flower);
            }
        }
        return flowerspink;
    }


    public List<Flower> postflowerPrice(double minprice) {
        List<Flower> flowerprice = new ArrayList<>();
        for (Flower flower : flowers) {
            if (flower.getPrice() >= (double) minprice) {
                flowerprice.add(flower);
            }
        }
        return flowerprice;
    }

}




