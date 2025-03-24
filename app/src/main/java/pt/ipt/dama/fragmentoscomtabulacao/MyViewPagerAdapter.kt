package pt.ipt.dama.fragmentoscomtabulacao

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

/**
 * Gestor dos fragmentos
 */
class MyViewPagerAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    /**
     * devolve o nº de fragmentos a processar
     */
    override fun getItemCount(): Int {
        return 3
    }

    /**
     * devolve o Fragmento pedido pelo parâmetro de entrada
     * @param número do framento a instanciar
     */
    override fun createFragment(posicao: Int): Fragment {
        return when (posicao) {
            0 -> FragmentoEsquerda()
            1 -> FragmentoCentro()
            2 -> FragmentoDireita()
            else -> FragmentoEsquerda()
        }

        /*   when (posicao)  {
                0-> return FragmentoEsquerda()
                1-> return FragmentoCentro()
                2-> return FragmentoDireita()
                else-> return FragmentoEsquerda()
         */


    }
}