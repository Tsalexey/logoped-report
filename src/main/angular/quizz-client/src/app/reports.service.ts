import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import * as FileSaver from 'file-saver';

@Injectable({
  providedIn: 'root'
})

export class ReportsService {

  uri = 'http://' + window.location.host + '/reports';

  constructor(private http: HttpClient) {
  }

  getReportTemplate() {
    return this
      .http
      .get(`${this.uri}/ndvpfd`);
  }

  generateReport(Report) {
    const obj = Report;

    console.log("Report to be converted:");
    console.log(obj);

    this.http.post(`${this.uri}/documents`, obj, {responseType: 'blob'})
      .subscribe(data => FileSaver.saveAs(data, "Отчет_"+(new Date().toLocaleString() + ".doc"))),
      error => console.log('Error downloading the file.'),
      () => console.info('OK');
  }

}
