# Serializable-interface

# Some important pointers:
1. When we write an object into file, it gives us a compile time exception : IO Exception
2. When we read an object from file, it gives us a compile time exception : ClassNotFound Exception and IO Exception
3. If you don't want an attribute to be serialized, you can make it transient with transient keyword
4. If you don't want an attirbute to be serialized, you can also make it static.
5. But there is a difference , that appears when you read the objects from file
6. If an attribute is transient, it will surely not go to file, and when you try to read it, null or defualt value will come against the catching attribute
7. If an attribute is static, on reading, you will get the same attribute details from the class.
