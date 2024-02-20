var data = 'lorem <b>ipsum</b>';

export default function Index() {
    return (
      <div>
      <p id="index-page">
        This is a demo for Remix.
        <br />
        Check out{" "}
        <a href="https://remix.run">the docs at remix.run</a>.
      </p>


      <form method="get" action="/search">
        <label>Search <input name="term" type="text" /></label>
        <button type="submit">Search</button>
      </form>

    <div dangerouslySetInnerHTML={{__html: data}}></div>

    </div>


    );
  }


  