package e.a1346116.tictactoe;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Classe du fragment principale utilisée dans l'application
 *
 * @author David Goulet
 * @author Olivier Chan
 */
public class MainFragment extends Fragment {
    private TextView textViewJoueurSuivant;
    private final TicTacToe m_ticTacToe = TicTacToe.obtenirInstance();
    private final ArrayList<Button> m_tableau = new ArrayList<>();

    /**
     * Déclaration du listener utilisé pour les boutons qui servent à jouer
     */
     private final View.OnClickListener nouveauListener =
         new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button temporaire = (Button) v;
                temporaire.setText(m_ticTacToe.getJoueurCourant());
                int index = m_tableau.indexOf(temporaire);
                m_ticTacToe.jouerCoup(index);
                temporaire.setEnabled(false);
                if(m_ticTacToe.verifierGagner()) {
                    for(Button btn : m_tableau) {
                        btn.setEnabled(false);
                        Toast.makeText(getActivity(),getString(R.string.ToastGagner) + m_ticTacToe.getJoueurCourant(),Toast.LENGTH_SHORT).show();
                    }
                }
                if(m_ticTacToe.partieNulle()) {
                    Toast.makeText(getActivity(),getString(R.string.ToastNulle), Toast.LENGTH_SHORT).show();
                }
                textViewJoueurSuivant.setText(m_ticTacToe.getJoueurCourant());
            }
        };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        textViewJoueurSuivant = v.findViewById(R.id.joueurCourant);
        textViewJoueurSuivant.setText(m_ticTacToe.getJoueurCourant());

        Button m_btn0 = v.findViewById(R.id.btn_1);
        m_btn0.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn0);

        Button m_btn1 = v.findViewById(R.id.btn_2);
        m_btn1.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn1);

        Button m_btn2 = v.findViewById(R.id.btn_3);
        m_btn2.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn2);

        Button m_btn3 = v.findViewById(R.id.btn_4);
        m_btn3.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn3);

        Button m_btn4 = v.findViewById(R.id.btn_5);
        m_btn4.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn4);

        Button  m_btn5 = v.findViewById(R.id.btn_6);
        m_btn5.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn5);

        Button m_btn6 = v.findViewById(R.id.btn_7);
        m_btn6.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn6);

        Button  m_btn7 = v.findViewById(R.id.btn_8);
        m_btn7.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn7);

        Button m_btn8 = v.findViewById(R.id.btn_9);
        m_btn8.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn8);

        String[] repBtn = m_ticTacToe.recupererText();
        for(int i = 0; i < 9; i++) {
            Button btn = m_tableau.get(i);
            btn.setText(repBtn[i]);
            if (btn.getText() != " ") {
                btn.setEnabled(false);
            }
        }

        Button m_btnReset = v.findViewById(R.id.btnReset);
        m_btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_ticTacToe.reset();
                for (Button btn : m_tableau) {
                    btn.setText("");
                    btn.setEnabled(true);
                }
                textViewJoueurSuivant.setText(m_ticTacToe.getJoueurCourant());
            }
        });
        return v;
    }
}
