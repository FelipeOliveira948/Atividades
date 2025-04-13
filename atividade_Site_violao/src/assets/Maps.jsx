import Styles from './Maps.module.css'
import textoStyles from './Info.module.css'

function Maps(){
    return(
        <section id={Styles.maps}>
        <div id={Styles.gps}>
        <iframe
        src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3658.122783305187!2d-46.694335124670914!3d-23.528085878822683!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x94cef8775663b04f%3A0x923835e9005f8309!2sSenac%20Lapa%20Tito!5e0!3m2!1spt-BR!2sbr!4v1741127382730!5m2!1spt-BR!2sbr"
        className={Styles.mapIframe}
        allowFullScreen
        loading="lazy"
        referrerPolicy="no-referrer-when-downgrade"
        title="Localização no Mapa"
      />
    </div><div className={textoStyles.texto}>
            <h2>Nossa Loja - Instrumentos Musicais</h2>
            <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit.Dffdgdsgsgdggf</p>
            </div>
        </section>

    )
}

export default Maps