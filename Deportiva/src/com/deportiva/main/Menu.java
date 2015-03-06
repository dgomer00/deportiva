package com.deportiva.main;

import com.example.deportiva.main.R;

import com.example.deportiva.main.R.id;
import com.example.deportiva.main.R.layout;



import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

//import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Menu extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);

		
		setTitleColor(Color.WHITE);
		
		setTitle("S.D.Ponferradina");
		
		
		 Adaptador adaptador = new Adaptador(this);
		 ListView listOpciones = (ListView)findViewById(R.id.lista);
		 
		 listOpciones.setAdapter(adaptador);
		 
		 listOpciones.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> a, View v, int position,
					long id) {
				
				Intent inten;
	/**			switch(position){
				
				case 0:
					 inten = new Intent(Menu.this,Status.class);
					startActivity(inten);
					break;
				case 1:
					inten = new Intent(Menu.this,ProcessMain.class);
					startActivity(inten);
					break;
				case 2:inten = new Intent(Menu.this,Cronometro.class);
				startActivity(inten);
					
					break;
				
					
				case 3:
					 inten = new Intent(Menu.this,Converter.class);
					startActivity(inten);

					break;
				case 4:
					inten = new Intent(Menu.this,Decibelimetro.class);
					startActivity(inten);
					break;
				case 5:
					inten = new Intent(Menu.this,Calculator.class);
					startActivity(inten);
					break;
				case 6:
					inten = new Intent(Menu.this,LinternaFlash.class);
					startActivity(inten);
					break;*
				case 7:
					finish();
					break;
				default:
						
					break;
				
				}**/
				
			}
 
		});
    }

	
	
	    public boolean onCreateOptionsMenu(Menu menu) {
	        // Inflate the menu; this adds items to the action bar if it is present.
	        getMenuInflater().inflate(R.menu.finish, (android.view.Menu) menu);
	        return true;
	    }
	    
		@Override
		public boolean onOptionsItemSelected(MenuItem item) {
		   switch (item.getItemId()) {
		        case R.id.acabar:
		        	finish();
		           return true;

		        default:
		           return true;
		    }
		}
}
