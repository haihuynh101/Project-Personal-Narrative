import org.code.theater.*;
import org.code.media.*;
public class MyStory extends Scene{

  private String[][] foods;
  private double[][] ratings;

  public MyStory(String[][] foods, double[][] ratings) {
    this.foods = foods;
    this.ratings = ratings;
  }

  /*
The draw scene method calls upon all the methods in the MyStory.java class that draws scenes with texts, images, and sounds.
  
  */

public void drawScene() {
  
  drawPartOfScene();
   playSound("food-272135.wav");
  drawNextPartOfScene();
  drawTheNextPartOfScene();
drawSceneAgain();
drawSceneAgainAgain();
drawSceneAgainAgainAgain();
drawSceneAgainAgainAgainAgain();
drawSceneAgainAgainAgainAgainAgain();
  drawSceneA();
}
    
public void drawPartOfScene(){
   //1. Clear the scene/draw backround

  clear("white");
  //2. Set any style (text size, font, font style, fill color)
  setTextHeight(60);
    setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
  //3. draw text and images play sounds
  drawText("Vietnam", 100, 45);
  //4. pause before transition

  
ImageFilter flag = new ImageFilter("fff.png");
  drawImage(flag, 120, 100, 180);
  pause(1.5);
  flag.makeRed();
  drawImage(flag, 120, 100, 180);

  pause(1.5);
}

public void drawNextPartOfScene(){
clear("green");
 //2. Set any style (text size, font, font style, fill color)
  setTextHeight(30);
    setTextColor("black");
  setTextStyle(Font.MONO, FontStyle.BOLD);
  /*
     * Draw the text for the food item at foods[0][1] ( "Pho") at position (100, 45).
     * Display the corresponding rating from ratings[0][0] at position (26, 195).
     * Load an image for the food item using the ImageFilter class and draw it at position (100, 50) with a width of 190.
     * Sharpen the image and redraw it
     * Pause for 2 seconds.
     */
 
  drawText(foods[0][1], 100, 45); // Calls the rating aray to 
    drawText("Rating: " + ratings[0][0], 26, 195); // Use ratings array
ImageFilter food = new ImageFilter(foods[0][1].toLowerCase() + ".jpg");
  drawImage(food, 100, 50, 190);
  food.sharpen();
    drawImage(food, 100, 50, 190);
pause(2.0);

}

  public void drawTheNextPartOfScene(){
clear("black");
 //2. Set any style (text size, font, font style, fill color)
  setTextHeight(30);
    setTextColor("white");
  setTextStyle(Font.MONO, FontStyle.BOLD);
    /*
     * Draw the text for the food item at foods[0][2] ( "Com Tam") at position (100, 45).
     * Display the corresponding rating from ratings[0][1] at position (200, 300).
     * Load an image for "Com Tam" using the ImageFilter class and draw it at position (100, 50) with a width of 190.
     * Pause for 1 second, colorize the image, and redraw it
     * Pause for another 1 second to create a smooth transition.
     */
     drawText(foods[0][2], 100, 45);
        drawText("Rating: " + ratings[0][1], 200, 300); 
ImageFilter fooda = new ImageFilter("com-tam.jpg");
  drawImage(fooda, 100, 50, 190);
    
pause(1.0);
fooda.colorize();
    pause(1.0);

  drawImage(fooda, 100, 50, 190);

}


 
  
  public void drawSceneAgain() {
    clear("navy");    // Clear the scene with a navy background
    setTextHeight(30); // Set the text height to 30
    setTextColor("white"); // Set the text color to white
    setTextStyle(Font.MONO, FontStyle.BOLD); // Set the text style to monospaced and bold
     /*
     * Draw the text for the food item at foods[0][3] ("Goi Cuon") at position (70, 40).
     * Display the corresponding rating from ratings[0][2] at position (200, 300).
     * Load an image of thje "Goi Cuon" using the ImageFilter class and draw it at position (80, 55) with a width of 230.
     * Pause for 1 second between drawing the image.
     */
    drawText(foods[0][3], 70, 40);
            drawText("Rating: " + ratings[0][2], 200, 300); // Use ratings array
    ImageFilter GoiCuon = new ImageFilter("goi-cuon.jpg");
    drawImage(GoiCuon, 80, 55, 230);
    pause(1.0);
    drawImage(GoiCuon, 80, 55, 230);
    pause(1.0);
  }


  
  public void drawSceneAgainAgain() {
     clear("navy");    // Clear the scene with a navy background
    setTextHeight(30); // Set the text height to 30
    setTextColor("white"); // Set the text color to white
        setTextStyle(Font.MONO, FontStyle.BOLD); // Set the text style to monospaced and bold

/*
     * Draws the text for the food item at foods[0][4] ( "Banh Mi") at position (70, 40).
     * Displays the corresponding rating from ratings[0][3] at position (200, 300).
     * Load an image for "Banh Mi" using the ImageFilter class and draw it at position (80, 55) with a width of 230.
     * Pause for 1 second, then pixelate the image and redraws it.
     */
    
    drawText(foods[0][4], 70, 40);
      drawText("Rating: " + ratings[0][3], 200, 300); // Use ratings array
    ImageFilter BanhMi = new ImageFilter("banh-mi.jpg");
    drawImage(BanhMi, 80, 55, 230);
    pause(1.0);
    BanhMi.pixelateImage(10);
    drawImage(BanhMi, 80, 55, 230);
    pause(1.0);
  }


   public void drawSceneAgainAgainAgain() {
     clear("black");    // Clear the scene with a black background
    setTextHeight(30); // Set the text height to 30
    setTextColor("white"); // Set the text color to white
    setTextStyle(Font.MONO, FontStyle.BOLD); // Set the text style to monospaced and bold
    drawText(foods[1][1], 70, 40);
     /*
     * Draw the text for the food item at foods[1][1] ( "Banh Flan") at position (70, 40).
     * Display the corresponding rating from ratings[1][0] at position (200, 300).
     * Load an image for "Banh Flan" using the ImageFilter class, sharpen it, and draw it at position (80, 55) with a width of 230.
     * Pause for 1 second.
     */
           drawText("Rating: " + ratings[1][0], 200, 300); 
    ImageFilter Banh = new ImageFilter("banh-flan.jpg");
     Banh.sharpen();
    drawImage(Banh, 80, 55, 230);
    pause(1.0);
  }

     public void drawSceneAgainAgainAgainAgain() {
      clear("black");    // Clear the scene with a black background
    setTextHeight(30); // Set the text height to 30
    setTextColor("white"); // Set the text color to white
    setTextStyle(Font.MONO, FontStyle.BOLD); // Set the text style to monospaced and bold
    drawText(foods[1][2], 70, 40); //uses the Food array

        /*
     * Draw the text for the food item at foods[1][2] ( "Che") at position (70, 40).
     * Display the corresponding rating from ratings[1][1] at position (200, 300).
     * Load an image for "Che" using the ImageFilter class and draw it at position (80, 55) with a width of 230.
     * Pause for 1 second.
     */
         drawText("Rating: " + ratings[1][1], 200, 300); 
    ImageFilter Che = new ImageFilter("Che.jpg");
    drawImage(Che, 80, 55, 230);
    pause(1.0);
  }

   /*
     * Draw the text for the food item at foods[1][3] ( "Banh Chuoi") at position (70, 40).
     * Display the corresponding rating from ratings[1][2] at position (200, 300).
     * Load an image for "Banh Chuoi" using the ImageFilter class and draw it at position (80, 55) with a width of 230.
     * Pause for 1 second.
     */

     public void drawSceneAgainAgainAgainAgainAgain() {
    clear("black");    // Clear the scene with a black background
    setTextHeight(30); // Set the text height to 30
    setTextColor("white"); // Set the text color to white
    setTextStyle(Font.MONO, FontStyle.BOLD);
    drawText(foods[1][3], 70, 40);
     drawText("Rating: " + ratings[1][2], 200, 300); // Use ratings array
    ImageFilter BanhChuoi = new ImageFilter("BanhChuoi.jpg");
    drawImage(BanhChuoi, 80, 55, 230);
    pause(1.0);
  }


  public void drawSceneA() {
    clear("black");    // Clear the scene with a black background
    setTextHeight(30); // Set the text height to 30
    setTextColor("white"); // Set the text color to white
    setTextStyle(Font.MONO, FontStyle.BOLD);
    /*
     * Draw the text for the food item at foods[1][4] ("Banh Pia") at position (70, 40).
     * Display the corresponding rating from ratings[1][3] at position (200, 300).
     * Load an image for "Banh Pia" using the ImageFilter class and draw it at position (80, 55) with a width of 230.
     * Pause for 1 second.
     */
    drawText(foods[1][4], 70, 40);
       drawText("Rating: " + ratings[1][3], 200, 300); // Use ratings array
    ImageFilter BanhPia = new ImageFilter("BanhPia.jpg");
    drawImage(BanhPia, 80, 55, 230);
    pause(1.0);
  }







  


  
}
