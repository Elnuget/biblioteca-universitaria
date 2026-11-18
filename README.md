# 📚 Biblioteca Universitaria

Proyecto base con **Apache Maven** y **Java 17** para el taller práctico de la asignatura **Calidad de Software**.

---

## 📋 Información Académica
- **Institución:** Universidad de Las Américas (UDLA)
- **Facultad:** Facultad de Ingeniería y Ciencias Aplicadas (FICA)
- **Carrera:** Ingeniería de Software
- **Asignatura:** Calidad de Software (`ISWZ3208` - NRC `5503 / 5504`)
- **Estudiante:** Carlos Alberto Angulo Pizarro
- **Docente:** Ing. Guillermo Ávila
- **Período:** 2026 – 2027 (2027-10)

---

## 🛠️ Stack Tecnológico
- **Lenguaje:** Java 17 (OpenJDK 17 Temurin)
- **Gestor de dependencias y construcción:** Apache Maven 3.x
- **Framework de Pruebas Unitarias:** JUnit 5 (Jupiter 5.10.2)
- **Compilador Maven:** `maven-compiler-plugin 3.11.0`
- **Ejecutor de Pruebas:** `maven-surefire-plugin 3.2.5`

---

## 📁 Estructura del Proyecto

```text
bibliotecauniversitaria/
├── pom.xml                                      # Configuración Maven (dependencias, plugins, Java 17)
├── README.md                                    # Documentación del proyecto
├── .gitignore                                   # Filtros de exclusión Git (target, IDEs, etc.)
└── src/
    ├── main/
    │   ├── java/
    │   │   └── ec/edu/udla/biblioteca/
    │   │       └── App.java                     # Punto de entrada / lógica principal
    │   └── resources/                           # Recursos y propiedades de la aplicación
    └── test/
        ├── java/
        │   └── ec/edu/udla/biblioteca/
        │       └── AppTest.java                 # Pruebas unitarias JUnit 5
        └── resources/                           # Recursos específicos para pruebas
```

---

## 🚀 Comandos de Construcción y Ejecución (Maven)

### 1. Compilar el proyecto
```bash
mvn clean compile
```

### 2. Ejecutar las pruebas unitarias
```bash
mvn test
```

### 3. Empaquetar el artefacto (.jar)
```bash
mvn clean package
```

### 4. Ejecutar la aplicación principal
```bash
mvn exec:java -Dexec.mainClass="ec.edu.udla.biblioteca.App"
```
o ejecutando directamente el bytecode compilado:
```bash
java -cp target/classes ec.edu.udla.biblioteca.App
```
