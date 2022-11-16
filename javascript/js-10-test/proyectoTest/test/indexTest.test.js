// const indexTest = require ('../indexTest')
// test('test suma', () => {
//     const r = indexTest.suma(1,2) 
//     expect (r).toBe(3)
// });

/* import { indexTest } from "../calculadora";
test('test suma', () => {
        const r = indexTest.suma(1,2) 
        expect (r).toBe(3)
    });

    test.todo('test de resta');
    test.todo('test de mult');
    test.todo('test de divide'); */
/* 
 const suma = require ('../calculadora')
test('test suma', () => {
        const r = suma.suma(1,2) 
        expect (r).toBe(3)
    }); */

    test('object assignment', () => {
        const data = {one:1};
        data['two'] = 2;
        expect(data).toEqual({one: 1, two: 2});
    });