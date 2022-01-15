import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(500, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(0, 0, 0);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	float [] ellipseY = new float[60];
  for (int i = 0; i < 60; i++){
    ellipseY[i] = random(height);
  }
  for(int i = 0; i < ellipseY.length; i++) {
    float ellipseX = width * i / ellipseY.length;
    ellipse(ellipseX, ellipseY[i], 20,20);

    ellipseY[i]++;

    // conditional if statement
    if(ellipseY[i] < height)
    {
      ellipseY[i] = 0;
    }
  }
  }
  
  
}
