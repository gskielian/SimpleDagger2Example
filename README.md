# SimpleDagger2Example
A basic example of Dagger2 with steps


# Steps:

0. setup your app level build.gradle
1. @Inject at constructors to allow them to
participate in DI
2. create @module class with
  i) which class to pass into the requestor
  ii) how to construct that class
3. create @component for getting Big Composite Class from Dagger
4. `ComponentName componentName = DaggerComponentName.create()`
5. `BigCompositeClass = componentName.getBigCompositeClass()`
6. use big composite class as you would normally

# Also enable Annotation Processing by:

1. closing all projects
2. going to settings -> Annotation processing
3. Invalidating Caches and Restarting

# Project Description

#### MainActivity.class

Simply shows how to get a Big Composite Class (in this case "BigClass") from Dagger2.

#### Big Class

Compsosite Class which Depends on ClassA and ClassB

#### ClassA

Simple class with two `int` fields, and getters and setters

#### ClassB

Simple class with two `String` fields, and getters and setters


#### AlphabetModules

For ClassA, ClassB, and BigClass, describes how the classes are built -- and more importantly for testing, __which__ classes are passed in (i.e. test classes or production classes).

Notice how BigClass's @Provides utilizes the @Provides for ClassA and ClassB

#### AlphabetComponent

You may have a test module and a production module, the `@Component(module=<whichmodule>.class` <whichmodule> section describes which of these to use, and decided at compile time.

The method contained gets used by Dagger2, which writes it's own class to create -- in this case -- a `DaggerAlphabetComponent` class.  In general the name dagger makes will be Dagger + <YourComponentName>.



