package weatherapp.ec463;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class DataSelectActvity extends AppCompatActivity {
    public static final String RoomNum = "room number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_select_actvity);
    }

    public void showTemp(View view) {
        Intent intent = new Intent(this, Temperature.class);
        int room = getIntent().getIntExtra(LocationSelectionActivity.RoomNum, 0);
        intent.putExtra(RoomNum, room);
        startActivity(intent);
    }

    public void showHumidity(View view) {
        Intent intent = new Intent(this, Humidity.class);
        int room = getIntent().getIntExtra(LocationSelectionActivity.RoomNum, 0);
        intent.putExtra(RoomNum, room);
        startActivity(intent);
    }
}
