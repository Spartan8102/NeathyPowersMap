import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Swap_Sketch extends PApplet {
  public void setup() {
String[] tileOrder = new String[36];
int[] staticTiles = {1, 6, 7, 13, 19, 25, 31, 32, 33, 34, 35, 36};
int[] blueTileOrder = new int[4];
int[] blueTileReference = {2, 3, 4, 5};
int[] yellowTileOrder = new int[6];
int[] yellowTileReference = {8, 9, 14, 15, 20, 21};
int[] redTileOrder = new int[5];
int[] redTileReference = {10, 11, 16, 17, 22};
int[] orangeTileOrder = new int[4];
int[] orangeTileReference = {12, 18, 24, 30};
int[] greenTileOrder = new int[5];
int[] greenTileReference = {26, 27, 28, 29, 23};

for (int i = 0; i < blueTileOrder.length; i++) {
  boolean used = true;
  int reference;
  while (used != false) {
    used = false;
    reference = blueTileReference[(int) random(0, blueTileReference.length)];
    for (int x = 0; x < blueTileOrder.length; x++) {
      if (reference != blueTileOrder[x] || x == i) {
        if (used != true) {
          used = false;
          blueTileOrder[i] = reference;
        }
      } else {
        used = true;
      }
    }
  }
}
for (int i = 0; i < yellowTileOrder.length; i++) {
  boolean used = true;
  int reference;
  while (used != false) {
    used = false;
    reference = yellowTileReference[(int) random(0, yellowTileReference.length)];
    for (int x = 0; x < yellowTileOrder.length; x++) {
      if (reference != yellowTileOrder[x] || x == i) {
        if (used != true) {
          used = false;
          yellowTileOrder[i] = reference;
        }
      } else {
        used = true;
      }
    }
  }
}
for (int i = 0; i < redTileOrder.length; i++) {
  boolean used = true;
  int reference;
  while (used != false) {
    used = false;
    reference = redTileReference[(int) random(0, redTileReference.length)];
    for (int x = 0; x < redTileOrder.length; x++) {
      if (reference != redTileOrder[x] || x == i) {
        if (used != true) {
          used = false;
          redTileOrder[i] = reference;
        }
      } else {
        used = true;
      }
    }
  }
}
for (int i = 0; i < orangeTileOrder.length; i++) {
  boolean used = true;
  int reference;
  while (used != false) {
    used = false;
    reference = orangeTileReference[(int) random(0, orangeTileReference.length)];
    for (int x = 0; x < orangeTileOrder.length; x++) {
      if (reference != orangeTileOrder[x] || x == i) {
        if (used != true) {
          used = false;
          orangeTileOrder[i] = reference;
        }
      } else {
        used = true;
      }
    }
  }
}
for (int i = 0; i < greenTileOrder.length; i++) {
  boolean used = true;
  int reference;
  while (used != false) {
    used = false;
    reference = greenTileReference[(int) random(0, greenTileReference.length)];
    for (int x = 0; x < greenTileOrder.length; x++) {
      if (reference != greenTileOrder[x] || x == i) {
        if (used != true) {
          used = false;
          greenTileOrder[i] = reference;
        }
      } else {
        used = true;
      }
    }
  }
}

int currentPosition = 0;

for(int i = 0; i < staticTiles.length; i++) {
  tileOrder[i] = Integer.toString(staticTiles[i]);
}
currentPosition += staticTiles.length;
for(int i = 0; i < blueTileOrder.length; i++) {
  tileOrder[i + currentPosition] = Integer.toString(blueTileOrder[i]);
}
currentPosition += blueTileOrder.length;
for(int i = 0; i < yellowTileOrder.length; i++) {
  tileOrder[i + currentPosition] = Integer.toString(yellowTileOrder[i]);
}
currentPosition += yellowTileOrder.length;
for(int i = 0; i < redTileOrder.length; i++) {
  tileOrder[i + currentPosition] = Integer.toString(redTileOrder[i]);
}
currentPosition += redTileOrder.length;
for(int i = 0; i < orangeTileOrder.length; i++) {
  tileOrder[i + currentPosition] = Integer.toString(orangeTileOrder[i]);
}
currentPosition += orangeTileOrder.length;
for(int i = 0; i < greenTileOrder.length; i++) {
  tileOrder[i + currentPosition] = Integer.toString(greenTileOrder[i]);
}

saveStrings("tileorder.txt",tileOrder);

exit();
    noLoop();
  }

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Swap_Sketch" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
