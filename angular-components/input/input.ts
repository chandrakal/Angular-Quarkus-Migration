
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
    // Your logic here
  }
}
