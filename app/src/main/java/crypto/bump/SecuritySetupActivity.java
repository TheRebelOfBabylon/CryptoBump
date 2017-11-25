package crypto.bump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecuritySetupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_setup);
    }

    //Function to start Set Pin Activity once Set Pin button is clicked
    public void setPIN(View view) {
        Intent intent = new Intent(this, SetPinActivity.class);
        startActivity(intent);
    }
}
