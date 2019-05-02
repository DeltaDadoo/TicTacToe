package e.a1346116.tictactoe;

import junit.framework.TestCase;

public class TestTicTacToe extends TestCase {
    public void testJoueurCourant(){
        assertEquals("X", TicTacToe.obtenirInstance().getJoueurCourant());
        TicTacToe.obtenirInstance().jouerCoup(0);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        assertEquals("O", TicTacToe.obtenirInstance().getJoueurCourant());
        TicTacToe.obtenirInstance().jouerCoup(4);
        assertFalse(TicTacToe.obtenirInstance().verifierGagner());

        assertEquals("X", TicTacToe.obtenirInstance().getJoueurCourant());
    }

    public void testXGagnant() {
        TicTacToe.obtenirInstance().Reset();
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
        TicTacToe.obtenirInstance().Reset();


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
        TicTacToe.obtenirInstance().Reset();


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
        TicTacToe.obtenirInstance().Reset();


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
        TicTacToe.obtenirInstance().Reset();
    }

    public void test0Gagnant() {
        TicTacToe.obtenirInstance().Reset();
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
        TicTacToe.obtenirInstance().Reset();


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
        TicTacToe.obtenirInstance().Reset();


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
        TicTacToe.obtenirInstance().Reset();


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
        TicTacToe.obtenirInstance().Reset();
    }

    public void testPartieNulle() {
        TicTacToe.obtenirInstance().Reset();
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
        //ssertFalse(TicTacToe.obtenirInstance().verifierGagner());

        assertTrue(TicTacToe.obtenirInstance().partieNulle());
    }
}
