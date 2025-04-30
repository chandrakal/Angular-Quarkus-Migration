
import { Component } from '@angular/core';

@Component({
  selector: 'app-user-registration',
  templateUrl: './user-registration.component.html',
  styleUrls: ['./user-registration.component.css']
})
export class UserRegistrationComponent {
  firstName: string;
  lastName: string;
  age: number;
  address: string;

  onSubmit() {
    console.log('Form submitted with values:', this.firstName, this.lastName, this.age, this.address);
  }
}
