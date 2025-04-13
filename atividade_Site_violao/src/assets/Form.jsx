import Styles from './Form.module.css'
import Whats from "./imagens/whats.png"
import Face from "./imagens/face.png"
import Insta from "./imagens/insta.png"

function Form(){
    return(
        <section id={Styles.forms}>
                    <div id={Styles.formula}>
                    <br />
                    <label>Entre com o nome:</label>
                    <input type="text" size="60" name="nome" maxlength="70" placeholder="Digite aqui o nome" required />
                    <br />
                    <br />
    
                    <label>Entre com o email:</label>
                    <input type="email" size="60" name="email" maxlength="70" placeholder="Digite aqui o email" />
                    <br /><br />
 
                    <textarea placeholder="Faça seu pedido aqui:"></textarea>
                    <br /> <br />

                    <input id={Styles.envia} type="submit" value="Enviar"/>
                    <br /> <br />
                </div>
                <div id={Styles.imagens_f}>
                    <p id={Styles.acesso}>Acesse também nossas redes sociais:</p><br /> 
                    <img className={Styles.icon1} src={Whats}/>
                    <img className={Styles.icon2}src={Insta}/>
                    <img className={Styles.icon3} src={Face}/>
                </div>
            </section>

    )
}

export default Form