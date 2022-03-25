import './styles.css'

function Contato() {
  return (
    <main>
      <section className="contato--secao container">
        <div className="form--conteudo row">
          <form className='form--contato'>
            <div class="mb-3">
              <label for="exampleInputEmail1" class="form-label">
                Nome
              </label>
              <input
                type="text"
                class="form-control"
                id="exampleInputEmail1"
                aria-describedby="emailHelp"
              />
            </div>
            <div class="mb-3">
              <label for="exampleInputEmail1" class="form-label">
                Email
              </label>
              <input
                type="email"
                class="form-control"
                id="exampleInputEmail1"
                aria-describedby="emailHelp"
              />
            </div>
            <div class="mb-3">
              <label for="exampleFormControlTextarea1" class="form-label">
                Example textarea
              </label>
              <textarea
                class="form-control"
                id="exampleFormControlTextarea1"
                rows="7"
              ></textarea>
            </div>
            <button type="submit" class="btn btn-primary">
              Submit
            </button>
          </form>
        </div>
      </section>
    </main>
  );
}

export default Contato;
