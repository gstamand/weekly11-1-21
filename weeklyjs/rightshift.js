function shiftToRight(number, shifts){

    for(let i = 0; i < shifts; i++){
        if(number % 2 != 0) number -= 1;
        number = number / 2;
    }
    return number;

}

console.log(shiftToRight(80, 3));
console.log(shiftToRight(-24, 2));
console.log(shiftToRight(-5, 1));
console.log(shiftToRight(4666, 6));
console.log(shiftToRight(3777, 6));
console.log(shiftToRight(-512, 10));