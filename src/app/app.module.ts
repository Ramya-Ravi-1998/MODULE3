import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { CoursesComponent } from './courses/courses.component';
import { Routes, RouterModule } from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { HomeComponent } from './home/home.component';
import { PostComponent } from './post/post.component';
import { HttpClientModule} from '@angular/common/http';
//import { PostFormComponent } from './post-form/postform.component';
import { PostFormComponent } from './postform/postform.component';




const appRoutes:Routes = [
  { path: ' ', component: HomeComponent},
  {path:'Post', component: PostComponent},
  { path:'courses', component: CoursesComponent},
  {path:'postform', component:PostFormComponent}
    ]


@NgModule({
  declarations: [
    AppComponent,
    CoursesComponent,
    NavbarComponent,
    HomeComponent,
    PostComponent,
    PostFormComponent
    
   
  
  
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes),
    HttpClientModule,
   
  ],



  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
