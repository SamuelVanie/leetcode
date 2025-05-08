#include "../include/merge_sort_array.hpp"
#include <gtest/gtest.h>
#include <vector>

TEST(ShiftArray, DefaultTest) {
  std::vector<int> nums1 = {1, 2, 3, 0, 0, 0};
  std::vector<int> exp1 = {1, 2, 2, 3, 0, 0};
  shift(&nums1, 1);
  EXPECT_EQ(nums1, exp1)
  ;
}

TEST(ShiftArray, BeginningOfList) {
  std::vector<int> nums2 = {1, 2, 3, 4, 5, 6};
  std::vector<int> exp2 = {1, 1, 2, 3, 4, 5};
  shift(&nums2, 0);
  EXPECT_EQ(nums2, exp2);
}


TEST(MergeSortArray, DefaultTest) {
  std::vector<int> nums1 = {1, 2, 3, 0, 0, 0};
  std::vector<int> nums2 = {2, 5, 6};
  std::vector<int> expected = {1, 2, 2, 3, 5, 6};
  merge(nums1, 3, nums2, 3);
  
  EXPECT_EQ(nums1, expected);
}
