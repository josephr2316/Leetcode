#include <iostream>
#include <vector>
#include <unordered_map>   
#include <map>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        // unordered_map<int, int> map;
        // for (int i = 0; i < (int)nums.size(); i++) {
        //     int complement = target - nums[i];
        //     if (map.count(complement))
        //         return {map[complement], i};
        //     map[nums[i]] = i;
        // }

        // int n = nums.size();
        // for (int i = 0; i < n - 1; ++i) {
        //     for (int j = i + 1; j < n; ++j) {
        //         if (nums[i] + nums[j] == target) {
        //             return {i, j};
        //         }
        //     }
        // }

        // unordered_map<int, int> hashTable;

        // // First Pass - Populate Hash Table
        // for (int i = 0; i < nums.size(); ++i) {
        //     hashTable[nums[i]] = i;
        // }
    
        // // Second Pass - Find Complements
        // for (int i = 0; i < nums.size(); ++i) {
        //     int complement = target - nums[i];
        //     if (hashTable.find(complement) != hashTable.end() && hashTable[complement] != i) { // Iterator to check if the complement is in the hash table pointing to the index
        //         // check if the complement is in the hash table and if it is not the same index
        //         return {i, hashTable[complement]};
        //     }
        // }

        // vector<pair<int,int>> a;
        // a.reserve(nums.size());
        // for (int i = 0; i < (int)nums.size(); ++i) a.push_back({nums[i], i});

        // sort(a.begin(), a.end()); // ordena por valor

        // int l = 0, r = (int)a.size() - 1;
        // while (l < r) {
        //     long long sum = (long long)a[l].first + a[r].first;
        //     if (sum == target) return {a[l].second, a[r].second};
        //     if (sum < target) ++l;
        //     else --r;
        // }

        // unordered_map<int,int> pos; // valor -> índice
        // pos.reserve(nums.size() * 2);

        // for (int i = 0; i < (int)nums.size(); ++i) {
        //     int need = target - nums[i];
        //     auto it = pos.find(need);
        //     if (it != pos.end()) return {it->second, i};
        //     pos[nums[i]] = i;
        // }

        map<int,int> pos; // log n
        for (int i = 0; i < (int)nums.size(); ++i) {
            int need = target - nums[i];
            auto it = pos.find(need);
            if (it != pos.end()) return {it->second, i};
            pos[nums[i]] = i;
        }
        return {};
        return {};
    }
};

int main(){
    return 0;
}