import Styles from './Footer.module.css'
import Whats from "./imagens/whats.png"
import Face from "./imagens/face.png"
import Insta from "./imagens/insta.png"

function Footer(){
    return(
        <footer>
        <p className={Styles.rua}>Nossa Loja - Instrumentos Musicais <br/> Rua Tito 54 - Lapa <br/> São Paulo - Brasil</p>
        <div id={Styles.icons}>
            <img className={Styles.icon4} src={Whats}/>
            <img className={Styles.icon4} src={Insta}/>
            <img className={Styles.icon4} src={Face}/>
        </div>
    </footer>
    )
}

export default Footer