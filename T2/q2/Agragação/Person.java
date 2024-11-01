public class Person {
  private String name;
  private Address address;

  public Person(String name, Address address) {
    this.name = name;
    this.address = address;
  }

  public Person(String name, String street) {
    this.name = name;
    this.address = new Address(street);
  }
}
