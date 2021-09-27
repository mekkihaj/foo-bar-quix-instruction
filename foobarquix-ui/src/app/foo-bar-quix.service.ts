import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Result } from './model/result';

const baseUrl = 'http://localhost:8080/foo-bar-quix';
@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  constructor(private http: HttpClient) { }

  convertNumber(inputNumber: Number): Observable<Result> {
    return this.http.get<Result>(`${baseUrl}/${inputNumber}`);
  }
}
