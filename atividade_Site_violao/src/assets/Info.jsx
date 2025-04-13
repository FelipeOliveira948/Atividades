import Styles from './Info.module.css'

function Info(){
    return(
            <section id={Styles.info}>
                <div className={Styles.texto}>
                <h2>Nossa Loja - Instrumentos Musicais</h2>
                <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Eveniet ex asperiores ipsum? Ratione magnam, unde quae tempore cum ipsam, aperiam, dicta sapiente quo quis iure autem nisi optio odit. Repellat.</p>
                </div>
            
                <div id={Styles.gui_loja}></div>
            </section>

    )
}

export default Info