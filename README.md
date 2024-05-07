# Natural Reserve (Sistema de Gestión de reserva natural de animales)

Práctica **opcional** herencia SINGLE_TABLE, TABLE_PER_CLASS Y JOINED y relaciones One-to-One, One-To-Many/Many-To-One y Many-To-Many en JPA

**(Solución en código)**

#### Requisitos
1. **Herencia**:
    - Crea una jerarquía de clases para diferentes tipos de animales usando las tres estrategias de herencia.
    - `Animal` como clase base, `Mamífero` y `Ave` como subclases.
2. **Relaciones**:
    - Cada animal tiene exactamente un cuidador favorito (`One-to-One`).
    - Cada cuidador puede ser responsable de varios animales (`One-to-Many` y `Many-to-One`).
    - Los animales pueden participar en múltiples espectáculos, y cada espectáculo incluye varios animales (`Many-to-Many`).

#### Esquema de Clases
- **Animal** (Clase base para herencia)
- **Mamífero**
- **Ave**
- **Cuidador** (Relacionado con Animal)
- **Espectáculo** (Relacionado con Animal)

#### Implementación

1. **Herencia `SINGLE_TABLE` para `Animal`**:
    - Usa una columna discriminadora para diferenciar entre `Mamífero` y `Ave`.

2. **Herencia `TABLE_PER_CLASS` para una entidad `Empleado`**:
    - Cuidadores como subclase.

3. **Herencia `JOINED` para una entidad `Evento`**:
    - Espectáculos como subclase.

4. **Relaciones**:
    - `One-to-One` entre `Animal` y `Cuidador`.
    - `Many-to-One`/`One-to-Many` entre `Cuidador` y `Animal`.
    - `Many-to-Many` entre `Animal` y `Espectáculo`.
