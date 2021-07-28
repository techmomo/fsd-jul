import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { UserComponent } from './components/user/user.component';
import { AgePipe } from './pipes/age.pipe';
import { RegisterComponent } from './components/register/register.component';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from "@angular/common/http";
import { TopmenuComponent } from './components/topmenu/topmenu.component';
import { ContactusComponent } from './components/contactus/contactus.component';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { UserinfoComponent } from './components/userinfo/userinfo.component';
import { NotfoundComponent } from './components/notfound/notfound.component';
import { TrymeComponent } from './components/tryme/tryme.component';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    UserComponent,
    AgePipe,
    RegisterComponent,
    TopmenuComponent,
    ContactusComponent,
    AboutusComponent,
    UserinfoComponent,
    NotfoundComponent,
    TrymeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
