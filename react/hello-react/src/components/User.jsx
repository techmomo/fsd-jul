import React from "react";

class User extends React.Component{

    constructor(props){
        super(props);
        this.state = {
            id: 0,
            name: '',
            dob: '',
            salary: 0,
            users: []
        };
        
        this.getUsers();
        this.handleChange = this.handleChange.bind(this);
        this.handleSubmit = this.handleSubmit.bind(this);
    }
    calculateAge(dob){
        const birthYear = new Date(dob);
        return new Date().getFullYear() - birthYear.getFullYear();
    }
    getUsers(){
        fetch('http://localhost:9000/users')
        .then(res=>res.json())
        .then(data=>{
            this.setState({
                users: data
            });
        }).catch(err=>{
            console.log(err);
        });
    }
    handleChange(event){
        const target = event.target;
        const name = target.name;
        // set info into state
        this.setState({
            [name]: target.value
        });
    }

    handleSubmit(event){
        console.log(this.state);
        // call save /api
        fetch('http://localhost:9000/users',{
            method: 'POST',
            body: JSON.stringify({
                id : this.state.id,
                name: this.state.name,
                dob: this.state.dob,
                salary: this.state.salary
            }),
            headers: {
                'Content-Type': 'application/json'
          }
        })
        .then(res=>res.json())
        .then(res=>{
            //console.log(res);
            this.getUsers();
            alert('User Saved Successfully');
        }).catch(err=>{
            console.log(err);
            alert('Unable to save user, please try again later');
        });
        event.preventDefault(); 
    }
    render(){
        return(
            <div>
                <form onSubmit={this.handleSubmit}>
                    <input type="number" name="id" placeholder="ID" onChange={this.handleChange} />
                    <input type="text" name="name" placeholder="Name" onChange={this.handleChange} />
                    <input type="date" name="dob" placeholder="Date of Birth" onChange={this.handleChange}/>
                    <input type="number" name="salary" placeholder="Salary" onChange={this.handleChange} />
                    <button type="submit">Save User</button>
                </form>
                <table>
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Name</th>
                            <th>Age</th>
                            <th>Salary</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.users.map((u,index)=>( 
                                <tr key={index}>
                                    <td>{u.id}</td>
                                    <td>{u.name}</td>
                                    <td>{this.calculateAge(u.dob)}</td>
                                    <td>{u.salary}</td> 
                                </tr>
                            ))
                        }
                    </tbody>
                </table>
            </div>
        );
    }
}

export default User;