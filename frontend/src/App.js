import React, { Component } from "react";
import logo from "./logo.svg";
import "./App.css";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      demoValue: "",
    };
  }
  componentDidMount() {
    const URL = "http://localhost:8080/api/demo";
    fetch(URL, { mode: "cors" })
      .then((res) => res.json())
      .then((json) => {
        this.setState({
          demoValue:
            json == null || json.value == null ? "error!!" : json["value"],
        });
      })
      .catch((error) => {
        this.setState({
          demoValue: error.message,
        });
      });
  }

  render() {
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <p>
            {this.state.demoValue}
            <br />
            Edit <code> src / App.js </code> and save to reload.{" "}
          </p>{" "}
          <a
            className="App-link"
            href="https://reactjs.org"
            target="_blank"
            rel="noopener noreferrer"
          >
            Learn React{" "}
          </a>{" "}
        </header>{" "}
      </div>
    );
  }
}

export default App;
