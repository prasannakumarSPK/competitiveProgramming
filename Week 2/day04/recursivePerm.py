import unittest




import unittest


def get_permutations(string):
    # Base case
    if len(string) <= 1:
        return set([string])

    all_chars_except_last = string[:-1]
    
    last_char = string[-1]
    
    permutations_of_all_chars_except_last = get_permutations(all_chars_except_last)
    print(" permutations_of_all_chars_except_last", permutations_of_all_chars_except_last)
    
    permutations = set()
    for permutation_of_all_chars_except_last in permutations_of_all_chars_except_last:
        
        for position in range(len(all_chars_except_last) + 1):
            # print("in for",position)
            # print(" permutation_of_all_chars_except_last[:position],last_char,permutation_of_all_chars_except_last[position:]", permutation_of_all_chars_except_last[:position], last_char,permutation_of_all_chars_except_last[position:])
            permutation = (permutation_of_all_chars_except_last[:position]
                + last_char
                + permutation_of_all_chars_except_last[position:]
            )
            
            permutations.add(permutation)
        
        
    return permutations
