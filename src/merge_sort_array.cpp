#include "../include/merge_sort_array.hpp"

void shift(std::vector<int>* num, int index) {
  if (num == nullptr || index < 0 || index >= num->size()) {
    return; // Or throw an exception, or handle the error as appropriate
  }
  
  for(int i = num->size() - 1; (i != index) && i != 0; i--){
    num->at(i) = num->at(i-1);
  }
}    

void merge(std::vector<int> &nums1, int m, std::vector<int> &nums2, int n){

  auto f1 = nums1.begin();
  auto f2 = nums2.begin();

  int end = m+n;

  for(int i = 0; i < end; i++){
    if(*f1 < *f2) {
      f1++;
    } else {
      shift(&nums1, i);
      nums1[i] = *f2;
      f2++;
    }
  };
}
