# Inheritance: herencia de clases

## Jerarquia en el programa

- Tenemos la clase Empleado que es la superclase de las dos clases EmpleadoTiempoCompleto y EmpleadoPorHoras

## Polimorfismo

- Si llamamos al mismo método, automaticamente sabe si debe mostrar información correspondiente a un empleado a tiempo completo o uno de por horas

## Preguntas de reflexión

### 1. ¿Por qué es útil definir métodos con el mismo nombre en distintas clases?

- Por que, gracias al polimorfismo, podemos definir métodos con un cuerpo distinto

### 2. ¿Qué ventaja aporta el uso de super frente a duplicar código?

- Reduce la cantidad de código a escribir y lo hace más leíble

### 3. ¿Cómo mejora el polimorfismo la escalabilidad del programa?

- Haciendo un override a los métodos cualesquiera; modificandolo como se quiera para una implementación distinta

### 4. Si añadieras un nuevo tipo de empleado, ¿qué cambios deberías realizar en la jerarquía?

- Mínimos: la nueva clase del nuevo tipo de empleado solo necesita extender de la clase base de empleado

`public class NuevoTipoEmpleado extends Empleado`
