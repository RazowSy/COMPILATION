import sys
from libwh import *

################################################################################
##                                                                            ##
##         Projet COMP - groupe Python                                        ##
##         Auteurs : Brunoy Sophy , Connan Hugues , Heye Erwan                ##
##                   Keroullas Solenn, Le Yhuelic Matthias , Melin Victor     ##
##                                                                            ##
################################################################################
global s1, s2, s3, s4 
s1="a" 
s2="b" 
s3="c" 
s4="d"

def f0 (v1) :
	t4 = [s1, s2]
	t3 = [t4, s3]
	t2 = [t3, s4]
	for i in range(0,numberOfCons(t2)) :
		v1 = [None, v1]
	return (v1)
 
#Partie main 

print f0(sys.argv[1])