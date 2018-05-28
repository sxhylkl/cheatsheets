#!/usr/bin/python3
# -*- coding: utf-8 -*-

#nach attribut name in liste l suchen
any(x.name == "t2" for x in l)

#===============================================================================
# >>> from timeit import timeit
# >>> timeit("[]")
#===============================================================================

### dynamic strings ###
print("Mein Name ist %s, Nachname %s" % ('Faruk', 'Heynemann'))

# f-strings since Python 3.6.3
name = 'Faruk'
print(f'Hi {name} how are you doing?')


### ternäry operator ###
condition = True
a if condition else b  # funktioniert auch mit defs

# Hässlichere varianten:
# (if C: x else: y)  # Eclipse mag das nicht
# (falseValue, trueValue)[test]
# (falseValue, trueValue)[test == True]
# (falseValue, trueValue)[bool(condition)]
# result = {True: x, False: y}[a > b]
# (falseValue, trueValue)[test]
### Tern�hrer Operator ###
# https://en.wikipedia.org/wiki/%3F:#Python

getsizeof()

b"abcde".decode("utf-8")
"abcde".encode("utf-8")


def list_compare(self, old, new):
    """ return{'rem':[miss in new], 'add':[miss in old]} """
    return {
        'rem': [x for x in old if x not in new],
        'add': [x for x in new if x not in old]
        }


def get_x_by_filter(list_, filter_='', keep=-1, newest=True):
    """ returns dict of del and keep from filtered list, 
    defaults to keep newest 
    """
    ret = {'del': [], 'keep': []}
    for elem in sorted(list_, reverse=newest):
        if elem.startswith(filter_):
            if keep >= 0:
                if len(ret['keep']) <= keep - 1:
                    ret['keep'].append(elem)
                else:
                    ret['del'].append(elem)
            else:
                ret['keep'].append(elem)
    return ret


import pdb
pdb.set_trace()

import time
start_time = time.time()
main()
print("--- %s seconds ---" % (time.time() - start_time))

class timing:

    def __init__(self):
        import atexit
        from time import time, strftime, localtime
        from datetime import timedelta
        start = time()
        atexit.register(endlog)
        log("Start Program")

    def secondsToStr(elapsed=None):
        if elapsed is None:
            return strftime("%Y-%m-%d %H:%M:%S", localtime())
        else:
            return str(timedelta(seconds=elapsed))
    
    def log(s="", elapsed=None):
        line = "="*40
        print(line)
        print(secondsToStr(), '-', s)
        if elapsed:
            print("Elapsed time:", elapsed)
        print(line)
        print()
    
    def endlog():
        end = time()
        elapsed = end - start
        log("End Program", secondsToStr(elapsed))


class C:

    def __init__(self):
        self._x = None

    @property
    def x(self):
        """I'm the 'x' property."""
        return self._x

    @x.setter
    def x(self, value):
        self._x = value

    @x.deleter
    def x(self):
        del self._x


if __name__ == '__main__':
    pass

""" What is false?
None
False
zero of any numeric type, for example, 0, 0L, 0.0, 0j.
any empty sequence, for example, '', (), [].
any empty mapping, for example, {}.
instances of user-defined classes, if the class defines a __nonzero__() or 
__len__() method, when that method returns the integer zero or bool value False.
"""

 from datetime import timedelta
>>> print(timedelta(hours=15, minutes=10, seconds=29) - timedelta(hours=14, minutes=59, seconds=55))
