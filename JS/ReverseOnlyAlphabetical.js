// -----------------***Helper function*** ---------
/**
 * function to swap the charecter using 2 pointer: start and  end
 * @param {*} arr array of charecters
 * @param {*} start pointer indicating start of the array
 * @param {*} end pointer indicating end of the array
 */
function swap(arr, start, end){
    let temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
}

function isAlphabet(c){
    return ( c >= 65 && c <= 90 ) || ( c >= 97 && c <= 122 )
}

function reverseOnlyAlphabets(str){
    const result = str.split("");
    let left = 0;
    let right = result.length - 1;

    while (left < right){
        if (!isAlphabet(result[left].charCodeAt())){
            left ++;
        } else if (!isAlphabet(result[right].charCodeAt())){
            right --;
        } else {
            swap(result, left++, right++)
        }
    }
    return result.join("");

}

console.log(reverseOnlyAlphabets("sea!$hells3"));

