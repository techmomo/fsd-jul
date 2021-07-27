import { Component, OnInit } from '@angular/core';
import { UserDto } from 'src/app/dtos/user.dto';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  nums:number[];
  message:string = 'Home Controller'
  constructor() { }

  ngOnInit() {
    this.nums = [1,2,4,9,100];
  }

  // get the users from user component (child component)
  userHandler(users:UserDto[]){
    console.log(users);
  }
}
