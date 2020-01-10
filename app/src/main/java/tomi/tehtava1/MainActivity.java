package tomi.tehtava1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText shoppingItemInput;
    private Button save;
    private ArrayList<String> shoppingList = new ArrayList<String>();




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shoppingItemInput = (EditText) findViewById(R.id.shoppingItemInput);
        save = (Button) findViewById(R.id.save);


        View.OnClickListener savenKuuntelija = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String shoppingItem = shoppingItemInput.getText().toString();
                if(shoppingItem.length() < 3 || shoppingItem.length() > 15){
                    //Toast virhe = new Toast()
                }else{
                    //Toast onnistu lisäys
                    shoppingList.add(shoppingItem);

                }
            }
        };
        save.setOnClickListener(savenKuuntelija);



        View.OnClickListener doneKuuntelija = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

        };
    }


    public void showShoppingList(View view){
        Intent intent = new Intent(this, DisplayShoppingList.class);
    }
}
