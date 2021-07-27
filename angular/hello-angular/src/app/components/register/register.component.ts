import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  registerForm:FormGroup;
  constructor(private builder:FormBuilder,private service:UserService) { }

  ngOnInit() {
    this.loadRegisterForm();
  }

  loadRegisterForm():void{
    // this.registerForm = new FormGroup({
    //   id: new FormControl(),
    //   name: new FormControl('',Validators.required)
    // });
    this.registerForm = this.builder.group({
      id: ['',Validators.required],
      name: ['',Validators.required],
      dob: ['',Validators.required],
      salary: ['',Validators.compose([
        Validators.min(500),
        Validators.max(2500)
      ])]
    });
  }
  
  // define a simple getter to access the form controls for validations in template
  get registerFormControls() {
    return this.registerForm.controls;
  }
  
  registerUser(){
    //console.log(this.registerForm);
    if(this.registerForm.valid){
      this.service.addUser({
        id: this.registerForm.value.id,
        name: this.registerForm.value.name,
        dob: new Date(this.registerForm.value.dob),
        salary: this.registerForm.value.salary
      });
    }else{
      console.error('Form has Validation Errors');
    }
  }
}


// Forms - Reactive Forms
// Form Groups 
// Form Controls