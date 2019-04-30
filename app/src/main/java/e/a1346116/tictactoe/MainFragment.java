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

public class MainFragment extends Fragment {

    private TextView textViewJoueurSuivant;
    private TicTacToe m_ticTacToe = TicTacToe.obtenirInstance();
    private ArrayList<Button> m_tableau = new ArrayList<>();

    private Button m_btnReset;

    private Button m_btn0;
    private Button m_btn1;
    private Button m_btn2;
    private Button m_btn3;
    private Button m_btn4;
    private Button m_btn5;
    private Button m_btn6;
    private Button m_btn7;
    private Button m_btn8;

     View.OnClickListener nouveauListener =
         new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button temporaire = (Button) v;
                temporaire.setText(m_ticTacToe.getJoueurCourant());
                int index = m_tableau.indexOf(temporaire);
                m_ticTacToe.jouerCoup(index);
                if(m_ticTacToe.verifierGagner()) {
                    for(Button btn : m_tableau) {
                        btn.setEnabled(false);
                        Toast.makeText(getActivity(),"Partie Gagnée par : " + m_ticTacToe.getJoueurCourant(),Toast.LENGTH_SHORT).show();
                    }
                }
                textViewJoueurSuivant.setText(m_ticTacToe.getJoueurCourant());
            }
        };

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        textViewJoueurSuivant = v.findViewById(R.id.joueurCourant);
        textViewJoueurSuivant.setText("X");

        m_btn0 = v.findViewById(R.id.btn_1);
        m_btn0.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn0);

        m_btn1 = v.findViewById(R.id.btn_2);
        m_btn1.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn1);

        m_btn2 = v.findViewById(R.id.btn_3);
        m_btn2.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn2);

        m_btn3 = v.findViewById(R.id.btn_4);
        m_btn3.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn3);

        m_btn4 = v.findViewById(R.id.btn_5);
        m_btn4.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn4);

        m_btn5 = v.findViewById(R.id.btn_6);
        m_btn5.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn5);

        m_btn6 = v.findViewById(R.id.btn_7);
        m_btn6.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn6);

        m_btn7 = v.findViewById(R.id.btn_8);
        m_btn7.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn7);

        m_btn8 = v.findViewById(R.id.btn_9);
        m_btn8.setOnClickListener(nouveauListener);
        m_tableau.add(m_btn8);


        m_btnReset = v.findViewById(R.id.btnReset);
        m_btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m_ticTacToe.Reset();
                for (Button btn : m_tableau) {
                    btn.setText("");
                    btn.setEnabled(true);
                }
            }
        });
        return v;
    }
}
