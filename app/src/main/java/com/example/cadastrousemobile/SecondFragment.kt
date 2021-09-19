package com.example.cadastrousemobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs


class SecondFragment : Fragment(),View.OnClickListener {

    private var edit_text_cep:EditText? = null
    private var edit_text_cidade:EditText? = null
    private var edit_text_endereco:EditText? = null
    private var edit_text_numero:EditText? = null
    private var edit_text_complemento:EditText? = null
    private var button_next2:Button? = null
    private lateinit var nome:String
    private lateinit var cpf:String
    private lateinit var email:String




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initComponents(view)
        setClicksEvents()
        getArgs()
    }

    private fun getArgs(){
        val args: SecondFragmentArgs by navArgs()
        nome = args.nome
        cpf = args.cpf
        email = args.email
    }

    private fun initComponents(view: View){
        edit_text_cep = view.findViewById(R.id.edit_text_cep)
        edit_text_cidade = view.findViewById(R.id.edit_text_cidade)
        edit_text_endereco = view.findViewById(R.id.edit_text_endereco)
        edit_text_numero = view.findViewById(R.id.edit_text_numero)
        edit_text_complemento = view.findViewById(R.id.edit_text_complemento)
        button_next2 = view.findViewById(R.id.button_next2)
    }

    private fun setClicksEvents(){
        button_next2?.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val id = v?.id
        when(id){
            R.id.button_next2 -> {

                var cep:String = edit_text_cep?.text.toString()
                var cidade:String = edit_text_cidade?.text.toString()
                var endereco:String = edit_text_endereco?.text.toString()
                var numero:String = edit_text_numero?.text.toString()
                var complemento:String = edit_text_complemento?.text.toString()

                val direction = SecondFragmentDirections.actionSecondFragmentToThirdFragment(nome,cpf,email,cep,cidade,endereco,numero,complemento)

                findNavController().navigate(direction)
            }
        }
    }


}