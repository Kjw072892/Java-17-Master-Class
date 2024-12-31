package Section_7_OOP_Part_1_Inheritance;

public class _1_Intro_To_Class_And_Objects {
    /*
        What is OOP:

            OOP is a way to model real-world objects as software objects which contain both data and code

        Class-based Programming:

            Starts with classes which become the blueprints for objects.

        State (ant):

           I could also describe animate objects like people, or animals, or even insects like an ant.

           The state might be:
                The age.
                The number of legs.
                The conscious state.
                Whether the ant is sleeping or is awake.

         Behavior (computer):

                In addition to state, objects may also have behavior or actions that can be performed by the object,
                or upon the object.

                Behavior, for a computer, might be things like:
                    Booting up.
                    Shutting down.
                    Beeping or outputting some for of sound.
                    Drawing something on the screen, and so on.

        State and Behavior:

            Modeling real-world objects as software objects is a fundamental part of Object-Oriented Programming.

            A software object stores its state in fields, which can also be call variables or attributes.

            Objects expose their behavior with methods

            Think of a class as a template or a blueprint for creating objects.

         The class as the blueprint:

            The class describes the data (fields), and the behavior (methods), that are relevant to the real-world
            object we want to describe. AKA Class members.

            A class member can be a field or a method, or some other type of dependent element.

            If a field is static, there is only one copy in memory, and this value is associated with the class or
            template itself.

            If a field is not static, it's called an instance field, and each object may have a different value
            stored for this field.

            A static method can't be dependent on any one object's state, so it can't reference any instance members.

            In other words, any method that operates on instance fields needs to be non-static.


        Access Modifiers for the class:

            A class is said to be a top-level class if it is defined in the source code file and not ecnlosed in the
            code block of another class, type, or method.

            A top-level class has noly two valid access modifier options: public or none.

                public: Public means any other class in any package can access this class.

                      : When the modifier is omitted, this has special meaning, called package access, meaning the
                      class is accessible only to classes in the same package.


          Access modifiers for class members:

                public: public means any other class in any package can access this class.

                protected: protected allows classes in the same package, and any subclasses in other packages, to have
                            access to the member.

                        : When the modifier is omitted, this has a special meaning, called package access, meaning the
                            member is accessible only to classes in the same package.

                private: private means that no other class can access this member


           Encapsulation:

                Has two meanings:
                    1) the bundling of behavior and attributes on a single object.
                    2) The practice of hiding fields and some methods of public access.

     */
}

