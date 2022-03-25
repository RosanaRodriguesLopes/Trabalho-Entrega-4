import BannerPromocao from "../../assets/img/bannerPromoçoes.png";

import './styles.css'

function Promocoes() {
  return (
    <main>
      <section className="banner--promocao">
        <img className="imagem--promocao" src={BannerPromocao} alt="" />
      </section>
    </main>
  );
}

export default Promocoes;
