import { Component, OnInit } from '@angular/core';
import { UserDto } from 'src/app/dtos/user.dto';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  users:UserDto[];
  constructor() { }

  ngOnInit() {

    // add values to the array
    this.users=[
      {
        id: 1,
        name: 'User1',
        age: 30,
        salary: 1000
      },
      {
        id: 2,
        name: 'User2',
        age: 31,
        salary: 900
      },
      {
        id: 3,
        name: 'User3',
        age: 28,
        salary: 1200
      }
    ];
  }
}
