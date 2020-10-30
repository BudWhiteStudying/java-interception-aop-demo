#### Java execution interception through AspectJ
This simple POC demonstrates the interception of the execution of a method through AspectJ load-time weaving (LTW).

The intercepted method is defined in an [external library](https://github.com/BudWhiteStudying/my-sample-library) hence AspectJ needs to weave its code into the library at load-time.

The interception logic is defined in the `BeforeAndAfterLoggingAspect` class, the weaving configuration resides in the `aop.xml` configuration file.

###### Known issues
Sometimes the application fails as soon as started, saying it cannot resolve the aspect. The issue is typically solved by repeating `mvn clean install`.