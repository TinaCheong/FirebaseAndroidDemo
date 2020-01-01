package student.tina.firebaseandroid

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AlertDialog
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.activity_main.*
import student.tina.firebaseandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val database = FirebaseAuth.getInstance()

        binding.lifecycleOwner = this

        binding.loginButton.setOnClickListener {
            val inputEmail = binding.inputEmail.text.toString()
            val inputPassword = binding.inputPassword.text.toString()

            database.signInWithEmailAndPassword(inputEmail, inputPassword).addOnCompleteListener(this) {
                    if (it.isSuccessful()) {
                        AlertDialog.Builder(this)
                            .setTitle("Sign In")
                            .setMessage("Login Success")
                            .setPositiveButton("OK") { dialog, which ->
                                setResult(Activity.RESULT_OK)
//                                finish()
                            }.show()

                    } else{
                        AlertDialog.Builder(this)
                            .setTitle("Sign In")
                            .setMessage(it.exception?.message)
                            .setPositiveButton("OK", null)
                            .show()
                    }
                }
        }



        binding.registrarButton.setOnClickListener {
            Log.i("Check","Clicked")
            findNavController(R.id.myNavHostFragment).navigate(R.id.action_global_signUpFragment)

        }

    }
}

