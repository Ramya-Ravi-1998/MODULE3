import { Component, OnInit } from '@angular/core';
import { Post } from '../courses/model/post.model';
import { HttpClient } from '@angular/common/http';
import { Router } from '@angular/router';


@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {

  private postData:Post[]=[];
  constructor(private http:HttpClient, private router:Router) { }

  ngOnInit() {
    this.http.get<Post[]>('http://jsonplaceholder.typicode.com/posts')
    .subscribe(
      (response:Post[])=>{
        console.log('response recv from server...');
        console.log(response);
        this.postData=response;
      },
      (error)=>{
        console.log('error')
      }
      )

    
  }
  
  addNewPost(){
    this.router.navigate(['/postform']);
  }

}
