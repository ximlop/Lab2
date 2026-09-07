# Lab #2: Parque universitario de Atracciones
## Análisis

1. **¿Qué propiedades y métodos tendrá cada clase?**\
  **Parque**\
    Propiedades: nombre, id, encargado, accesos. \
    Métodos: constructor, getters y setters de sus propiedades.

   **PuntoAcceso**\
    Propiedades: codigo, nombre, ubicacion, capacidadHora, estado, visitante. \
    Métodos: constructor, verificarPosicion, getters y setters. 

   **Visitante**\
    Propiedades: codigoEntrada, nombre, edad, cantidadAtraccion, puntos. \
    Métodos: constructor, getters y setters. 

3. **¿Qué tipo deben tener las propiedades y métodos de cada clase?**\
   **Parque**\
    nombre: String \
    id: int \
    encargado: String \
    accesos: PuntoAcceso[5] 
   
   Constructor: Parque(int, String, String) \
   Getters: String, int y PuntoAcceso[] \
   Setters: void

   **PuntoAcceso**\
    codigo: int \
    nombre: String \
    ubicacion: String \
    capacidadHora: int \
    estado: bool \
    visitante: ArrayList<Visitante>
    
    verificarPosicion(int): void \
    Constructor: PuntoAcceso(int, String, String, int, bool, ArrayList<Visitante>) \
    Getters: int, String, bool, Visitante y ArrayList<Visitante> \
    Setters: void

   **Visitante**\
    codigoEntrada: int \
    nombre: String \
    edad: int \
    cantidadAtraccion: int \
    puntos: int 
   
    Constructor: Visitantes(String, int, int, int, int) \
    Getters: int o String. \
    Setters: void.

3. **¿Cuál de las propiedades identificadas debe implementarse utilizando un arreglo básico? ¿Qué tipo de objetos almacenará y cuál será su tamaño?**
    - La propiedad accesos de Parque.
    - Almacena objetos PuntoAcceso.
    - Su tamaño es de 5 posiciones.

4. **¿Cuál de las propiedades identificadas debe implementarse utilizando un ArrayList? ¿Qué tipo de objetos almacenará?**\
    - La propiedad visitante de PuntoAcceso.
    - Almacena objetos de tipo Visitante.

5. **¿Cuáles deben ser los modificadores de visibilidad de los miembros en cada clase?**\
    - Las propiedades son privadas
    - Todos los constructores y métodos son públicos

6. **¿Qué parámetros serán requeridos por los métodos en sus clases?**\
   **Parque**\
    Constructor: id, nombre, encargado \
    setNombreParque: nombre \
    setCodigoId: id \
    setNombreEncargado: nombre \
    setAccesos: accesos

   **PuntoAcceso**
    Constructor: codigo, nombre, ubicacion, capacidadHora, estado \
    verificarPosicion: posicion \
    setCodigo: codigo \
    setNombrePuntoAcceso: nombre \
    setUbicacion: ubicacion \
    setCapacidadHora: capacidadHora \
    setEstado: estado \
    setVisitante: visitante

   **Visitante**
    Constructor: nombre, codigoEntrada, edad, cantidadAtraccion, puntos \
    setCodigoEntrada: codigoEntrada \
    setNombreVisitante: nombre \
    setEdad: edad \
    setCantidadAtraccion: cantidadAtraccion \
    setPuntos: puntos

8. **¿Cómo proveerá de valores iniciales a sus objetos? ¿Qué valores deberán validarse antes de modificar el estado de los objetos?**\
sdfkslkskfkslf

9. **¿Cómo determinará si una posición del arreglo contiene un punto de acceso o contiene null?**\
sddsd

10. **¿Cómo realizará las operaciones de búsqueda, modificación y eliminación dentro delArrayList?**\
sddsdss

11. **¿Qué situaciones del programa pueden producir excepciones? Identifique qué excepciones deberán manejarse y en qué partes del programa utilizará try-catch y finally.**\
sdsdsddsd
