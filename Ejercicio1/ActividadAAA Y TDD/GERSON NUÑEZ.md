
Comentarios:

Prueba Unitaria WordTest: La prueba unitaria se encarga de probar el comportamiento de la clase Word, especialmente la lógica relacionada con la adivinanza de letras y el cálculo del puntaje. En esta primera prueba, nos aseguramos de que cuando se ingresa una letra incorrecta, la puntuación correspondiente sea devuelta correctamente.

Clase Word: La clase Word representa una palabra que se debe adivinar. Tiene un constructor que toma la palabra correcta como parámetro y un método guess para realizar una suposición y calcular la puntuación.

Clase Score: La clase Score representa el puntaje de una suposición. En este momento, solo devuelve si la letra adivinada está incorrecta, pero se puede ampliar para manejar más casos en el futuro.

Enum Letter: La enumeración Letter define los posibles puntajes que puede tener una letra: incorrecta, parcialmente correcta o completamente correcta. Esta elección simplifica la lógica y la comprensión del código.

![image](https://github.com/MarceloLZR/PracticaCalificada1-CC3S2/assets/135175818/7a8d8dc9-f6bf-4209-9602-b50b4931bdd8)

