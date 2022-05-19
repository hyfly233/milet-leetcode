/*

*/

use std::collections::HashMap;

fn main() {
    let nums = [2, 7, 11, 15, 1, 3, 4, 5, 7, 1];
    let target = 16;
    fun(nums, target);
    println!("Hello world")
}

fn fun(nums: [i32; 10], target: i32) {
    let mut maps = HashMap::new();

    let mut i = 0;
    loop {
        let ch = target - nums[i];
        if maps.contains_key(&ch) {
            let option = maps.get(&ch);
            match option {

                _ => println!("{}", i)
            }
        }
        maps.insert(nums[i], i);
        i += 1;
        if i >= nums.len() { break; }
    }
}
