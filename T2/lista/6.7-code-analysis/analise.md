```java
public class TestAnimal {
   public static void main(String[] args) {
      // Using the subclasses
      Cat cat1 = new Cat();
      cat1.greeting();
      Dog dog1 = new Dog();
      dog1.greeting();
      BigDog bigDog1 = new BigDog();
      bigDog1.greeting();
       
      // Using Polymorphism
      Animal animal1 = new Cat();
      animal1.greeting();
      Animal animal2 = new Dog();
      animal2.greeting();
      Animal animal3 = new BigDog();
      animal3.greeting();
      Animal animal4 = new Animal(); //!< Erro: não é possível instanciar classes abstratas!
      
      // Downcast
      Dog dog2 = (Dog)animal2;
      BigDog bigDog2 = (BigDog)animal3;
      Dog dog3 = (Dog)animal3;
      Cat cat2 = (Cat)animal2; //|< Erro: Não é possível realizar cast de Dog para Cat;
      dog2.greeting(dog3);
      dog3.greeting(dog2);
      dog2.greeting(bigDog2); //!< Não há sobrecarga, porém é feito o upcast automaticamente!
      bigDog2.greeting(dog2);
      bigDog2.greeting(bigDog1);
   }
}
```

## Saída caso não houvessem o erros:

```bash
Meow!
Woof!
Woow!
Meow!
Woof!
Woow!
Woooooooooof!
Woooooooooof!
Woooooooooof!
Woooooowwwww!
Woooooowwwww!
```