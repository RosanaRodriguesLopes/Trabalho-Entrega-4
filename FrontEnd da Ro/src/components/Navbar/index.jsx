import React from "react";

import logo from '../../assets/img/LogoSemFundo.png'

import './styles.css'

function Navbar() {
  return (
    <header>
      <nav className="navbar navbar-expand-lg navbar-light">
        <div className="container-fluid">
          <a className="navbar-brand" href="/" rel="noreferrer">
            <img className="img--logo" src={logo} alt="" />
          </a>
          <button
            className="navbar-toggler"
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarTogglerDemo01"
            aria-controls="navbarTogglerDemo01"
            aria-expanded="false"
            aria-label="Toggle navigation"
          >
            <span className="navbar-toggler-icon"></span>
          </button>
          <div className="collapse navbar-collapse" id="navbarTogglerDemo01">
            <ul className="navbar-nav ms-auto mb-2 mb-lg-0">
              <li className="nav-item">
                <a className="nav-link" href="/" rel="noreferrer">
                  Home
                </a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="/destino" rel="noreferrer">
                  Destinos
                </a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="/promocoes" rel="noreferrer">
                  Promoções
                </a>
              </li>
              <li className="nav-item">
                <a className="nav-link" href="/contato" rel="noreferrer">
                  Contato
                </a>
              </li>
            </ul>
            <form className="d-flex">
              <input
                className="form-control me-2"
                type="search"
                placeholder="Search"
                aria-label="Search"
              />
              <button className="btn btn--search" type="submit">
                Buscar
              </button>
            </form>
          </div>
        </div>
      </nav>
    </header>
  );
}

export default Navbar;
