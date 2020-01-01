package student.tina.firebaseandroid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import student.tina.firebaseandroid.databinding.LayoutSignupBinding

class SignUpFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //binding the xml file to get the adapter(in order to link our StylishAdapter
        val binding: LayoutSignupBinding = DataBindingUtil.inflate(
            inflater, R.layout.layout_signup, container, false
        )




        return binding.root
    }
}