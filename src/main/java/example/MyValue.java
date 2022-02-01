package example;

import lombok.Value;

@Value(staticConstructor="of")
public class MyValue {
    Integer value;
}
