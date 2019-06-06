import { TestBed } from '@angular/core/testing';

import { DirectoresService } from './directores.service';

describe('DirectoresService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: DirectoresService = TestBed.get(DirectoresService);
    expect(service).toBeTruthy();
  });
});
