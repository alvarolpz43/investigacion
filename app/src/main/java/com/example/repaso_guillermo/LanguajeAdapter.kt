package com.example.repaso_guillermo

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class LanguajeAdapter(var context:Context, var arrayList: ArrayList<Languajeitem>): BaseAdapter(){
    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(position: Int): Any {
        return arrayList.get(position)
    }

    override fun getItemId(position: Int): Long {
       return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View= View.inflate(context,R.layout.grid_item_list,null)
        var icons:ImageView= view.findViewById(R.id.icons)
        var names:TextView= view.findViewById((R.id.name_text_view))

        var languajeitem:Languajeitem= arrayList.get(position)
        icons.setImageResource(languajeitem.icons!!)

        names.text= languajeitem.name

        return  view
    }

}