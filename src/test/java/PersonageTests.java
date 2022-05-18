import com.example.Personage;
import org.junit.jupiter.api.Test;

public class PersonageTests {

    @Test
    public void personageHasHouse() {
        // Given
        Personage personage = new Personage("Harry Potter", new House("Gryffindor", "description"));

        // When

        // Then
    }

    @Test
    public void personageHasNotHouse() {
        // Given
        Personage personage = new Personage("Harry Potter");

        // When

        // Then
    }
}

// House names
// Gryffindor
// Hufflepuff
// Ravenclaw
// Slytherin

