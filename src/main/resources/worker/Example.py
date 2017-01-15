__author__ = 'luv'

from org.jython.etl.interfaces import ExampleType
import java.util.HashMap as HashMap
from petl import *

class Example(ExampleType):
    def say_hello(self, args):
        unfold = HashMap(args)
        it = unfold.entrySet().iterator()
        while it.hasNext():
            p = it.next()
            print 'Python says', p.getKey(), p.getValue()
        return unfold


if __name__ == "__main__":
    example = Example()
    example.say_hello()