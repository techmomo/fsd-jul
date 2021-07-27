import { Component, EventEmitter, Input, OnInit, Output } from '@angular/core';
import { UserDto } from 'src/app/dtos/user.dto';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {

  phoneNumber:string;
  users:UserDto[]=[];
  // inject the service instance
  constructor(private service:UserService) { }

  // get data from parent component
  @Input() data:number[];

  @Output() usrs:EventEmitter<UserDto[]> = new EventEmitter();

  ngOnInit() {
    console.log(this.data);
    // add values to the array
    //this.users= this.service.getUsers();
    this
      .service
      .getUsers()
      .subscribe(usrs=>{
        this.users = usrs;
    });

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
