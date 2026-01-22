import "./societies.css";
import { useState, useEffect} from "react";

function SocietiesPage() {
    const [societies, setSocieties] = useState([]);
    useEffect(() => {
        fetch('/api/societies'
        ).then(res => res.json())
        .then(data => setSocieties(data));
    }, []);
    return (
    <div className="societies-page">
        <header className="header">
            <h1>Societies Page</h1>
            <nav className="navbar">
                <div className="navbar-left">
                    <a href="/" className="logo">
                    Socialhub
                    </a>
                </div>
                <div className="navbar-center"> 
                    <ul className="nav-links">
                        <li>
                            <a href="/events">Events</a>
                        </li>
                        <li>
                            <a href="/societies">Societies</a>
                        </li>
                        <li>
                            <a href="/profile">Profile</a>
                        </li>
                        <li>
                            <a href="/about">About</a>
                        </li>
                        <li>
                            <a href="/contact">Contact</a>
                        </li>
                        <li>
                            <a href="/login">Login</a>
                        </li>
                        <li>
                            <a href="/register">Register</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </header>

        <section className="controls">

        </section>

    <div className="grid">
        {societies.map((society) => (
        <div key={society.id} className="society-card">
            <div className="society-card-image">
                {society.imageUrl ? (
                    <img src={society.imageUrl} alt={society.name} />
                ) : (
                    <div className="society-card-image-fallback">
                        {society.name[0]}
                    </div>
                )}
            </div>
            <div className="society-card-top">
                <h2 className="society-card-name">{society.name}</h2>
                <span className="society-card-fee">£{Number(society.membershipFee).toFixed(2)}</span>
            </div>

            <div className="society-card-members">
                {society.memberCount} members
            </div>

            <p className="society-card-description">
                {society.description}
            </p>
        </div>
    ))}
    </div>
    </div>
    );
}

export default SocietiesPage;