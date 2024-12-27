package Section_6_Control_Flow;

public class _10_The_Class_The_Object_Static_Instance_Fields_and_Methods {

    /*
        Local variables are a way to store and manipulate temporary data.

        In addition to local variables, we can set up data to be defined and used as part of a class or an object.

        First, attributes on classes are another way to store data.

        Second, Introduction to the static methods on the wrapper classes, which are classes we previously looked at.
         We haven't used any methods on these classes yet.

        These methods will help parse strings into numeric values.

        And finally, an introduction to a special class for reading input, which we will be using in the last part of
         this section to create an interactive program.

        **A Class:

            - It Can be described as a custom data type.

            - A special code block that contains methods.

            - Compared to a cookie cutter or a template

       **An Object:

            - It Is called an instance of a particular class.

            - Is the individual cookie itself. You may decorate each cookie differently.

       The creation of an object...aka 'instantiating a class'.

       ** Declaring and instantiating a new object from a Class:

            - The most common way to create an object is to use the 'new' keyword

            - The 'new' keyword creates an instance of a class, and you can optionally pass data when creating that
            instance to set up data on that object.

            - Looking at the String, it's actually a class. But it holds a special place in the Java language, becasue
            we can create a String just by using a literal which we've seen.

                String s = "hello";

                but we could also use new.

                String s = new String("hello");

        ** Static and instance fields

            Static Field:
                - Requires 'static' keyword when declared on the class.
                - Value of the field is stored in special memory location and only in one place.
                - Value is accessed by:
                    ClassName.fieldname

                    Example: Integer.MAX_VALUE

            Instance Field:
                - Omits 'static' keyword when declared on the class.
                - Value of the field is not allocated any memory and has no value until the object is created.
                - Value is accessed by ObjectVariable.fieldname

                    Example: myObjet.myFieldName
                    myObject is our variable name for an object we create and myFieldName is an attribute on the class.


            Static Method:
                - Requires 'static' keyword when declared on the class.
                - Method is accessed by ClassName.methodName

                    Example:
                        - Integer.parseInt("123");

                        - A method called parseInt is called directly from the Class, Integer

            Instance Method:
                - Omits 'stati' keyword when declared on the class.
                - Method is accessed by ObjectVariable.methodName

                    Example:
                        - "hello".toUpperCase();

                        - A method called toUpperCase is called on the instance of a String with value "hello"




     */

}
