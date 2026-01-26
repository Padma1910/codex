# Last updated: 1/26/2026, 6:02:43 PM
class Solution(object):
    def twoSum(self, nums, target):
        
        for i in nums:
            diff = target - i

            if diff == i:
                pos_i = nums.index(i)
                nums.remove(i)

                if diff in nums:
                    pos_diff = nums.index(diff) + 1
                    out_lst = [pos_i, pos_diff]
                    return sorted(out_lst)
                    break

                else:
                    nums.insert(pos_i, i)

            else:
                pos_i = nums.index(i)

                if diff in nums:
                    pos_diff = nums.index(diff)
                    out_lst = [pos_i, pos_diff]
                    return sorted(out_lst)
                    break