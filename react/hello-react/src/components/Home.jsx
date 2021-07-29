import React from "react";

class Home extends React.Component{
    render(){
        return(
            <div>
                {
                    <h2>this.props.message</h2>
                }
                <h3>Home Component</h3>
            </div>
        );
    }
}

export default Home;