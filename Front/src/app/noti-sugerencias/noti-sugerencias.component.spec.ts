import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NotiSugerenciasComponent } from './noti-sugerencias.component';

describe('NotiSugerenciasComponent', () => {
  let component: NotiSugerenciasComponent;
  let fixture: ComponentFixture<NotiSugerenciasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NotiSugerenciasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NotiSugerenciasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
