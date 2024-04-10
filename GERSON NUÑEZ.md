Se subieron lor archivos de EJERICIO 2  en rama master

Las pruebas unitarias existentes en la clase SimpleAgedCacheTest están verificando varios aspectos del comportamiento de la clase SimpleAgedCache. Estos incluyen:

Verificar si el cache está vacío o no (isEmpty()).
Confirmar el tamaño del cache (size()).
Comprobar si un elemento se puede obtener correctamente desde el cache (get()).
Validar que el cache elimina correctamente los elementos que han expirado (getExpired()).


Al correr la prueba hay un error, en la prueba getExpired() de la clase SimpleAgedCacheTest, pues se espera que después de que ha expirado un elemento en el caché, 
el tamaño del caché debe reducirse a 1. Sin embargo, el resultado obtenido indica que el tamaño del caché no se ha reducido correctamente después de la expiración del elemento,
ya que sigue siendo 2 en lugar de 1.


![image](https://github.com/MarceloLZR/PracticaCalificada1-CC3S2/assets/135175818/79208832-c95d-4fad-91d1-7f7a70b64205)
