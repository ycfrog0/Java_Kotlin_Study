# 1000
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = A+B;
        System.out.print(C);
    }
}
```
# 2741
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        for(int i = 1; i <= A; i++){
            System.out.println(i);
        }
    }
}
```
# 2442
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        for(int i = 1; i <= A; i++) {
            System.out.print(" ".repeat(A-i));
            System.out.println("*".repeat(2*i-1));
        }
    }
}
```
