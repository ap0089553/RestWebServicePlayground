package starter.hello;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Created by Anirudha on 18-06-2017.
 */
@AllArgsConstructor
@Getter
public class Greeting {
    private final long id;
    private final String content;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Greeting greeting = (Greeting) o;

        return id == greeting.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    @Override
    public String toString() {
        return "Greeting{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
