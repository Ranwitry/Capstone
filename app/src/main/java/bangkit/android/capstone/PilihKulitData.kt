package bangkit.android.capstone

object PilihKulitData {

    private val kulitTitle = arrayOf("Kulit Normal",
            "Kulit Kering",
            "Kulit Sensitif",
            "Kulit Berminyak",
            "Kulit Kombinasi")

    private val kulitFoto = intArrayOf(R.drawable.icon_normal,
    R.drawable.icon_kering,
    R.drawable.icon_sensitif,
    R.drawable.icon_berminyak,
    R.drawable.icon_kombinasi)

    val listKulit: ArrayList<PilihKulit>
    get() {
        val list = arrayListOf<PilihKulit>()
        for (position in kulitTitle.indices){
            val kulit = PilihKulit()
            kulit.title = kulitTitle[position]
            kulit.foto = kulitFoto[position]
            list.add(kulit)
        }
        return list
    }
}