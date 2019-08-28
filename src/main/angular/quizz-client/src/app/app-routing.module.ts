import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { QuizzAppComponent } from './quizz-app/quizz-app.component';

const routes: Routes = [
  {
    path: 'quizz/start',
    component: QuizzAppComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
