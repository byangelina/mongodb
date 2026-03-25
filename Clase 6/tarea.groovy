


mongo json -----------------------------------------------------------------------------------------------------------------


¿Para qué se utiliza MongoDB?
Aplicaciones web modernas: Perfecto cuando necesitas respuestas rápidas y datos que cambian de forma
(perfiles, settings, catálogos, contenidos). Iteras sin andar migrando tablas a cada cambio.

En lugar de tablas con filas y columnas, aquí trabajas con documentos (similares a objetos JSON)
formados por pares clave-valor. Estos viven dentro de colecciones (lo que en SQL serían las “tablas”,
a grandes rasgos).

Sistemas de análisis de datos: Si trabajas con Big Data, logs, eventos o datos semiestructurados,
MongoDB encaja por su ingesta ágil y sus agregaciones. Equipos de IA o analítica de comportamiento
lo agradecen.

IoT (Internet of Things): Miles de dispositivos enviando señales y métricas dispares…
MongoDB traga esa variedad y escala para guardar y consultar a lo grande.


COMANDOS -------------------------------------------------------------------------------------------------------------------

27017 // entrar al servidor 

use zoologico // crear base de datos

to db zoologico 

show dbs // verificar que la base de datos existe

db.zoologico.insert({ // crear un documento
                      // Un documento tiene la siguiente estructura:
                      // {dato, dato, dato, dato,…}
              
})

db.createCollection(< nombre >, < opciones >) // crear una coleccion

db.usuarios.find() // para ver el contenido de la coleccion

db.<colección>.find().pretty() //  es una variante del comando find y presenta los resultados de una forma más legible

show collections // ver las colecciones

db.miColeccion.update({nombre:"Juan"}, {$set: {edad:27}}) // update() se utiliza para actualizar documentos en una colección.

db.collection.updateOne({ name: "Harry" }, { $set: { age: 50 } }) // updateOne o updateMany para modificar documentos existentes. 

db.miColeccion.remove({nombre:"Juan"}) // remove() se utiliza para eliminar documentos de una colección.

db.stats() // proporciona estadísticas sobre la base de datos, como el tamaño y la cantidad de colecciones.





