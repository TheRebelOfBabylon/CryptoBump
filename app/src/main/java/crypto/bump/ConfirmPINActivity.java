package crypto.bump;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class ConfirmPINActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_pin);

        final String cPass[] = new String[4];

        final EditText editText5 = (EditText) findViewById(R.id.editText5);
        final EditText editText6 = (EditText) findViewById(R.id.editText6);
        final EditText editText7 = (EditText) findViewById(R.id.editText7);
        final EditText editText8 = (EditText) findViewById(R.id.editText8);

        editText5.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(editText5.getText().toString().length()==1)
                {
                    cPass[0] = editText5.getEditableText().toString();
                    editText6.requestFocus();

                }//end if

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText6.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(editText6.getText().toString().length()==1)
                {

                    cPass[1] = editText6.getEditableText().toString();
                    editText7.requestFocus();

                }//end if

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText7.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(editText7.getText().toString().length()==1)
                {

                    cPass[2] = editText7.getEditableText().toString();
                    editText8.requestFocus();

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText8.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {

                cPass[3] = editText8.getEditableText().toString();

            }
        });

    }
}
