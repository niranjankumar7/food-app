import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class BranchService {

  constructor(private http : HttpClient) { }
  getmenu(){
    return this.http.get("http://localhost:8080/foodProduct");
   }
}
