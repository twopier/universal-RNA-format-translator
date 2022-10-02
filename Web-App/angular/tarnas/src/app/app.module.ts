import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent } from './app.component';
import {HttpClientModule} from '@angular/common/http';
import { TranslateService } from './service/translate.service';
import { CleanService } from './service/clean.service';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [TranslateService,CleanService],
  bootstrap: [AppComponent]
})
export class AppModule { }