import unittest


class Node(object):

    def __init__(self):
        self.root_node = {}

    def add_word(self, word):
        current_node = self.root_node
        is_new_word = False 
        
        for character in word:
            if character not in current_node:
                is_new_word = True
                current_node[character] = {}
                
            current_node = current_node[character]

        if "End Of Word" not in current_node:
            is_new_word = True
            current_node["End Of Word"] = {}
        return is_new_word




# Tests

class Test(unittest.TestCase):

    def test_t_usage(self):
        t = Node()

        result = t.add_word('catch')
        self.assertTrue(result, msg='new word 1')

        result = t.add_word('cakes')
        self.assertTrue(result, msg='new word 2')

        result = t.add_word('cake')
        self.assertTrue(result, msg='prefix of existing word')

        result = t.add_word('cake')
        self.assertFalse(result, msg='word already present')

        result = t.add_word('caked')
        self.assertTrue(result, msg='new word 3')

        result = t.add_word('catch')
        self.assertFalse(result, msg='all words still present')

        result = t.add_word('')
        self.assertTrue(result, msg='empty word')

        result = t.add_word('')
        self.assertFalse(result, msg='empty word present')


unittest.main(verbosity=2)