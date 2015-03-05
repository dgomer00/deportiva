package com.deportiva.cuerpo;

import com.example.deportiva.main.R;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class AdaptadorCuerpo extends ArrayAdapter<Object> {
	private static String  labelNombreDeportivo = "Nombre Deportivo:";
	private static String labelPuesto = "Puesto:";
	
	private static ArrayDatosCuerpo[] datos = new ArrayDatosCuerpo[]{
		new ArrayDatosCuerpo("Jos� Manuel D�az Fern�ndez", labelNombreDeportivo, "Manolo D�az", labelPuesto, "Entrenador", R.drawable.manolo_diaz),
		new ArrayDatosCuerpo("Carlos Lasheras", labelNombreDeportivo,  "Carlos Lasheras", labelPuesto, "Director Deportivo", R.drawable.lasheras),
		new ArrayDatosCuerpo("Rub�n Vega Fuertes", labelNombreDeportivo, "Rub�n Vega", labelPuesto, "2�Entrenador", R.drawable.ruben_vega),
		new ArrayDatosCuerpo("Tom�s Nistal Garc�a", labelNombreDeportivo, "Tom�s Nistal", labelPuesto, "Secretario T�cnico", R.drawable.tomas_nistal),
		new ArrayDatosCuerpo("Jos� Antonio Blanco", labelNombreDeportivo, "Jos� Antonio", labelPuesto, "Delegado", R.drawable.delegado),
		new ArrayDatosCuerpo("Alberto Ram�n Casal Arante", labelNombreDeportivo, "Alberto Casal", labelPuesto, "Entrenador de porteros", R.drawable.alberto_ramon),
		new ArrayDatosCuerpo("Carlos Fern�ndez Salmiento", labelNombreDeportivo, "Carlos", labelPuesto, "Fisioterapeuta", R.drawable.carlos_salmiento),
		new ArrayDatosCuerpo("Carlos �lvarez Leite", labelNombreDeportivo, "Carlos", labelPuesto, "Fisioterapeuta", R.drawable.carlos_alvarez),
		new ArrayDatosCuerpo("Jose Manuel Santos Rodriguez", labelNombreDeportivo, "Manolo", labelPuesto, "Preparador f�sico", R.drawable.manolo),
		new ArrayDatosCuerpo("Jos� Franganillo Espeso", labelNombreDeportivo, "Franganillo", labelPuesto, "Utillero", R.drawable.franganillo),
		new ArrayDatosCuerpo("Ricardo Velez Silva", labelNombreDeportivo, "Ricardo", labelPuesto, "Jefe Servicios M�dicos", R.drawable.ricardo),
		new ArrayDatosCuerpo("Antonio Domingo Bodel�n", labelNombreDeportivo, "Antonio", labelPuesto, "M�dico", R.drawable.antonio_domingo_bodelon),
		new ArrayDatosCuerpo("C�sar Fern�ndez �lvarez", labelNombreDeportivo, "C�sar", labelPuesto, "Readaptador F�sico-Deportivo", R.drawable.cesar),
		new ArrayDatosCuerpo("Ra�l Herrero Franganillo", labelNombreDeportivo, "Ra�l", labelPuesto, "2�Utillero", R.drawable.raul_herrero)
	};
	
	
	Activity context;
	AdaptadorCuerpo(Activity context){
		super(context,R.layout.activity_cuerpo,datos);
		this.context = context;
	}

	public View getView(int position, View contView, ViewGroup parent){
		LayoutInflater inflater = context.getLayoutInflater();
		View item = inflater.inflate(R.layout.cuerpo,null);//cogemos el xml de el formato de la ventana del cuerpo t�cnico
		
		ImageView icono = (ImageView) item.findViewById(R.id.icono);
		icono.setImageResource(datos[position].getImage());
		
		TextView nombre = (TextView) item.findViewById(R.id.nombre);
		nombre.setText(datos[position].getNombre());
		
		TextView labelNombreDepor = (TextView) item.findViewById(R.id.label_nombre_deportivo);
		labelNombreDepor.setText(datos[position].getLabel_nombre_deportivo());
		
		TextView nombreDepor = (TextView) item.findViewById(R.id.nombre_deportivo);
		nombreDepor.setText(datos[position].getNombreDeportivo());
		
		TextView labelPuesto = (TextView) item.findViewById(R.id.label_puesto);
		labelPuesto.setText(datos[position].getLabel_puesto());
		
		TextView puesto = (TextView) item.findViewById(R.id.puesto);
		puesto.setText(datos[position].getPuesto());
		
		return item;
	}
}
