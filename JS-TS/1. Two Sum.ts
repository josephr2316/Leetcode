function twoSum(nums: number[], target: number): number[] {
    // Brute force approach
    // for (let i = 0; i < nums.length; i++) {
    //     for (let j = i + 1; j < nums.length; j++) {
    //         if (nums[i] + nums[j] === target) {
    //             return [i, j];
    //         }
    //     }
    // }


    // Hash table approach
    // const numMap: Record<number, number> = {};
    // for (let i = 0; i < nums.length; i++) {
    //     const complement = target - nums[i];
    //     if (numMap[complement] !== undefined) {
    //         return [numMap[complement], i];
    //     }
    //     numMap[nums[i]] = i;
    // }

    // const map = new Map();
    // for (let i = 0; i < nums.length; i++) {
    //     const complement = target - nums[i];
    //     if (map.has(complement)) {
    //         return [map.get(complement), i];
    //     }
    //     map.set(nums[i], i);
    // }
    // return [];

    // const numIndices: { [key: number]: number } = {}; //It's not so optimal but it's a good way to solve the problem.
    // for (let i = 0; i < nums.length; i++) {
    //     const complement = target - nums[i];
    //     if (complement in numIndices) {
    //         return [numIndices[complement], i];
    //     }
    //     numIndices[nums[i]] = i;
    // }
    // throw new Error("No solution found!");


//  let numbers: { num: number, index: number }[] = nums.map((num, index) => ({ num, index }));
//     numbers.sort((a, b) => a.num - b.num);

//     let left = 0, right = nums.length - 1;
//     while(left < right) {
//         let sum = numbers[left].num + numbers[right].num;
//         if(sum === target) {
//             return [numbers[left].index, numbers[right].index];
//         } else if(sum < target) {
//             left++;
//         } else {
//             right--;
//         }
//     }
//     return [];}

// const map = new Map<number, number>();

// for (let i = 0; i < nums.length; i++) {
//     const need = target - nums[i];
//     if (map.has(need)) {
//         return [map.get(need)!, i];
//     }
//     map.set(nums[i], i);
// }
// return [];

// function twoSum(nums: number[], target: number): number[] {
//     const map = new Map<number, number>();

//     nums.forEach((v, i) => map.set(v, i));

//     for (let i = 0; i < nums.length; i++) {
//         const need = target - nums[i];
//         if (map.has(need) && map.get(need) !== i) {
//             return [i, map.get(need)!];
//         }
//     }
//     return [];

// function twoSum(nums: number[], target: number): number[] {
//     const arr = nums.map((v, i) => [v, i] as [number, number]);
//     arr.sort((a, b) => a[0] - b[0]);

//     let l = 0, r = arr.length - 1;
//     while (l < r) {
//         const sum = arr[l][0] + arr[r][0];
//         if (sum === target) return [arr[l][1], arr[r][1]];
//         sum < target ? l++ : r--;
//     }
    return [];

    // const map = new Map();

    // for (let i = 0; i < nums.length; i++) {
    //     const need = target - nums[i];
    //     if (map.has(need)) {
    //         return [map.get(need), i];
    //     }
    //     map.set(nums[i], i);
    // }
    // return [];


    // const map = new Map();
    // nums.forEach((v, i) => map.set(v, i));

    // for (let i = 0; i < nums.length; i++) {
    //     const need = target - nums[i];
    //     if (map.has(need) && map.get(need) !== i) {
    //         return [i, map.get(need)];
    //     }
    // }
    // return [];


    const arr = nums.map((v, i) => [v, i]);
    arr.sort((a, b) => a[0] - b[0]);

    let l = 0, r = arr.length - 1;
    while (l < r) {
        const sum = arr[l][0] + arr[r][0];
        if (sum === target) return [arr[l][1], arr[r][1]];
        sum < target ? l++ : r--;
    }
    return [];
}
// "Main": se ejecuta al correr el archivo (node / ts-node)
console.log(twoSum([2, 7, 11, 15], 9));  // [0, 1]