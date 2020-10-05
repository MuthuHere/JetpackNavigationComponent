package com.muthu.myapplication

import android.os.Bundle
import android.util.Log.d
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_play.view.*

class PlayFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_play, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //get value
        if (arguments != null) {
            val arguments = PlayFragmentArgs.fromBundle(requireArguments())
            d("argument data ","${arguments.user.name}")
        }

        val navigation = Navigation.findNavController(view)
        view.btnEnd.setOnClickListener {
            navigation.navigate(R.id.action_playFragment_to_endGameFragment)
        }
    }
}