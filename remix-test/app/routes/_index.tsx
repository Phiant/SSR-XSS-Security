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


    <form name="test">
      <input type="text" id="fname" name="fname"/><br/>
      <input type="text" id="lname" name="lname"/><br/>
      <input type="submit" value="Submit"/>    
    </form>  

    <div dangerouslySetInnerHTML={{__html: data}}></div>

    </div>


    );
  }


  