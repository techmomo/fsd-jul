import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'age'
})
export class AgePipe implements PipeTransform {

  transform(dob:Date): number {
    let today = new Date();
    let year = today.getFullYear();
    let year_diff = year - dob.getFullYear();
    return year_diff;
  }
}
