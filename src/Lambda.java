import java.nio.Buffer;
import java.util.function.*;

/**
 * Created by chris on 06/12/2016.
 */
public class Lambda {
    public static void main(String[] args) {
        new Lambda().launch();
    }

    private void launch() {
        Supplier supplier = () -> 23.67;
        System.out.println(supplier.get());

        IntUnaryOperator intUnaryOperator = x -> x * 5;
        System.out.println(intUnaryOperator.applyAsInt(7));

        BiFunction<String, String, Integer> biFunction = (x, y) -> x.length() - y.length();
        System.out.println(biFunction.apply("Cucumber", "Egg"));

        Proc proc = () -> {process();};
        proc.process();

        //BiFunction<Buffer, Integer, Buffer> function1 = Buffer::position;
        // BiFunction<Buffer, Integer, Buffer> function1 = (b, n) -> b.position(n);
        BiFunction<Buffer, Integer, Buffer> function1 = (buffer, newPosition) -> buffer.position(newPosition);

        //Function<Buffer, Integer> function2 = Buffer::position;
        // Function<Buffer, Integer> function2 = b -> b.position();
        Function<Buffer, Integer> function2 = (buffer) -> buffer.position();
    }

    void process() {
        System.out.println("This is a process");
    }

    public interface Proc {
        void process();
    }
}