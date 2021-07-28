import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-tryme',
  templateUrl: './tryme.component.html',
  styleUrls: ['./tryme.component.css']
})
export class TrymeComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit() {
    // redirect or navigate to another route
    this.router.navigate(['/home']);
  }
}
