package com.example.dataofRoK.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dataofRoK.data.model.Kingdoms
import com.example.rokdata.databinding.KingdomItemBinding

class KingdomAdapter ( var kingdomList: ArrayList<Kingdoms>,
                       val onClick : (Kingdoms) -> Unit )
                    : RecyclerView.Adapter<KingdomAdapter.KingdomHolder>() {

    class KingdomHolder (val binding: KingdomItemBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(kingdoms:Kingdoms){
            binding.kingdomtextItem.text = kingdoms.name
            binding.kingdomnumberItem.text = kingdoms.number.toString()
        }
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : KingdomHolder{
        val binding = KingdomItemBinding.inflate(LayoutInflater.from(parent.context)
            ,parent,false)
        return KingdomHolder(binding)

    }

    override fun onBindViewHolder(holder: KingdomHolder , position: Int) {
        holder.bind(kingdomList.get(position))
        holder.binding.root.setOnClickListener{

        }
    }



    override fun getItemCount(): Int {
        return kingdomList.size
    }


}