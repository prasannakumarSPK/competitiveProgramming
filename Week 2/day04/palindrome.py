
import unittest


def has_palindrome_permutation(string):

    # Check if any permutation of the input is a palindrome
    freq = {}

    for ch in string:
        if ch in freq:
            del freq[ch]
        else:
            freq[ch] = True

    return len(freq) <= 1
