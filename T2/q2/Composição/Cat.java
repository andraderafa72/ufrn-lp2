public class Cat {
  private Animal base;

  public Cat(String name){
    this.base = new Animal(name);
  }

  public void setName(String name){
    this.base.setName(name);
  }

  public String getName(){
    return this.base.getName();
  }

  public void greets(){
    System.out.println("Meow");
  }
}
