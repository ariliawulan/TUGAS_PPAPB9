package com.example.tugas_ppapb9

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.tugas_ppapb9.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private val usernameMasuk = "Aril"
    private val passwordMasuk = "492464"
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.login.setOnClickListener {
            val enteredUsername = binding.username3.text.toString()
            val enteredPassword = binding.password3.text.toString()

            if (enteredUsername == usernameMasuk && enteredPassword == passwordMasuk) {
                // Authentication successful
                val intentToHome= Intent(requireContext(), WelcomeActivity::class.java)
                startActivity(intentToHome)
            }
            else {
                Toast.makeText(requireContext(), "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }

}