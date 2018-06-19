# Patterns in Kotlin

This project showcases the usage of _factory method_, _proxy class_ and _strategy_ patterns.

### Factory method
**Factory method** is a creational pattern used to delegate complex entity building to factory.
For example, MerchandiseFactory can create merchandise, be it shirts, caps or hoodies. 
The most awesome feature is that factories can be used to create mock objects to make unit testing less painful.

Factory method is implemented in `factory_method` package.

### Proxy class
**Proxy class** is a class which implements the same interface as the source class and can be used as a substitution for the source class.
Services should not really care whether they are using a proxy or a real object.
Main advantage is that Proxy class implements functionality that is not needed in the source class, but is needed in the current program scope.
For example, source class is a regular `File` class. Is has `path` and `content` properties.
First benefit of using a proxy class is to optimize resources while interacting with the `File` class. 
If the user does not need the contents of the file, then the contents will not be loaded at all. 
Proxy class can still return file contents, but it will be loaded only when requested and only once (kind of lateinit).
Proxy classes are widely used to store nested entities in ORMs e.g. Doctrine, Hibernate, well, all of them.
Handy usecases: mocking mechanism  for unit tests and access layers (load contents by password only?).

Proxy class is implemented in `proxy` package.

### Strategy
**Strategy** is a behavioural pattern which isolates concrete algorithm implementations from the user class.
The user class relies on a single method, but the method implementation is different depending on the context.
This way adding new algorithms and managing their usage in different cases is much easier. 

Strategy is implemented in `strategy` package. 
