## The "static" keyword

The `static` keyword allows us to call a method or variable that belong to a class **without** having to instantiate that class. That allows for resource sharing beetween instances and direct access to "members" without having to create new objects.

## Examples

### Static Variables

```Java
public class Example {
    public static int staticVar = 10;
}

int value = Example.variavelEstatica;
```

- The code above is completely valid and the variable `value` is equal to 10.

---

### Static Methods

```Java
public class Example {
    public static void staticMethod() {
        System.out.println("You can access me without instantiating the class.")
    }
}

Example.staticMethod();
```

- The code above will simply print "You can access me without instantiating the class."
