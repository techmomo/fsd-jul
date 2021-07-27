import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'age'
})
export class AgePipe implements PipeTransform {

  transform(dob:Date): number {
    let today = new Date();
    let year = today.getFullYear();
    let _dob = new Date(dob);
    let year_diff = year - _dob.getFullYear();
    return year_diff;
  }
}
