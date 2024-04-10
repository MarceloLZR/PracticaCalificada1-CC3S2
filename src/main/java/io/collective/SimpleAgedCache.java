package io.collective;

import java.time.Clock;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class SimpleAgedCache {

    // Mapa que almacena las entradas del caché
    private final Map<String, CacheEntry> cache;

    // Reloj para manejar el tiempo
    private final Clock clock;

    // Constructor predeterminado que utiliza el reloj del sistema por defecto
    public SimpleAgedCache() {
        this.cache = new HashMap<>();
        this.clock = Clock.systemDefaultZone();
    }

    // Constructor que permite proporcionar un reloj personalizado
    public SimpleAgedCache(Clock clock) {
        this.cache = new HashMap<>();
        this.clock = clock;
    }

    // Método para agregar un elemento al caché con una clave, un valor y una duración en milisegundos
    public void put(String key, Object value, long durationMillis) {
        // Calcula el tiempo de expiración sumando la duración al tiempo actual obtenido del reloj
        Instant expirationTime = clock.instant().plusMillis(durationMillis);
        // Crea una nueva entrada de caché con el valor y el tiempo de expiración y la coloca en el mapa de caché
        cache.put(key, new CacheEntry(value, expirationTime));
    }

    // Método para obtener un elemento del caché dado su clave
    public Object get(String key) {
        // Obtiene la entrada del caché asociada con la clave
        CacheEntry entry = cache.get(key);
        // Verifica si la entrada no es nula y si no ha expirado según el tiempo actual obtenido del reloj
        if (entry != null && !entry.isExpired(clock.instant())) {
            // Si la entrada no ha expirado, devuelve su valor
            return entry.getValue();
        }
        // Si la entrada es nula o ha expirado, devuelve null
        return null;
    }

    // Método para verificar si el caché está vacío
    public boolean isEmpty() {
        return cache.isEmpty();
    }

    // Método para obtener el tamaño del caché
    public int size() {
        return cache.size();
    }

    // Clase interna que representa una entrada individual en el caché
    private static class CacheEntry {
        // Valor de la entrada
        private final Object value;
        // Tiempo de expiración de la entrada
        private final Instant expirationTime;

        // Constructor para inicializar el valor y el tiempo de expiración de la entrada
        public CacheEntry(Object value, Instant expirationTime) {
            this.value = value;
            this.expirationTime = expirationTime;
        }

        // Método para obtener el valor de la entrada
        public Object getValue() {
            return value;
        }

        // Método para verificar si la entrada ha expirado dado el tiempo actual
        public boolean isExpired(Instant currentTime) {
            return currentTime.isAfter(expirationTime);
        }
    }
}
