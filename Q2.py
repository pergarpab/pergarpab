#Coding Question 2: Reverse the order of elements in an array (without creating a new array)

__author__ = "Pablo Perez Garcia"

class Array(object):

	def generate_array(self):
	
		from random import seed
		from random import randint
		
		self.n =20
		self.array = []
		
		seed(1)
		
		for i in range(self.n - 1):
			self.array.append(randint(0,30))
		
	def tidy_array(self):
	
		import numpy as np
		
		self.sorted_array = np.sort(self.array)
		self.final_array = np.append(self.sorted_array,[0])
		
	def add_value(self,x):
	
		import numpy as np
		
		self.final_array_with_value = np.delete(self.final_array, 19)
		self.final_array_with_value = np.append(self.final_array_with_value, x)
		self.final_array_with_value = np.sort(self.final_array_with_value)
		
	def reverse2(self):
	
		self.array.reverse()
		
		
Q2 = Array()
Q2.generate_array()

print (Q2.array)

Q2.reverse2()
print (Q2.array)
#Q1.tidy_array()


#print (Q1.final_array)

#Q1.add_value(14)
#print (Q1.final_array_with_value)