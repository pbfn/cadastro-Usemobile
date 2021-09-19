package com.example.cadastrousemobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class FirstFragment : Fragment(),View.OnClickListener {

    private var button_next:Button? = null
    private var edit_text_nome:EditText? = null
    private var edit_text_cpf:EditText? = null
    private var edit_text_email:EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initComponents(view)
        setClicksEvents()
    }

    private fun initComponents(view: View){
        button_next = view.findViewById(R.id.button_next)
        edit_text_nome = view.findViewById(R.id.edit_text_nome)
        edit_text_cpf = view.findViewById(R.id.edit_text_cpf)
        edit_text_email = view.findViewById(R.id.edit_text_email)
    }

    private fun setClicksEvents(){
        button_next?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v?.id
        when(id){
            R.id.button_next -> {
                var nome:String = edit_text_nome?.text.toString()
                var cpf:String = edit_text_cpf?.text.toString()
                var email:String = edit_text_email?.text.toString()

                    val direction = FirstFragmentDirections.actionFirstFragmentToSecondFragment(nome,cpf,email)
                    findNavController().navigate(direction)
                }
            }
    }
}

