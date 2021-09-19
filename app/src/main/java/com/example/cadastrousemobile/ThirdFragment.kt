package com.example.cadastrousemobile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs

class ThirdFragment : Fragment() {

    private var nome:String? = null
    private var cpf:String? = null
    private var email:String? = null
    private var cep:String? = null
    private var cidade:String? = null
    private var endereco:String? = null
    private var numero:String? = null
    private var complemento:String? = null



    private var text_view_nome:TextView? = null
    private var text_view_cpf:TextView? = null
    private var text_view_email:TextView? = null
    private var text_view_cep:TextView? = null
    private var text_view_cidade:TextView? = null
    private var text_view_endereco:TextView? = null
    private var text_view_numero:TextView? = null
    private var text_view_complemento:TextView? = null

    private val args: ThirdFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initComponents(view)
        getArgs()
        setComponents()
    }

    private fun initComponents(view:View){
        text_view_nome = view.findViewById(R.id.text_view_nome)
        text_view_cpf = view.findViewById(R.id.text_view_cpf)
        text_view_email = view.findViewById(R.id.text_view_email)
        text_view_cep = view.findViewById(R.id.text_view_cep)
        text_view_cidade = view.findViewById(R.id.text_view_cidade)
        text_view_endereco = view.findViewById(R.id.text_view_endereco)
        text_view_numero = view.findViewById(R.id.text_view_numero)
        text_view_complemento = view.findViewById(R.id.text_view_complemento)
    }

    private fun getArgs(){
        nome = args.nome
        cpf = args.cpf
        email = args.email
        cep = args.cep
        cidade = args.cidade
        endereco=args.endereco
        numero = args.numero
        complemento= args.complemento
    }

    private fun setComponents(){
        text_view_nome?.text = nome
        text_view_cpf?.text = cpf
        text_view_email?.text = email
        text_view_cep?.text = cep
        text_view_cidade?.text = cidade
        text_view_endereco?.text = endereco
        text_view_numero?.text = numero
        text_view_complemento?.text = complemento

    }


}