# Array

### Characteristics:

#### Fixed Size: The size of an array is fixed once it is created. You cannot increase or decrease its size dynamically.

#### Type-Specific: Arrays are type-specific, meaning they can only store elements of a single type (e.g., int[], String[]).

#### Performance: Accessing elements in an array is very fast due to direct indexing (O(1) time complexity).

#### Memory Allocation: Arrays require contiguous memory allocation which can lead to higher memory usage if the array size is large and not all elements are used.

### Use Cases:

#### Static Data: When the number of elements is known beforehand and does not change, such as storing the days of the week.

#### Performance-Critical Applications: When performance is crucial and the overhead of dynamic resizing is unacceptable, such as in real-time systems or performance-sensitive applications.

#### Multidimensional Data: For handling multidimensional data, such as matrices in scientific computations.

# ArrayList

### Characteristics:

#### Dynamic Size: ArrayList can grow and shrink dynamically as elements are added or removed.

#### Type-Specific (Generics): ArrayList uses generics to allow any type of object (e.g., ArrayList<Integer>, ArrayList<String>).

#### Ease of Use: Provides many useful methods for manipulating the collection (e.g., add(), remove(), contains(), size()).

#### Performance: Accessing elements is fast (O(1) time complexity), but adding/removing elements can be slower due to possible resizing (O(n) in the worst case).

### Use Cases:

#### Dynamic Data: When the number of elements is not known beforehand or changes frequently, such as a list of users in a chat application.

#### Ease of Manipulation: When you need to frequently add, remove, or check for the presence of elements, such as managing a list of tasks in a to-do application.

#### Collections API: When you need to leverage the Java Collections Framework which provides powerful utilities and algorithms for data manipulation.

| Feature                  | Array          | ArrayList         |
| ------------------------ | -------------- | ----------------- |
| **Size**                 | Fixed          | Dynamic           |
| **Type**                 | Type-specific  | Generic           |
| **Performance (Access)** | O(1)           | O(1)              |
| **Performance (Resize)** | Not applicable | O(n) (resize)     |
| **Memory Allocation**    | Contiguous     | Non-contiguous    |
| **Usage Complexity**     | Low            | High (richer API) |

## Arrays in Java

### 1. Declaring an Array

#### You can declare an array by specifying the type of its elements.

```java
int[] numbers; // Declares an array of integers
String[] names; // Declares an array of strings
```

### 2. Initializing an Array

#### You can initialize an array at the time of declaration or later.

```java
// Initialize at declaration
int[] numbers = new int[5]; // Creates an array of integers with 5 elements

// Initialize with values
int[] primes = {2, 3, 5, 7, 11};

// Initialize later
numbers = new int[]{10, 20, 30, 40, 50};
```

### 3. Accessing Array Elements

#### You can access array elements using their index, which starts from 0.

```java
int firstPrime = primes[0]; // Access the first element
int secondPrime = primes[1]; // Access the second element

primes[2] = 17; // Modify the third element
```

### 4. Looping Through an Array

#### You can loop through an array using a for loop or an enhanced for loop.

```java
// Using a for loop
for (int i = 0; i < primes.length; i++) {
System.out.println(primes[i]);
}

// Using an enhanced for loop
for (int prime : primes) {
System.out.println(prime);
}
```

# ArrayList in Java

### 1. Importing ArrayList

#### You need to import the ArrayList class from the java.util package.

```java
import java.util.ArrayList;
```

### 2. Declaring and Initializing an ArrayList

#### You can declare and initialize an ArrayList to hold specific types of objects.

```java
ArrayList<Integer> numbers = new ArrayList<>(); // Creates an ArrayList for integers
ArrayList<String> names = new ArrayList<>(); // Creates an ArrayList for strings
```

### 3. Adding Elements

#### You can add elements to an ArrayList using the add method.

```java
numbers.add(10);
numbers.add(20);
numbers.add(30);
```

#### 4. Accessing Elements

#### You can access elements using the get method and their index.

```java
int firstNumber = numbers.get(0); // Access the first element
int secondNumber = numbers.get(1); // Access the second element

numbers.set(2, 40); // Modify the third element
```

### 5. Removing Elements

#### You can remove elements using the remove method.

```java
numbers.remove(1); // Removes the element at index 1

numbers.clear(); // Removes all elements
```

### 6. Looping Through an ArrayList

#### You can loop through an ArrayList using a for loop, an enhanced for loop, or an iterator.

```java

// Using a for loop
for (int i = 0; i < numbers.size(); i++) {
System.out.println(numbers.get(i));
}

// Using an enhanced for loop
for (int number : numbers) {
System.out.println(number);
}

// Using an iterator
Iterator<Integer> iterator = numbers.iterator();
while (iterator.hasNext()) {
System.out.println(iterator.next());
}
```

### Complete Example

#### Here's a complete example demonstrating the use of arrays and ArrayLists:

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Array example
        int[] primes = {2, 3, 5, 7, 11};
        System.out.println("Array elements:");
        for (int prime : primes) {
            System.out.println(prime);
        }

        // ArrayList example
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("ArrayList elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Accessing and modifying elements
        int firstPrime = primes[0];
        int secondNumber = numbers.get(1);
        primes[2] = 17;
        numbers.set(2, 35);

        System.out.println("Modified Array elements:");
        for (int prime : primes) {
            System.out.println(prime);
        }

        System.out.println("Modified ArrayList elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Removing elements from ArrayList
        numbers.remove(1);
        System.out.println("ArrayList elements after removal:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
```
