package com.portfolio.apps.outsource.grofast.fragment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.portfolio.apps.outsource.grofast.ApplicationClass
import com.portfolio.apps.outsource.grofastdelivery.R

class DisplayFragmentAdapter(private var dataSet : List<GroFastItem>) :
                       RecyclerView.Adapter<DisplayFragmentAdapter.ViewHolder>(){

   class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
       val nameOfProduct: TextView
       val categoryOfProduct: TextView
       val priceOfProduct: TextView
       val imageViewOfProduct: ImageView
       val add_to_cart: ImageView

       init {
           // Define click listener for the ViewHolder's View.
           nameOfProduct = view.findViewById(R.id.nameOfProduct)
           categoryOfProduct = view.findViewById(R.id.categoryOfProduct)
           priceOfProduct = view.findViewById(R.id.priceOfProduct)
           imageViewOfProduct = view.findViewById(R.id.item1);
           add_to_cart = view.findViewById(R.id.add_to_cart)
       }
   }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.display_items_row, parent, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nameOfProduct.text = dataSet[position].productName
        holder.priceOfProduct.text = dataSet[position].productPrice
        holder.categoryOfProduct.text = dataSet[position].productCategory


        var context: Context = ApplicationClass.applicationContext();

        Glide.with(context).load(dataSet[position].productImage)
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
                .into(holder.imageViewOfProduct)

        holder.nameOfProduct.text = dataSet[position].productName

    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
    fun update(data: List<GroFastItem>) {
        dataSet = data
        notifyDataSetChanged()
    }

}
