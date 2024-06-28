# Proyecto Pokemon
Proyecto diseñado con el lenguaje de Java para representar la serie de Pokemon utilizando elementos de la programación orientada a objetos, en este proyecto podemos observar el uso de tanto herencia, polimorfismo, interfacez y también una agregación.

## Relación entre sus clases.
- **Pokemon:** representa la clase padre donde se encuentran todos los atributos de las clases hijas, así como metodos con polimorfismo para que cada hijo los implemente como es debido, esta clase también es abstracta lo que nos impide instanciar un objeto como tal de ella.
- **IAgua:** Es la interfaz para la clase Agua, donde en ella se encuentran metodos que serán sobreescritos en la clase Agua, al igual que con los metodos de Pokemon.
- **IFuego:** Es la interfaz para la clase Fuego, donde en ella se encuentran metodos que serán sobreescritos en la clase Fuego, al igual que con los metodos de Pokemon.
- **IElectrico:** Es la interfaz para la clase Electrico, donde en ella se encuentran metodos que serán sobreescritos en la clase Electrico, al igual que con los metodos de Pokemon.
- **IPlanta:** Es la interfaz para la clase Planta, donde en ella se encuentran metodos que serán sobreescritos en la clase Planta, al igual que con los metodos de Pokemon.
- **Agua:** Clase hija de Pokemon y que contiene a la interfaz de IAgua, en esta clase cuenta con sus constructores que permite crear objetos de este tipo usando los atributos de Pokemon y sobreescribe los metodos definidos en la clase Pokemon y la interfaz IAgua.
- **Fuego:** Clase hija de Pokemon y que contiene a la interfaz de IFuego, en esta clase cuenta con sus constructores que permite crear objetos de este tipo usando los atributos de Pokemon y sobreescribe los metodos definidos en la clase Pokemon y la interfaz IFuego.
- **Electrico:** Clase hija de Pokemon y que contiene a la interfaz de IElectrico, en esta clase cuenta con sus constructores que permite crear objetos de este tipo usando los atributos de Pokemon y sobreescribe los metodos definidos en la clase Pokemon y la interfaz IElectrico.
- **Planta:** Clase hija de Pokemon y que contiene a la interfaz de IPlanta, en esta clase cuenta con sus constructores que permite crear objetos de este tipo usando los atributos de Pokemon y sobreescribe los metodos definidos en la clase Pokemon y la interfaz IPlanta.
- **Equipo:** En esta clase vemos el concepto de agregación pues con un atributo de vector de 6 posiciones pueden agregarse 6 objetos creados previamente en el main

## Futuros Avances.
En un futuro me gustaría implementar la clase batalla para que funcione como una agregación en la cual pueda agregar dos pokemon y como sucede en los videojuegos ponerlos a pelear.


