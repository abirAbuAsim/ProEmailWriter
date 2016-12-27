package com.example.absak.proemailwriter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class WriteEmailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_write_email);
    }

    //  Formats the mail according to professional standards
    //  and sends it to other mailing Apps
    public void makeMyEmail(View view){
        String fullEmailMessage = "";

        EditText salutationEditText = (EditText)findViewById(R.id.salutation_edit_text);
        fullEmailMessage += salutationEditText.getText().toString() + "\n\n";

        EditText introEditText = (EditText)findViewById(R.id.intro_edit_text);
        fullEmailMessage += introEditText.getText().toString() + "\n\n";

        EditText purposeEditText = (EditText)findViewById(R.id.purpose_edit_text);
        fullEmailMessage += purposeEditText.getText().toString() + "\n\n";

        EditText closingEditText = (EditText)findViewById(R.id.closing_edit_text);
        fullEmailMessage += closingEditText.getText().toString() + "\n\n";

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, fullEmailMessage);

        String chooserTitle = getString(R.string.chooser);
        Intent chosenIntent = Intent.createChooser(intent, chooserTitle);
        startActivity(chosenIntent);
    }
}
