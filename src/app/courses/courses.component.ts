import { Component, OnInit } from '@angular/core';
import { getAllCourse } from 'src/data/data';

 
@Component({
selector: 'app-courses',
templateUrl: './courses.component.html',
styleUrls: ['./courses.component.css']
})
export class CoursesComponent implements OnInit {
private courseData=getAllCourse()
 
constructor() { }
 
ngOnInit() {
 }
 
}