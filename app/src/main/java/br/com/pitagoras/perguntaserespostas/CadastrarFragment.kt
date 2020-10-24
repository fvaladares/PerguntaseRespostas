package br.com.pitagoras.perguntaserespostas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_cadastrar.*

class CadastrarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cadastrar, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        buttonPlay.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.containerFrame, JogarFragment())?.addToBackStack(null)?.commit()
        }

        buttonRegister.setOnClickListener {
            registerQuestion()
        }

    }

    private fun registerQuestion() {
        val question = editTextQuestion.text.toString()
        val answer = editTextAnswer.text.toString()

        Toast.makeText(activity, "$question: $answer", Toast.LENGTH_LONG).show()
    }


    companion object {
        const val TAG_DETAILS = "TagCadastrar"
    }
}