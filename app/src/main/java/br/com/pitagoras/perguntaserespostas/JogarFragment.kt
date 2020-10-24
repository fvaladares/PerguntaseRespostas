package br.com.pitagoras.perguntaserespostas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class JogarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_jogar, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        registerButtonActivity()
    }

    private fun registerButtonActivity() {
        val newFragment = CadastrarFragment()
        activity?.findViewById<Button>(R.id.buttonRegisterQuestionsAnswers)?.setOnClickListener {
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.containerFrame, newFragment, CadastrarFragment.TAG_DETAILS)
                ?.addToBackStack(null)?.commit()
        }
    }

    companion object {
        const val TAG_DETAILS = "TagJogar"
    }
}