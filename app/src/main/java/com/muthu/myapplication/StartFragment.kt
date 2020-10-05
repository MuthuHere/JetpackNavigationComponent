package com.muthu.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.muthu.myapplication.data.User
import kotlinx.android.synthetic.main.fragment_start.view.*

class StartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //init nav
        val navController = Navigation.findNavController(view)
        view.btnStart.setOnClickListener {
            //passing arguments
            val action =
                StartFragmentDirections.actionStartFragmentToPlayFragment(User("Muthu", 28))

            navController.navigate(action)
        }
    }

}