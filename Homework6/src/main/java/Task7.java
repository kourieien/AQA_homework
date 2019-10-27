import java.util.HashSet;
import java.util.Set;

public class Task7 {
    private final String first, last;

    public Task7(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task7)) return false;

        Task7 o1 = (Task7) o;
        return (this.first == o1.first) && (this.last == o1.last);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 66;
        result = prime*result;
        result = prime * result + this.first.hashCode();
        result = prime*result+this.last.hashCode();
        return result;
    }

    public static void main(String[] args) {
        Set<Task7> s = new HashSet<Task7>();
        s.add(new Task7("Donald", "Duck"));
        System.out.println(s.contains(new Task7("Donald", "Duck")));
    }
}
