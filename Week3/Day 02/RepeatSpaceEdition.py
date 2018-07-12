import unittest


def find_repeat(the_list):

	# Find a number that appears more than once

	the_list.sort()

	for i in range(len(the_list)-1):
		if the_list[i]==the_list[i+1]:
			return the_list[i]
	

	return 0

