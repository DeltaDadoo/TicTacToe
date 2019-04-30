package e.a1346116.tictactoe;

public class TicTacToe {

    private String m_joueurCourant = "X";
    private static TicTacToe m_singleton;
    private String[] m_tableau;

    public TicTacToe() {
        Reset();
    }

    public static TicTacToe obtenirInstance() {
        if(m_singleton == null) {
            m_singleton = new TicTacToe();
        }
        return m_singleton;
    }

    public void Reset() {
        m_tableau = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    }

    public void jouerCoup(int p_index) {
        m_tableau[p_index] = m_joueurCourant;
    }

    public boolean verifierGagner() {
        if(m_tableau[0] == m_tableau[1] && m_tableau[0] == m_tableau[2]) {
            return true;
        }

        if(m_tableau[0] == m_tableau[3] && m_tableau[0] == m_tableau[6]) {
            return true;
        }

        if(m_tableau[0] == m_tableau[4] && m_tableau[0] == m_tableau[8]) {
            return true;
        }

        if(m_tableau[8] == m_tableau[7] && m_tableau[8] == m_tableau[6]) {
            return true;
        }

        if(m_tableau[8] == m_tableau[5] && m_tableau[8] == m_tableau[2]) {
            return true;
        }

        if(m_tableau[1] == m_tableau[4] && m_tableau[1] == m_tableau[7]) {
            return true;
        }

        if(m_tableau[3] == m_tableau[4] && m_tableau[3] == m_tableau[5]) {
            return true;
        }

        if(m_tableau[6] == m_tableau[4] && m_tableau[6] == m_tableau[2]) {
            return true;
        }

        changerJoueurCourant();
        return false;
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
