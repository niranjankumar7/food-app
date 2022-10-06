import { Component, OnInit } from '@angular/core';
import { MenuService } from '../Services/menu.service';

@Component({
  selector: 'app-branch',
  templateUrl: './branch.component.html',
  styleUrls: ['./branch.component.css']
})
export class BranchComponent implements OnInit {
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
