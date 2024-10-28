//package ucu.edu.ua;
//
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//
//@RestController
//public class FlowerController {
//    @GetMapping
//    public List<Flower> helloWorld() { //String getMethodName(@RequestParam String param) {
//       // int price;
//        //int sepallength;
//        return List.of(new Flower(100, FlowerType.Chamomile, 100));
//    
//    }
//    
//
//}
//
package ucu.edu.ua.flower;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowerController {
    @GetMapping
    public List<Flower> helloWorld(){
        return List.of(new Flower(100,  FlowerType.CHAMOMILE, 100));
    }
   // public String hello() {
   //     return "hello new1";
   // }
}