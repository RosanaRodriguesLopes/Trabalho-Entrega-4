import React from "react";

import logoFooter from "../../assets/img/LogoSemFundo.png";

import "./styles.css";

function Footer() {
  return (
    <footer>
      <div className="logo--footer mb-2">
        <img src={logoFooter} alt="" />
      </div>
      <div className="menu--footer mb-2 mt-4">
          <h6>Mapa do Site</h6>
        <ul>
          <li>
            <a href="/" rel="noreferrer">
              Home
            </a>
          </li>
          <li>
            <a href="/" rel="noreferrer">
              Destinos
            </a>
          </li>
          <li>
            <a href="/" rel="noreferrer">
              Promoções
            </a>
          </li>
          <li>
            <a href="/" rel="noreferrer">
              Contato
            </a>
          </li>
        </ul>
      </div>
      <div className="footer--descricao mb-2">
        <p>
          Lorem ipsum dolor sit amet consectetur adipisicing elit. Repudiandae
          nesciunt, eos eaque hic incidunt exercitationem quaerat soluta.
        </p>
      </div>
    </footer>
  );
}

export default Footer;
