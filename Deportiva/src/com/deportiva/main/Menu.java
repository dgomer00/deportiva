package com.deportiva.main;

import com.deportiva.calendario.IntroCalendario;
import com.deportiva.clasificacion.Clasificacion;
import com.deportiva.cuentas.Cuentas;
import com.deportiva.cuerpo.Cuerpo;

import com.deportiva.directiva.Directiva;
import com.deportiva.enlaces.Enlaces;
import com.deportiva.entradas.Entradas;
import com.deportiva.estadio.Estadio;
import com.deportiva.galeria.Galeria;
import com.deportiva.himno.Canciones;
import com.deportiva.historia.Historia;
import com.deportiva.marcadores.Marcador;
import com.deportiva.plantilla.MenuPlantilla;

import com.example.deportiva.main.R;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
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
		setTitle("Menu-S.D.Ponferradina");
		
		
		 Adaptador adaptador = new Adaptador(this);
		 ListView listOpciones = (ListView)findViewById(R.id.lista);
		 
		 listOpciones.setAdapter(adaptador);
		 
		 listOpciones.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> a, View v, int position,
					long id) {
				
				Intent inten;
				switch(position){
				
				case 0:
					inten = new Intent(Menu.this,Marcador.class);
					startActivity(inten);
					break;
				case 1:
					inten = new Intent(Menu.this,Clasificacion.class);
					startActivity(inten);
					break;
				case 2:
					inten = new Intent(Menu.this,MenuPlantilla.class);
					startActivity(inten);
					break;	
				case 3:
					 inten = new Intent(Menu.this, Cuerpo.class);
					startActivity(inten);
					break;
				case 4:
					inten = new Intent(Menu.this,Directiva.class);
					startActivity(inten);
					break;
				case 5:
					inten = new Intent(Menu.this,Galeria.class);
					startActivity(inten);
					break;
				case 6:
					inten = new Intent(Menu.this,IntroCalendario.class);
					startActivity(inten);
					break;
				case 7:
					inten = new Intent(Menu.this,Entradas.class);
					startActivity(inten);
					break;
				case 8:
					inten = new Intent(Menu.this,Cuentas.class);
					startActivity(inten);
					break;
				case 9:
					inten = new Intent(Menu.this,Enlaces.class);
					startActivity(inten);
					break;
				case 10:
					inten = new Intent(Menu.this,Canciones.class);
					startActivity(inten);
					break;
				case 11:
					inten = new Intent(Menu.this,Historia.class);
					startActivity(inten);
					break;
				case 12:
					inten = new Intent(Menu.this,Estadio.class);
					startActivity(inten);
					break;
				case 13:
					finish();
					break;
				default:
						
					break;
				
				}
				
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
