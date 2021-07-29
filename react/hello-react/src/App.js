import React, { useState } from 'react';
import Home from './components/Home';
import User from './components/User';

function App() {
  const [message,setMessage] = useState('');
  let _msg = React.createRef();

  function handleMessage(){
    //console.log(_msg.current.value);
    setMessage(_msg.current.value);
  }
  return (
    <div>
      <h3>Hello React</h3>
      <input type='text' name='msg' ref={_msg} />
      <button onClick={handleMessage}> Click Me!</button>
      <Home message={message}></Home>
      <User/>
    </div>
  );
}

export default App;
