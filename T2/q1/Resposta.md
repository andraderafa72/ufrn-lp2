# Polimorfismo estático (em tempo de compilação)

Ocorre quando o compilador escolhe, a partir de sobrecargas, qual método executar durante a compilação.

## Exemplo:

O método `soma` possui 3 sobrecargas, que serão escolhidas no processo de compilação. O compilador os diferencia através da quantidade e tipos de parâmetros.

```java
class Calculadora {
  public int soma(int a, int b) { // Sob. 1
    return a + b;
  }

  public double soma(double a, double b) { // Sob. 2
    return a + b;
  }

  public int soma(int a, int b, int c) { // Sob. 3
    return a + b + c;
  }
}

public class Main {
  public static void main(String[] args) {
    Calculadora calc = new Calculadora();
    System.out.println(calc.soma(5, 3)); // Executa a Sob. 1
    System.out.println(calc.soma(4.5, 2.5)); // Executa a Sob. 2
    System.out.println(calc.soma(1, 2, 3)); // Executa a Sob. 3
  }
}
```

# Polimorgismo dinâmico (em tempo de execução)

Acontece com a sobrescrita de métodos, quando uma classe filha redefine um método da classe pai. O método apropriado é escolhido com base no tipo real do objeto, e não no tipo da referência.

## Exemplo:
A decisão de qual método chamar é tomada em tempo de execução.

```java
class Animal {
  public void fazerSom() {
      System.out.println("O animal faz um som");
  }
}

class Cachorro extends Animal {
  @Override
  public void fazerSom() {
      System.out.println("O cachorro late");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal = new Animal(); // Classe pai
    animal.fazerSom(); // Chama o método fazerSom da classe Animal

    Animal cachorro = new Cachorro(); // Polimorfismo dinâmico
    cachorro.fazerSom(); // Chama o método fazerSom da classe Cachorro
  }
}
```
