import { BrowserRouter, Route, Switch } from "react-router-dom";
import Main from "./components/Main";
import Aboutus from "./components/Aboutus";
import Contactus from "./components/Contactus";
import TopMenu from "./components/TopMenu";
import UsAboutus from "./components/UsAboutus";

function App() {
  return (
    <BrowserRouter>
      <TopMenu/>
      <Switch>
        <Route path="/home">
          <Main/>
        </Route>
        <Route path="/aboutus/us">
          <UsAboutus/>
        </Route>
        <Route path="/aboutus/:id/:name">
          <Aboutus/>
        </Route>
        <Route path="/contactus">
          <Contactus/>
        </Route>
      </Switch>
    </BrowserRouter>
  );
}

export default App;
