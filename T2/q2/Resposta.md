# Herança
É quando uma classe herda propriedades e métodos de uma classe pai. Por exemplo:
- Classe animal: Representa a generalização de animais
- Classe gato: Herda da classe animal, é uma animal, porém em sua espeficicação é um gato.

# Composição
É um conceito semelhante ao de herança, porém ao invés de herdar as propriedades e métodos da classe pai, a classe é uma propriedade do objeto e é necessariamente dependente.
- Classe animal: Representa a generalização de animais
- Classe gato: É especifica, o objeto continua representando um animal, porém o acesso às propriedades de animal é feita através da propriedade `Animal` do objeto gato.

# Agregação
Semelhante à composição em estrutura, onde a classe associada é uma propriedade do objeto pai. Representa uma relação entre objetos, onde um `pertence` ao outro (diferentemenete de composição e herança, onde um `é` o outro)
- Classe Pessoa: Classe pai com seus atributos
- Classe endereço: Classe associada à pessoa. Pessoa não depende de endereço nem endereço depende de pessoa. Um não `é` o outro, porém uma pessoa pode `ter` um endereço e um endereço pode não `pertencer` à uma pessoa.