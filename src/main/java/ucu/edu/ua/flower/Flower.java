package ucu.edu.ua.flower;

import lombok.AllArgsConstructor;

//public class Flower {
//
//    public Flower(int i, String chamomile, int price) {
//       
//    }
//
//}


import lombok.Getter;

import lombok.Setter;

@AllArgsConstructor

@Setter
public class Flower {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;
   // @Getter
   // private FlowerColor flowerColor;


    public String getColor() {
        return color.toString();
    }


    public Flower(int sepalLength, FlowerType flowerType, int price) {
        this.sepalLength =  sepalLength;
        this.flowerType = flowerType;
        this.price = price;
       // FlowerColor  red =  setFlowerColor("red");
        this.color = FlowerColor.BLUE;
        //this.color = FlowerColor();
     
    }


   // private FlowerColor setFlowerColor(String string) {
   //     this.color = FlowerColor.BLUE;
   //     
   //     //throw new UnsupportedOperationException("Unimplemented method 'setFlowerColor'");
   // }
}
