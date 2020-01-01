package student.tina.firebaseandroid

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import student.tina.firebaseandroid.databinding.LayoutSiginInBinding
import student.tina.firebaseandroid.databinding.LayoutSignupBinding

class SignInFragment : Fragment(){
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding the xml file to get the adapter(in order to link our StylishAdapter
        val binding: LayoutSiginInBinding = DataBindingUtil.inflate(
            inflater, R.layout.layout_sigin_in, container, false
        )

        binding.registrarButton.setOnClickListener {
            Log.i("Check","Clicked")
            findNavController().navigate(R.id.action_global_signUpFragment)

        }



        return binding.root
    }
}