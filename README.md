# Java Object-Oriented Programming — University Labs

A collection of my Java coursework from Electrical and Electronics Engineering at UNAM. These exercises document my progression from console programs to object-oriented design, exception handling, file operations, and concurrency.

**Java · Object-Oriented Programming · University coursework**

## Explore the labs

| Lab | Focus | Original repository |
| --- | --- | --- |
| [1](labs/practice-01) | Hello World | `MPOOP1` |
| [2](labs/practice-02) | Console input and control flow | `MPOOP2` |
| [3](labs/practice-03) | Collections and core APIs | `MPOOP3` |
| [4](labs/practice-04) | Classes and objects | `MPOOP4` |
| [5](labs/practice-05) | Encapsulation and composition | `MPOOP5` |
| [5.1](labs/practice-5.1) | Composition — extended version | `MPOOP5.1` |
| [6](labs/practice-06) | Methods and Javadoc | `MPOOP6` |
| [7](labs/practice-07) | Inheritance | `MPOOP7` |
| [8](labs/practice-08) | Abstraction and interfaces | `MPOOP8` |
| [9](labs/practice-09) | Exception handling | `MPOOP9` |
| [10](labs/practice-10) | File input and output | `MPOOP10` |
| [11](labs/practice-11) | Multithreading | `MPOOP11` |

Each folder contains its own README and original source files. Lab 05.1 is retained as a distinct variant of lab 05.

## Run a lab

Use a Java Development Kit (JDK). Compile each lab separately because several exercises define classes with the same names.

For example, from the repository root:

```bash
cd labs/practice-04
javac -d build *.java
java -cp build Main
```

Labs 01 and 02 use packages. After compiling with `javac -d build *.java`, use:
- Lab 01: `java -cp build com.mycompany.mpoo1.HolaMundo`
- Lab 02: `java -cp build com.mycompany.mpoop2.HolaMundo`

For lab 11, compile both the main file and its thread classes:
```bash
cd labs/practice-11
javac -d build Main.java hilos/*.java
java -cp build Main
```

Lab 10 reads and writes files relative to the working directory; run it from its own folder. Example records are academic sample data.

## About this collection

The Java source and sample data were copied without changes. Presentation documentation was adapted to the new structure. Compiled classes, JARs, generated Javadoc, IDE metadata, and duplicate copies previously staged in MPOOP1 were excluded.

This is a migration of the current source snapshots, not a merge of the original commit histories. The original repositories are private, archived backups retaining their histories and excluded artifacts. Public visitors can access all migrated source files directly in this collection. See the [migration record](docs/migration.md) and [file manifest](docs/migration-manifest.json) for provenance and source blob hashes.

**Validation:** source-file integrity is checked against Git blob hashes. Compilation and runtime behavior have not been verified in this environment, which has no JDK installed.

The larger final Java project remains a separate portfolio project: [ProyectoFinalMPOO](https://github.com/SantiagoGlez12/ProyectoFinalMPOO).
