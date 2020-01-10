package tomi.tehtava1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class DisplayShoppingList extends AppCompatActivity {

    private TextView shoppingListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_shopping_list);

        shoppingListView = (TextView) findViewById(R.id.shoppingListView);

        Intent intent = getIntent();

        ArrayList<String> shoppingList = intent.getStringArrayListExtra("ESL");
        for(String item : shoppingList){
            shoppingListView.append(item+"\n");
        }

    }


    public void backToMenu(View view){
        Intent backIntent = new Intent(this, MainActivity.class);
        startActivity(backIntent);
    }


}
