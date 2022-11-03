package www.iesmurgi.u5animacionnbrealumno

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Instacia de TextView de texto de xml
        var miTexto:TextView = findViewById(R.id.texto);
        miTexto.setText("He cambiado el texto");

        //Cambiamos color
        miTexto.setTextColor(getResources().getColor(R.color.miColor));

        //Añadimos texto al texto
        miTexto.append("\n Nueva línea de texto");

        //Cambiamos la tipografia
        miTexto.typeface = ResourcesCompat.getFont(this, R.font.umbrella);

        val mianimacion = AnimationUtils.loadAnimation(this, R.anim.animacion_translacion);
        miTexto.startAnimation(mianimacion);

        miTexto.typeface = ResourcesCompat.getFont(this, R.font.deadkansas);
        miTexto.startAnimation(mianimacion);

    }
}