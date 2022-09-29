import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MyAngularApp';

  userData:any =[
    { "id": "24323", 
      "name": "Pizza", 
      "price": "199" },
    { "id": "24564",
      "name": "Burger", 
      "price": "299" },
      { "id": "2423", 
      "name": "garlic bread", 
      "price": "119" },
      { "id": "2323", 
      "name": "pepsi", 
      "price": "99" }
];



constructor(){
}
}
