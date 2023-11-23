package com.example.repaso_guillermo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast

class gridView : AppCompatActivity(),AdapterView.OnItemClickListener {

    private var gridView:GridView? = null

    private var arrayList:ArrayList<Languajeitem> ? = null
    private var languajeAdapter:LanguajeAdapter ? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_view)

        gridView= findViewById(R.id.my_grid_view)
        arrayList= ArrayList()
        arrayList=setDatalist()
        languajeAdapter = LanguajeAdapter(applicationContext,arrayList!!)
        gridView?.adapter= languajeAdapter
        gridView?.onItemClickListener = this
    }

    private fun setDatalist():ArrayList<Languajeitem>{
        var  arrayList:ArrayList<Languajeitem> = ArrayList()

        arrayList.add(Languajeitem(R.drawable.icon,"C languaje"))
        arrayList.add(Languajeitem(R.drawable.icon,"C++ languaje"))
        arrayList.add(Languajeitem(R.drawable.icon,"Java languaje"))
        arrayList.add(Languajeitem(R.drawable.icon,"PHP languaje"))
        arrayList.add(Languajeitem(R.drawable.icon,"JavaScript languaje"))

        return  arrayList
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var languajeitem:Languajeitem = arrayList!!.get(position)
        Toast.makeText(applicationContext,languajeitem.name, Toast.LENGTH_LONG).show()
    }
}