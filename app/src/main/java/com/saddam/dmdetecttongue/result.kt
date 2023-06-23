package com.saddam.dmdetecttongue


import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class result : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)

        var intent = intent
        val name = intent.getStringExtra("answer")

        val head = findViewById<TextView>(R.id.Head)
        val des = findViewById<TextView>(R.id.desc)
        if (name != null) {
            if (name.contains("Diabetes")) {
                head.text = "Anda terindikasi menderita Diabetes"
                des.text = "Rekomendasi penanganan awal untuk diabetes\na. Silahkan menuju ke Rumah Sakit untuk pemeriksaan lebih lanjut.\n" +
                        "b. Fokuslah pada gaya hidup sehat dan pola makan seimbang.\n" +
                        "c. Kurangi konsumsi gula berlebih dan karbohidrat sederhana, tingkatkan asupan serat dan makanan bergizi.\n" +
                        "d. Apabila anda sudah berkonsultasi dengan dokter dan didiagnosis positif DM, ikutliah pengobatan dan perawatan yang direkomendasikan.\n" +
                        " "
                des.setBackgroundResource(R.drawable.bgwhite)
            } else if (name.contains("Nondiabetes")) {
                head.text = "Anda tidak terindikasi menderita diabetes"
                des.text = "Pertahankan kesehatan anda" +
                        "\na. Pelihara pola makan sehat\n" +
                        "Hindari konsumsi makanan yang tinggi gula, lemak jenuh, dan karbohidrat sederhana. Prioritaskan makanan dengan indeks glikemik rendah, seperti sayuran, buah-buahan, biji-bijian utuh, dan protein sehat. Perhatikan porsi makanan dan hindari kelebihan kalori.\n" +
                        "b. Rutin berolahraga\n" +
                        "Aktivitas fisik teratur sangat penting untuk menjaga kesehatan dan mencegah diabetes mellitus. Lakukan olahraga aerobik dan sertakan juga latihan kekuatan dan fleksibilitas dalam rutinitas Anda. \n" +
                        "c. Perhatikan berat badan dan manajemen stres\n" +
                        "Pertahankan berat badan yang sehat sesuai dengan indeks massa tubuh (IMT) yang direkomendasikan. .\n"
                des.setBackgroundResource(R.drawable.bgwhite)
            }else {
                head.text = "Penyakit DM tidak terdeteksi"
                des.text = "Tidak terdapat citra lidah pada gambar yang anda masukkan"
            }
        }

    }
}