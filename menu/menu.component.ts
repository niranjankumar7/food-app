import { Component, OnInit } from '@angular/core';
import { MenuService } from '../Services/menu.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

    result:any;
    
      constructor(private menu:MenuService) { }
      ngOnInit(): void {
        this.menu.getmenu().subscribe((data:any)=>
        {
          this.result = data;
          console.log(this.result);
        })
      }
    }
