import { Component, OnInit } from '@angular/core';
import { FormGroup,  FormBuilder,  Validators } from '@angular/forms';
import { ReportsService } from '../reports.service';

import Report from '../model/Report';

@Component({
  selector: 'app-quizz-app',
  templateUrl: './quizz-app.component.html',
  styleUrls: ['./quizz-app.component.css']
})

export class QuizzAppComponent implements OnInit {

  angForm: FormGroup;
  report: Report;

  constructor(private fb: FormBuilder, private rs: ReportsService) {
    // this.createForm();
  }

  createForm() {
    this.angForm = this.fb.group({
      ProductName: ['', Validators.required ],
      ProductDescription: ['', Validators.required ],
      ProductPrice: ['', Validators.required ]
    });
  }

  generateReport(Report) {
    this.rs.generateReport(Report);
  }

  ngOnInit() {
    this.rs
      .getReportTemplate()
      .subscribe((data: Report) => {
        this.report = data;
        console.log(this.report);
      });
  }
}
