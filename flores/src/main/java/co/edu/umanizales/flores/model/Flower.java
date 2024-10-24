package co.edu.umanizales.flores.model;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
    public class Flower {

        private String flower;
        private byte colours;

    @Getter
    @Setter
    private double price;

        public Flower(String flower, byte colours, double price) {
            this.flower = flower;
            this.colours = colours;
            this.price = price;

        }


        }



