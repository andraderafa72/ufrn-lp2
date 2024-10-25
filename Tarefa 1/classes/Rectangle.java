package classes;

public class Rectangle { 
  private float length;
  private float width;

  public Rectangle(){
    this.length = 1.0f;
    this.width = 1.0f;
  }

  public Rectangle(float length, float width){
    if (length < 0 || width < 0) 
      throw new IllegalArgumentException("Dimensions must be non-negative");

    this.length = length;
    this.width = width;
  }

  public float getLength(){ return this.length; }
  public void setLength(float length){ 
    if (length < 0) 
      throw new IllegalArgumentException("Length must be non-negative");

    this.length = length; 
  }

  public float getWidth(){ return this.width; }
  public void setWidth(float width){ 
    if (width < 0) 
      throw new IllegalArgumentException("width must be non-negative");

    this.width = width; 
  }
  
  public float getArea(){ return this.width * this.length; }
  public float getPerimeter(){ return (this.width * 2) + (this.length * 2); }

  @Override
  public String toString(){ 
    return "Rectangle[length=" + this.length + ", width=" + this.width + "]";
  }
}