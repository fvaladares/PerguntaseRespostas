package br.com.pitagoras.perguntaserespostas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null)
            showPlayFragment()
    }

    private fun showPlayFragment() {
        val newFragment = JogarFragment()
        supportFragmentManager.beginTransaction()
            .replace(R.id.containerFrame, newFragment, JogarFragment.TAG_DETAILS).commit()
    }
}