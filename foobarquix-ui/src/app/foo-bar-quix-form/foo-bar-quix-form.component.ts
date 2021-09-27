import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {

  @Output()
  submitNumberOutput = new EventEmitter<number>();

  inputNumberForm: FormGroup;
  public inputNumber: number;

  constructor(private formBuilder: FormBuilder) {
    this.createForm();
  }

  ngOnInit(): void {
    
  }

  createForm(){
    this.inputNumberForm = this.formBuilder.group({
      inputNumber: new FormControl('', {
        validators: [Validators.required],
        updateOn: 'blur'
      })
    });
  }

  submitNumber(): void {
    console.log('The input number is : ' + this.inputNumber);
    this.submitNumberOutput.emit(this.inputNumber);
    this.inputNumberForm.reset();
  }

}
