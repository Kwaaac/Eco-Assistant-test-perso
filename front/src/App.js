import './App.css';

function App() {
    return (
        <div className="App">
            <header className="App-header">
                <img src={require('./logo_ea.PNG')} className="App-logo" alt="logo"/>
                <p>
                    Bienvenue sur la page d'accueil d'Eco-Assistant, un utilitaire pour estimer l'impact écologique de
                    vos projets informatiques
                </p>
                <a
                    className="App-link"
                    href="https://r.mtdv.me/github_README"
                    target="_blank"
                    rel="noopener noreferrer"
                >
                    Cliquez ici pour en savoir plus sur notre projet
                </a>
            </header>
        </div>
    );
}

export default App;
