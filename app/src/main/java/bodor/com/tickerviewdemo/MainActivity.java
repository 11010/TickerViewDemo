package bodor.com.tickerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;

public class MainActivity extends AppCompatActivity {

    int value = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        final TickerView tickerView = (TickerView) findViewById(R.id.tickerview);
        tickerView.setCharacterList(TickerUtils.getDefaultNumberList());
        tickerView.setTextSize(100);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tickerView.setText(""+(++value));
            }
        });
    }
}
