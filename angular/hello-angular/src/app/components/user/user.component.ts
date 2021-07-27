import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { UserDto } from 'src/app/dtos/user.dto';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  phoneNumber:string;
  users:UserDto[];
  constructor() { }

  // get data from parent component
  @Input() data:number[];

  @Output() usrs:EventEmitter<UserDto[]> = new EventEmitter();

  ngOnInit() {

    console.log(this.data);
    // add values to the array
    this.users=[
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
  // get the value from text box via onInput Event
  getPhone(phone:Event){
    // get only the value
    console.log((<HTMLInputElement>phone.target).value);
  }

  // send events to parent component
  sendUsers(){
    this.phoneNumber = '8888888';
    this.usrs.emit(this.users);
  }
}
