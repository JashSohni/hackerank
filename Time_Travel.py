year=input()
if year > 1918:
	if(year%400==0 or (year%4==0 and year%100!=0)):
		print "12.09.%d"%year
	else:
		print "13.09.%d"%year
elif year==1918:
	print "26.09.%d"%year
else:
	if year%4==0:
		print "12.09.%d"%year
	else:
		print "13.09.%d"%year
		
	