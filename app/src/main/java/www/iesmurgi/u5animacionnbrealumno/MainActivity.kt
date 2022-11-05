package www.iesmurgi.u5animacionnbrealumno

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
        var miTexto:TextView = findViewById(R.id.texto)
        miTexto.setText("Daniel Alejandro")

        //Cambiamos color
        miTexto.setTextColor(getResources().getColor(R.color.miColor))

        //Añadimos texto al texto
        miTexto.append("\n Martin Romero");

        //Cambiamos tamaño del texto
        miTexto.setTextSize(1, 30F);

        //Cambiamos la tipografia
        miTexto.typeface = ResourcesCompat.getFont(this, R.font.deadkansas)

        //Translate
        val translacion = AnimationUtils.loadAnimation(this, R.anim.translacion)
        //Aparicion
        val alfa = AnimationUtils.loadAnimation(this, R.anim.aparicion)
        //Scale
        val escala = AnimationUtils.loadAnimation(this, R.anim.escala)
        //Rotate
        val rotar = AnimationUtils.loadAnimation(this, R.anim.rotacion)
        //Several
        val varios = AnimationUtils.loadAnimation(this, R.anim.varios)

        miTexto.startAnimation(varios)




    }
}