# 1000
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int C = A+B;
        System.out.print(C);
    }
}
```
파이썬과 다르게 Scanner를 사용하여 입력을 받을수 있음
이외엔 비슷한 듯함
# 2741
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        for(int i = 1; i <= A; i++){
            System.out.println(i);
        }
    }
}
```
반복문은 C++에서 사용하는 방식과 같음
# 2442
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        for(int i = 1; i <= A; i++) {
            System.out.print(" ".repeat(A-i));
            System.out.println("*".repeat(2*i-1));
        }
    }
}
```
문자의 곱에서 *가 아닌 repeat을 사용함
