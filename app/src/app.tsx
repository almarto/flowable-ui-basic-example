import * as React from "react";
import * as ReactDOM from "react-dom";

import "./main.scss";
import logoHero from "./assets/logo_hero.png";
import api from "./api";

const App = () => (
  <div className="mainApp">
    <img src={logoHero} />
    <h1>Hello from the fantastic Flowable UI!</h1>

    <button onClick={doLogin}>PUSH ME TO LOGIN</button>
  </div>
);

const doLogin = async () => {
  try {
    const loginResult = await api.login();

    console.log(loginResult);
  } catch (err) {
    console.error(err);
  }
};

ReactDOM.render(<App />, document.getElementById("app"));
