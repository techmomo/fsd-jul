import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserDto } from '../dtos/user.dto';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  users:UserDto[];
  constructor(private http:HttpClient) {
    // this.users =[
    //   {
    //     id: 1,
    //     name: 'User1',
    //     dob: new Date("01/01/1990"),
    //     salary: 1000
    //   },
    //   {
    //     id: 2,
    //     name: 'User2',
    //     dob: new Date("10/10/2000"),
    //     salary: 900
    //   },
    //   {
    //     id: 3,
    //     name: 'User3',
    //     dob: new Date("02/02/1988"),
    //     salary: 1200
    //   }
    // ];
   }

  getUsers(): Observable<any>{
    return this
      .http
      .get('http://localhost:9000/users');
  }

  getUserInfo(id:number): Observable<any>{
    return this
      .http
      .get(`http://localhost:9000/users/${id}`);
  }
  addUser(user:UserDto):UserDto[]{
    // save user on server
    this
      .http
      .post('http://localhost:9000/users',user)
      .subscribe(info=>
        console.log(info)
        );

    // add a new record to users array
    //this.users.push(user);
    return this.users;
  }
}

// Dependency Injection
// Angular only supports constructor injection
// DI - Setter Injection / Constructor Injection / Interface Injection




// Angular <=> REST APIs via Spring Boot <=> JPA <=> MySQL