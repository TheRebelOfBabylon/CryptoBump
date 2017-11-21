package crypto.bump;

//Importing various classes
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class SetPinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_pin);

        final String Pass[] = new String[4];

        final EditText editText1 = (EditText) findViewById(R.id.editText1);

        //The following two lines force the soft keyboard to show once the activity is launched
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);

        final EditText editText2 = (EditText) findViewById(R.id.editText2);
        final EditText editText3 = (EditText) findViewById(R.id.editText3);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);

        //TextWatcher forces focus to next editText once character limit reached
        editText1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(editText1.getText().toString().length()==1)
                {
                    Pass[1] = editText1.getEditableText().toString();
                    editText2.requestFocus();

                }//end if
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(editText2.getText().toString().length()==1){

                    Pass[2] = editText2.getEditableText().toString();
                    editText3.requestFocus();

                }//end if

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(editText3.getText().toString().length()==1){

                    Pass[3] = editText3.getEditableText().toString();
                    editText4.requestFocus();

                }//end if

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        editText4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                Pass[4] = editText4.getEditableText().toString();
            }

            @Override
            public void afterTextChanged(Editable editable) {

                Intent i=new Intent(SetPinActivity.this,SecondActivity.class);
                startActivity(i);
                SetPinActivity.confirmPINActivity();

            }
        });

    }

    public void confirmPINActivity(View view) {
        Intent intent = new Intent(this, ConfirmPINActivity.class);
        startActivity(intent);
    }
}
