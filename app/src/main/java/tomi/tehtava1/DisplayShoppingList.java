package tomi.tehtava1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayShoppingList extends AppCompatActivity {

    private TextView shoppingListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_shopping_list);

        shoppingListView = (TextView) findViewById(R.id.shoppingListView);

        shoppingListView.setText("tidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \n" +
                "tidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \n" +
                "tidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \ntidiii vittu asdasd juujuu \n");

    }
}
