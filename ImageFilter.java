import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {
  


public ImageFilter(String filename) {
  super(filename);
}
     public void colorize() {

    Pixel[][] pixels = getImagePixels();

    for (Pixel[] row : pixels){
      for (Pixel currentPixel : row) {

        int avgColor = (currentPixel.getRed() + currentPixel.getBlue() + currentPixel.getGreen()) / 3;

        if (avgColor < 85) {
          currentPixel.setRed(255);
          currentPixel.setGreen(0);
          currentPixel.setBlue(0);
        } else if (avgColor < 170) {
          currentPixel.setRed(0);
          currentPixel.setGreen(255);
          currentPixel.setBlue(0);
        } else {
          currentPixel.setRed(0);
          currentPixel.setGreen(0);
          currentPixel.setBlue(255);
        }
        
      }
    }
 
  }
 public void makeNegative() {

    Pixel[][] x = getImagePixels();
    for(int row = 0; row < x.length; row ++){
       for(int col = 0; col < x[0].length; col ++){
         Pixel currentPixel = x[row][col];
         int currentRedPixel = currentPixel.getRed();
         int currentGreenPixel = currentPixel.getGreen();
         int currentBluePixel = currentPixel.getBlue();
         currentPixel.setRed(255 - currentRedPixel);
         currentPixel.setGreen(255 - currentGreenPixel);
         currentPixel.setBlue(255 - currentBluePixel);
       }
    }
  }

   public void mirrorVertical() {

Pixel[][] x = getImagePixels();
    for (int row = 0; row < x.length; row++){
      for(int col = 0; col < x[0].length/2; col++){
        Pixel leftSide = x[row][col];
          Pixel rightSide = x[row][x[0].length-col-1];

          leftSide.setColor(rightSide.getColor());
      }
    }
  }
  public void sharpen() {

 Pixel[][] pixels = getImagePixels();

    for (int row = 1; row < pixels.length - 1; row++) {
      for (int col = 1; col < pixels[0].length - 1; col++) {
        Pixel currentPixel = pixels[row][col];
       
        int redDiff = currentPixel.getRed() - pixels[row - 1][col - 1].getRed();
        int greenDiff = currentPixel.getGreen() - pixels[row - 1][col - 1].getGreen();
        int blueDiff = currentPixel.getBlue() - pixels[row - 1][col - 1].getBlue();
        int averageDiff = (redDiff + greenDiff + blueDiff) / 3;

        int newRed = currentPixel.getRed() + averageDiff;
        int newGreen = currentPixel.getGreen() + averageDiff;
        int newBlue = currentPixel.getBlue() + averageDiff;

        if (newRed > 255) {
          newRed = 255;
        }

        if (newGreen > 255) {
          newGreen = 255;
        }

        if (newBlue > 255) {
          newBlue = 255;
        }
        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
      }
    }
  }
  public void makeRed() {
   
     Pixel[][] x = getImagePixels();
    for(int row = 0; row < x.length;row++){
      for(int col = 0; col< x[0].length; col++){
        Pixel currentPixel = x[row][col];
        int currentGreenPixel = currentPixel.getGreen();
        int currentRedPixel = currentPixel.getRed();
        int currentBluePixel = currentPixel.getBlue();
        currentPixel.setRed(currentBluePixel + 150);

        if(currentPixel.getRed() > 255){
          currentPixel.setRed(255);
        }
      }
    }  
  }

public void pixelateImage(int gridSize) {
    Pixel[][] pixels = getImagePixels();
    for (int row = 0; row < pixels.length; row += gridSize) {
      for (int col = 0; col < pixels[0].length; col += gridSize) {
        int endRow = Math.min(row + gridSize, pixels.length);
        int endCol = Math.min(col + gridSize, pixels[0].length);
        int avgRed = 0;
        int avgGreen = 0;
        int avgBlue = 0;

        for (int regionRow = row; regionRow < endRow; regionRow++) {
          for (int regionCol = col; regionCol < endCol; regionCol++) {
            avgRed += pixels[regionRow][regionCol].getRed();
            avgGreen += pixels[regionRow][regionCol].getGreen();
            avgBlue += pixels[regionRow][regionCol].getBlue();
          }
        }

        int totalPixelsInRegion = (endRow - row) * (endCol - col);
        avgRed /= totalPixelsInRegion;
        avgGreen /= totalPixelsInRegion;
        avgBlue /= totalPixelsInRegion;

        for (int regionRow = row; regionRow < endRow; regionRow++) {
          for (int regionCol = col; regionCol < endCol; regionCol++) {
            pixels[regionRow][regionCol].setRed(avgRed);
            pixels[regionRow][regionCol].setGreen(avgGreen);
            pixels[regionRow][regionCol].setBlue(avgBlue);
          }
        }
      }
    }
    
  }




  
  
}