package lesson1.practic;

import lombok.*;
import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

/*@Getter
@Setter
@EqualsAndHashCode
@ToString
*/
@Data
@AllArgsConstructor
public abstract class Fruit {
    private Long id;
    protected int cost;
    protected String color;

    public void test() {
//        String name = foo();
//        System.out.println(name);
    }

//    protected abstract String foo();


}