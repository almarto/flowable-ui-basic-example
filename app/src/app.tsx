import * as React from "react";
import * as ReactDOM from "react-dom";

import "./main.scss";
import logoHero from "./assets/logo_hero.png";

const App = () => (
  <div className="mainApp">
    <img src={logoHero} />
    <h1>Hello from the fantastic Flowable UI!</h1>
  </div>
);

ReactDOM.render(<App />, document.getElementById("app"));
