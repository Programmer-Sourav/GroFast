package com.portfolio.apps.outsource.grofast.fragment

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.portfolio.apps.outsource.grofastdelivery.R
import com.portfolio.apps.outsource.grofastdelivery.di.Injection
import com.portfolio.apps.outsource.grofastdelivery.viewmodel.GroFastProductsViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.io.InputStream



class DisplayFragment : Fragment(){

    // GitHub Project Link
    //https://github.com/emedinaa/kotlin-mvvm

    private val viewModel by viewModels<GroFastProductsViewModel> {
        Injection.provideViewModelFactory()
    }

    private lateinit var adapter: DisplayFragmentAdapter;
    lateinit var productDetailsList : RecyclerView;
    var itemsList = ArrayList<GroFastItem>();

    companion object {
        fun newInstance(): DisplayFragment {
            return DisplayFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater.inflate(R.layout.fragment_details, container, false)
        productDetailsList = view.findViewById(R.id.product_details_recycler_view);
        setupUI();
        setupViewModel();

      /*  itemsList.add(GroFastItem("Packaged Orange-1KG","₹120.00 per kg","Fruits","http://www.souravnath.com/medsupload/orange.jpg"))
        itemsList.add(GroFastItem("Packaged Apples-1KG","₹180.00 per kg","Fruits","http://www.souravnath.com/medsupload/orange.jpg"))
        itemsList.add(GroFastItem("Farm Fresh Banana-10PC","₹10.00 per pc","Fruits","http://www.souravnath.com/medsupload/orange.jpg"))


        val horizontalLayoutManager = LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        productDetailsList.setLayoutManager(horizontalLayoutManager)
        adapter = DisplayFragmentAdapter( itemsList)
        productDetailsList.setAdapter(adapter) */
        return view;
    }
    //ui
    private fun setupUI() {
        adapter = DisplayFragmentAdapter((viewModel.groFastItemList.value?: emptyList()))
        productDetailsList.layoutManager = LinearLayoutManager(context)
        productDetailsList.adapter = adapter
    }

    //view model
    private fun setupViewModel() {
        viewModel.groFastItemList.observe(viewLifecycleOwner, renderGroFastItemsList)
        /*viewModel.isViewLoading.observe(this, isViewLoadingObserver)
        viewModel.onMessageError.observe(this, onMessageErrorObserver)
        viewModel.isEmptyList.observe(this, emptyListObserver)*/
    }

    //observers
    private val renderGroFastItemsList = Observer<List<GroFastItem>> {
      //  Log.v("Snath, ", "data updated $it")
        adapter.update(it)
    }

  /*  private val isViewLoadingObserver = Observer<Boolean> {
        Log.v(TAG, "isViewLoading $it")
        val visibility = if (it) View.VISIBLE else View.GONE

    }

    private val onMessageErrorObserver = Observer<Any> {
        Log.v(TAG, "onMessageError $it")
        layoutError.visibility = View.VISIBLE
        layoutEmpty.visibility = View.GONE
        textViewError.text = "Error $it"
    }

    private val emptyListObserver = Observer<Boolean> {
        Log.v(TAG, "emptyListObserver $it")
        layoutEmpty.visibility = View.VISIBLE
        layoutError.visibility = View.GONE
    }*/

    //If you require updated data, you can call the method "loadMuseum" here
    override fun onResume() {
        super.onResume()
        lifecycleScope.launch {
            viewModel.loadGroceryProducts()
        }
    }
}