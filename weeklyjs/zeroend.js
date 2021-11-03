function zeroesToEnd(numberArray){
    numberArray.sort((a, b)=>{
        if(a == 0) return 1;
        if(b == 0) return -1;
    })
    return numberArray;
}

console.log(zeroesToEnd([1,2,0,0,4,0,5]));
console.log(zeroesToEnd([0, 0, 2, 0, 5]));
console.log(zeroesToEnd([4, 4, 5]));
console.log(zeroesToEnd([0, 0]));