import { Injectable } from '@angular/core';
import { UserDto } from '../dtos/user.dto';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  users:UserDto[];
  constructor() {
    this.users =[
      {
        id: 1,
        name: 'User1',
        dob: new Date("01/01/1990"),
        salary: 1000
      },
      {
        id: 2,
        name: 'User2',
        dob: new Date("10/10/2000"),
        salary: 900
      },
      {
        id: 3,
        name: 'User3',
        dob: new Date("02/02/1988"),
        salary: 1200
      }
    ];
   }

  getUsers(): UserDto[]{
    return this.users;
  }
  addUser(user:UserDto):UserDto[]{
    // add a new record to users array
    this.users.push(user);
    return this.users;
  }
}

// Dependency Injection
// Angular only supports constructor injection
// DI - Setter Injection / Constructor Injection / Interface Injection
