package e.a1346116.tictactoe;

import junit.framework.TestCase;

/**
 * Classe qui test le fonctionnement logique du jeu
 *
 * @author David Goulet
 * @author Olivier Chan
 */
public class TestTicTacToe extends TestCase {

    /**
     * Test le joueur courant
     */
    public void testJoueurCourant(){
        assertEquals("X", TicTacToe.obtenirInstance().getJoueurCourant());
        TicTacToe.obtenirInstance().jouerCoup(0);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        assertEquals("O", TicTacToe.obtenirInstance().getJoueurCourant());
        TicTacToe.obtenirInstance().jouerCoup(4);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        assertEquals("X", TicTacToe.obtenirInstance().getJoueurCourant());
    }

    /**
     * Test que le joueur X gagne une partie
     * Test aussi les coups jouer
     */
    public void testXGagnant() {
        TicTacToe.obtenirInstance().reset();
        TicTacToe.obtenirInstance().jouerCoup(0);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(1);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(3);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(5);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(6);
        assertTrue(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().reset();


        TicTacToe.obtenirInstance().jouerCoup(0);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(4);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(1);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(5);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(2);
        assertTrue(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().reset();


        TicTacToe.obtenirInstance().jouerCoup(8);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(1);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(5);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(4);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(2);
        assertTrue(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().reset();


        TicTacToe.obtenirInstance().jouerCoup(3);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(1);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(4);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(8);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(5);
        assertTrue(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().reset();
    }

    /**
     * Test que le joueur O gagne une partie
     * Test aussi les coups jouer
     */
    public void test0Gagnant() {
        TicTacToe.obtenirInstance().reset();
        TicTacToe.obtenirInstance().jouerCoup(2);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(0);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(5);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(4);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(7);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(8);
        assertTrue(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().reset();


        TicTacToe.obtenirInstance().jouerCoup(1);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(8);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(5);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(7);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(4);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(6);
        assertTrue(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().reset();


        TicTacToe.obtenirInstance().jouerCoup(2);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(1);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(6);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(4);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(8);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(7);
        assertTrue(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().reset();


        TicTacToe.obtenirInstance().jouerCoup(8);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(6);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(7);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(4);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(1);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().jouerCoup(2);
        assertTrue(TicTacToe.obtenirInstance().verifierGagner());
        TicTacToe.obtenirInstance().reset();
    }

    /**
     * Test qu'une partie peut être nulle
     * Test aussi les coups jouer
     */
    public void testPartieNulle() {
        TicTacToe.obtenirInstance().reset();
        TicTacToe.obtenirInstance().jouerCoup(1);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(0);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(4);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(2);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(6);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());
        assertFalse(TicTacToe.obtenirInstance().partieNulle());
        assertFalse(TicTacToe.obtenirInstance().partieNulle());

        TicTacToe.obtenirInstance().jouerCoup(3);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(8);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(7);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(5);

        assertTrue(TicTacToe.obtenirInstance().partieNulle());
    }

    public void testRecupererRepresentation() {
        TicTacToe.obtenirInstance().reset();
        TicTacToe.obtenirInstance().jouerCoup(1);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(0);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        TicTacToe.obtenirInstance().jouerCoup(4);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        String[] representations = TicTacToe.obtenirInstance().recupererText();
        assertEquals("O", representations[0]);
        assertEquals("X", representations[1]);
        assertEquals(" ", representations[2]);
        assertEquals(" ", representations[3]);
        assertEquals("X", representations[4]);
        assertEquals(" ", representations[5]);
        assertEquals(" ", representations[6]);
        assertEquals(" ", representations[7]);
        assertEquals(" ", representations[8]);
    }
}
