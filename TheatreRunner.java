import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {
     String[][] vietnameseFood = {
    {"Popular Dishes", "Pho", "Com Tam", "Goi Cuon",  " Banh Mi "},
    {"Desserts", "Banh Flan", "Che", "Banh Chuoi","Banh Pia" }
};

double[][] foodRatings = {
    {9.0, 9.0, 8.5, 10.0}, // Ratings for  the popular dishes
    {8.0, 8.5, 9.0, 7.5}       // Ratings for  the desserts
};
    //main drawScene call
MyStory scene = new MyStory(vietnameseFood, foodRatings);

scene.drawScene();

    Theater.playScenes(scene);

  
  
    
  }
}