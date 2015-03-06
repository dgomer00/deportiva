package com.deportiva.main;

import com.example.deportiva.main.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends ArrayAdapter<Object> {
	
	private static ArrayDatos[] datos = new ArrayDatos[]{
		new ArrayDatos("Marcador","Marcadores en directo",R.drawable.marcador),
		new ArrayDatos("Clasificaci�n","Clasificaci�n en directo",R.drawable.clasificacion),
		new ArrayDatos("Plantilla","Nuestros jugadores!!",R.drawable.plantilla),
		new ArrayDatos("Cuerpo T�cnico","Nuestro equipo t�cnico",R.drawable.cuerpo),
		new ArrayDatos("Directiva","Nuestros directivos",R.drawable.directiva),
		new ArrayDatos("Galeria de Im�genes","Algunas im�genes para el recuerdo",R.drawable.galeria),
		new ArrayDatos("Calendario", "Calendario de la Liga Adelante", R.drawable.calendario),
		new ArrayDatos("Entradas", "Precios de los abonos", R.drawable.entrada),
		new ArrayDatos("Enlaces", "Enlaces de inter�s", R.drawable.enlace),
		new ArrayDatos("Himno", "Canciones de la Deportiva", R.drawable.himno),
		new ArrayDatos("Historia", "Breve historia de nuestro club", R.drawable.historia),
		new ArrayDatos("Estadio", "Breve rese�a del Toral�n", R.drawable.estadio)
	};
	
	
	Activity context;
	Adaptador(Activity context){
		super(context,R.layout.activity_menu,datos);
		this.context = context;
	}

	public View getView(int position, View contView, ViewGroup parent){
		LayoutInflater inflater = context.getLayoutInflater();
		View item = inflater.inflate(R.layout.linea,null);//cogemos el xml de el formato de la linea
		
		ImageView icono = (ImageView) item.findViewById(R.id.icono);
		icono.setImageResource(datos[position].getImage());
		
		TextView titulo = (TextView) item.findViewById(R.id.titulo);
		titulo.setText(datos[position].getTitle());
		
		TextView descripcion = (TextView) item.findViewById(R.id.subtitulo);
		descripcion.setText(datos[position].getDescription());
		
		return item;
	}
}
