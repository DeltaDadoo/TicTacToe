package e.a1346116.tictactoe;

/**
 * Classe de gestion du jeu, contient la logique et les fonctions utilisées pour jouer
 *
 * @author David Goulet
 * @author Olivier Chan
 */
public class TicTacToe {

    private String m_joueurCourant = "X";
    private static TicTacToe m_singleton;
    private String[] m_tableau;

    private TicTacToe() {
        reset();
    }

    /**
     * Constructeur nommé du singleton pour obtenir le gestionnaire de jeu
     * @return l'instance unique du gestionnaire
     */
    public static TicTacToe obtenirInstance() {
        if(m_singleton == null) {
            m_singleton = new TicTacToe();
        }
        return m_singleton;
    }

    /**
     * Réinitialise les valeurs utilisées dans le gestionnaire
     */
    public void reset() {
        m_tableau = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"};
        m_joueurCourant = "X";
    }

    /**
     * Récupère les représentations des coups jouer dans le tableau
     * @return un array avec les représentations d'un carré du tableau au même index
     */
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

    /**
     * Place un coup jouer dans le tableau
     * @param p_index index de la position où le coup à été jouer
     */
    public void jouerCoup(int p_index) {
        m_tableau[p_index] = m_joueurCourant;
        changerJoueurCourant();
    }

    /**
     * Vérifie si la partie est gagnée
     * @return si la partie est gagnée
     */
    public boolean verifierGagner() {
        if(m_tableau[0].equals(m_tableau[1]) && m_tableau[0].equals(m_tableau[2])) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[0].equals(m_tableau[3]) && m_tableau[0].equals(m_tableau[6])) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[0].equals(m_tableau[4]) && m_tableau[0].equals(m_tableau[8])) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[8].equals(m_tableau[7]) && m_tableau[8].equals(m_tableau[6])) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[8].equals(m_tableau[5]) && m_tableau[8].equals(m_tableau[2])) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[1].equals(m_tableau[4]) && m_tableau[1].equals(m_tableau[7])) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[3].equals(m_tableau[4]) && m_tableau[3].equals(m_tableau[5])) {
            changerJoueurCourant();
            return true;
        }

        if(m_tableau[6].equals(m_tableau[4]) && m_tableau[6].equals(m_tableau[2])) {
            changerJoueurCourant();
            return true;
        }

        return false;
    }

    /**
     * Détecte si une partie est nulle
     * @return si la partie est nulle
     */
    public boolean partieNulle() {
        return (!verifierGagner() && tableauRemplit());
    }

    /**
     * Vérifie que le tableau est remplit
     * @return si le tableau est remplit
     */
    private boolean tableauRemplit() {
        for (String s : m_tableau) {
            if (!s.equals("X") && !s.equals("O")) {
                return false;
            }
        }

        return true;
    }

    /**
     * Change le joueur dont c'est le tour de jouer
     */
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
