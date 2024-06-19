import com.andyPendragon.Salaire;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SalaireTest {

    @Test
    void salaire_brut_a_1_000_000_donc_net_a_800_000_MGA(){
        var salaire = new Salaire(1_000_000);
        Assertions.assertEquals(800_000, salaire.getNet());
    }
}
