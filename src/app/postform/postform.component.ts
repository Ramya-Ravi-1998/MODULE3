import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-postform',
  templateUrl: './postform.component.html',
  styleUrls: ['./postform.component.css']
})
export class PostFormComponent implements OnInit {

  private postform:FormGroup;
  constructor(private http:HttpClient) { }

  ngOnInit() {
    this.postform=new FormGroup({
    userId:new FormControl('')
    // id: new FormControl(''),
    // title: new FormControl(''),
    // body: new FormControl('')
    });
    }

  addPost(){
    console.log('form data');
  //this.http.post('https://jsonplaceholder.typicode.com/posts')
  console.log(this.postform.value);
  }

}
