# SimpleDagger2Example
Example implementation of Dagger2 with steps


# Steps:

0. Create classes
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
