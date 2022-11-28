import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        fileWriter();
        fileReader();
    }
    public static void fileWriter() {
        try (FileWriter fileWriter = new FileWriter("text");) {
            fileWriter.write("""
                    A a
                    B b
                    C c
                    D d
                    E e
                    F f
                    G g
                    H h
                    I i
                    J j
                    K k
                    L l
                    M m
                    N n
                    O o
                    P p
                    Q q
                    R r
                    S s
                    T t
                    Y y
                    V v
                    W w
                    X x
                    Y y
                    Z z
                    """);
            fileWriter.append("""
                    0
                    1
                    2
                    3
                    4
                    5
                    6
                    7
                    8
                    9
                    """);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void fileReader() {
        try (FileReader file = new FileReader("text");) {
            Scanner scanner = new Scanner(file);
            int counter = 1;
            while (scanner.hasNextLine()) {
                System.out.println(counter+": "+scanner.nextLine());
                counter++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}