package crypto.bump;

//Importing various classes
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

public class SetPinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_pin);

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

                    editText4.requestFocus();

                }//end if

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }
}
