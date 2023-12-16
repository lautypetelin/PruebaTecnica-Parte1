### Prueba Técnica para Postulante Trainee/Junior
## Sistema de Reserva de Asientos para Anfiteatro

Este proyecto sirve como una prueba técnica para evaluar las habilidades de candidatos a puestos de trainee/junior. Se busca evaluar el manejo lógico del desarrollo de la aplicación sin la necesidad de implementar interfaces gráficas ni utilizar bases de datos.

## Funcionalidades

1. **Cargar el Mapa de Asientos:**
   - Al iniciar el programa, todos los asientos estarán libres.
   - Se muestra el mapa de las filas y asientos con "L" para los asientos libres y "X" para los ocupados.

2. **Reserva de Asientos:**
   - Un asiento solo puede ser reservado si se encuentra en estado "L" (libre).
   - Si el asiento está ocupado ("X"), se permite al comprador elegir otro asiento disponible.
   - Al realizar una reserva, el estado del asiento pasa automáticamente a "X".

3. **Finalizar el Programa:**
   - Para finalizar el programa, se debe ingresar un valor específico.
   - No hay una cantidad exacta de veces que el programa pueda ejecutarse.

4. **Restricciones:**
   - Solo existen 10 filas y 10 asientos, y no se pueden seleccionar asientos fuera de estas numeraciones.
   - No se permite la "sobreventa"; es decir, no se pueden reservar más asientos de los disponibles.

## Uso Adicional (Extra)

- **Visualizar Asientos Libres:**
  - El sistema permite mostrar de forma gráfica los asientos libres.
  - Esta funcionalidad se proporciona mediante la salida por consola, mostrando el mapa con los asientos disponibles marcados de alguna manera (por ejemplo, "O").

## Contribuciones

¡Las contribuciones son bienvenidas! Si encuentras algún problema o tienes sugerencias de mejora, no dudes en abrir un problema o enviar una solicitud de extracción.
