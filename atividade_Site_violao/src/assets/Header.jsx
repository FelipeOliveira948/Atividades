import Styles from './Header.module.css'

function Header(){
    return(
        <header>
            <nav id={Styles.nave}>
                <a href="#">Home</a>
                <a href="#">Quem Somos</a>
                <a href="#">Instrumentos</a>
                <a href="#">Endereço</a>
                <a href="#">Contato</a>
            </nav>
        </header>

    )
}

export default Header