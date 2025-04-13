import Styles from './Venda.module.css'
import guitarra from './imagens/guitarrinha.jpg'

function Venda(){
    return(
        <section id={Styles.vendas}>
            <div class={Styles.produto}> <img class={Styles.guitarrinha} src={guitarra} />VIOLÃO YAMAHA C70 II CLÁSSICO NYLON ACÚSTICO NATURAL BRILHANTE <p class={Styles.preco}> R$ 989,50</p>
                </div>
            <div class={Styles.produto}><img class={Styles.guitarrinha} src={guitarra} />VIOLÃO YAMAHA C70 II CLÁSSICO NYLON ACÚSTICO NATURAL BRILHANTE <p class={Styles.preco}> R$ 989,50</p>
            </div>
            <div class={Styles.produto}><img class={Styles.guitarrinha} src={guitarra} />VIOLÃO YAMAHA C70 II CLÁSSICO NYLON ACÚSTICO NATURAL BRILHANTE <p class={Styles.preco}> R$ 989,50</p>
            </div>
            <div class={Styles.produto}><img class={Styles.guitarrinha} src={guitarra} />VIOLÃO YAMAHA C70 II CLÁSSICO NYLON ACÚSTICO NATURAL BRILHANTE <p class={Styles.preco}> R$ 989,50</p>
            </div>
        </section>

    )
}

export default Venda