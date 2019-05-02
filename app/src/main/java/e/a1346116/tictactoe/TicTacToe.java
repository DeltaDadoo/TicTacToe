package e.a1346116.tictactoe;

public class TicTacToe {

    private String m_joueurCourant = "X";
    private static TicTacToe m_singleton;
    private String[] m_tableau;

    public TicTacToe() {
        reset();
    }

    public static TicTacToe obtenirInstance() {
        if(m_singleton == null) {
            m_singleton = new TicTacToe();
        }
        return m_singleton;
    }

    public void reset() {
        m_tableau = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    }

    public String[] recupererText() {
        String[] array = new String[9];
        String repCourant;
        for (int i = 0; i < 9 ; i++) {
            repCourant = m_tableau[i];
            if (repCourant.equals("X") || repCourant.equals("O")) {
                array[i] = repCourant;
            }
            else {
                array[i] = " ";
            }
        }
        return array;
    }

    public void jouerCoup(int p_index) {
        m_tableau[p_index] = m_joueurCourant;
        changerJoueurCourant();
    }

    public boolean verifierGagner() {
        if(m_tableau[0] == m_tableau[1] && m_tableau[0] == m_tableau[2]) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[0] == m_tableau[3] && m_tableau[0] == m_tableau[6]) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[0] == m_tableau[4] && m_tableau[0] == m_tableau[8]) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[8] == m_tableau[7] && m_tableau[8] == m_tableau[6]) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[8] == m_tableau[5] && m_tableau[8] == m_tableau[2]) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[1] == m_tableau[4] && m_tableau[1] == m_tableau[7]) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[3] == m_tableau[4] && m_tableau[3] == m_tableau[5]) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[6] == m_tableau[4] && m_tableau[6] == m_tableau[2]) {
            changerJoueurCourant();
            return true;
        }

        return false;
    }

    public boolean partieNulle() {
        if (!verifierGagner() && tableauRemplit()) {
            return true;
        }
        else {
            return false;
        }
    }

    private boolean tableauRemplit() {
        for (String s : m_tableau) {
            if (!s.equals("X") && !s.equals("O")) {
                return false;
            }
        }

        return true;
    }

    private void changerJoueurCourant() {
        switch (m_joueurCourant) {
            case "X": m_joueurCourant = "O"; break;
            case "O": m_joueurCourant = "X"; break;
            default: break;
        }
    }

    public String getJoueurCourant() {
        return m_joueurCourant;
    }
}
