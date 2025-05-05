#include "../include/merge_sort_array.hpp"
#include <gtest/gtest.h>
#include <vector>

TEST(MergeSortArray, DefaultTest) {
  std::vector<int> nums1 = {1, 2, 3, 0, 0, 0};
  std::vector<int> nums2 = {2, 5, 6};
  std::vector<int> expected = {1, 2, 2, 3, 5, 6};
  merge(nums1, 3, nums2, 3);
  
  EXPECT_EQ(nums1, expected);
}
