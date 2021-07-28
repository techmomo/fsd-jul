import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AboutusComponent } from './components/aboutus/aboutus.component';
import { ContactusComponent } from './components/contactus/contactus.component';
import { HomeComponent } from './components/home/home.component';
import { NotfoundComponent } from './components/notfound/notfound.component';
import { TrymeComponent } from './components/tryme/tryme.component';
import { UserinfoComponent } from './components/userinfo/userinfo.component';


const routes: Routes = [
  {
    path: 'aboutus',
    component: AboutusComponent
  },
  {
    path: 'home',
    component: HomeComponent
  },
  {
    path: 'contactus',
    component: ContactusComponent
  },
  {
    path: 'user/info/:id',
    component: UserinfoComponent
  },
  {
    path: 'tryme',
    component: TrymeComponent
  },
  {
    path: '**',
    pathMatch: 'full',
    component: NotfoundComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
