package kr.ac.kyungnam.android.oproject4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var text1:TextView
    lateinit var text2:TextView
    lateinit var chkAgree:CheckBox
    lateinit var rGroup1:RadioGroup
    lateinit var rdoDog:RadioButton
    lateinit var rdoCat:RadioButton
    lateinit var rdoRabbit:RadioButton
    lateinit var btnOK:Button
    lateinit var imgPet:ImageView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        title="애완동물 사진 보기"

        text1 = findViewById(R.id.text1)
        chkAgree =findViewById(R.id.ChkAgree)

        text2=findViewById(R.id.text2)
        rGroup1=findViewById(R.id.Rgroup1)
        rdoDog=findViewById(R.id.RdoDog)
        rdoCat=findViewById(R.id.RdoCat)
        rdoRabbit=findViewById(R.id.RdoRabbit)

        btnOK = findViewById(R.id.BtnOK)
        imgPet=findViewById(R.id.ImgPet)

        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            if(chkAgree.isChecked==true){
                text2.visibility=android.view.View.VISIBLE
                rGroup1.visibility=android.view.View.VISIBLE
                btnOK.visibility=android.view.View.VISIBLE
                imgPet.visibility=android.view.View.VISIBLE
            }else{
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                btnOK.visibility = android.view.View.INVISIBLE
                imgPet.visibility= android.view.View.INVISIBLE
            }
        }
        btnOK.setOnClickListener {
            when(rGroup1.checkedRadioButtonId){
                R.id.RdoDog ->imgPet.setImageResource(R.drawable.img)
                R.id.RdoCat ->imgPet.setImageResource(R.drawable.img_1)
                R.id.RdoRabbit ->imgPet.setImageResource(R.drawable.img_2)
                else ->Toast.makeText(applicationContext,"동물먼저 선택",Toast.LENGTH_SHORT).show()
            }
        }

    }
}