import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { UserDto } from 'src/app/dtos/user.dto';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-userinfo',
  templateUrl: './userinfo.component.html',
  styleUrls: ['./userinfo.component.css']
})
export class UserinfoComponent implements OnInit {

  user:UserDto= undefined;
  constructor(private route:ActivatedRoute,private service:UserService) { }

  ngOnInit() {
    // get the route parameter value by key
    this.route.paramMap.subscribe(map=>{
      console.log("User ID : "+map.get('id'));
      const id:number= parseInt(map.get('id'));

      this.service
      .getUserInfo(id)
      .subscribe(usr=>{
        this.user = usr;
      });
    });
  }
}
