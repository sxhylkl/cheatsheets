#!/usr/bin/python3
# -*- coding: utf-8 -*-

### debugging ###
import pdb; pdb.set_trace()


### search for values of attributes inside list lst ###
any(obj.name == 'value' for obj in lst)


### performance tests ###
from timeit import timeit
timeit(lambda: <function>(<argument>))


### dynamic strings ###
print("Mein Name ist %s, Nachname %s" % ('Faruk', 'Heynemann'))

name = 'Faruk'
print(f'Hi {name} how are you doing?')  # f-strings since Python 3.6


### String conversion ###
b"abcde".decode("utf-8")
"abcde".encode("utf-8")


### Get size of builtin objects ###
getsizeof()


### calculate times ###
from datetime import timedelta
print(timedelta(hours=15, minutes=10, seconds=29) - timedelta(hours=14, minutes=59, seconds=55))


### ternäry operator ###
condition = True
a if condition else b  # funktioniert auch mit defs
# Ugly:
# (if C: x else: y)  # Eclipse mag das nicht
# (falseValue, trueValue)[test]
# (falseValue, trueValue)[test == True]
# (falseValue, trueValue)[bool(condition)]
# result = {True: x, False: y}[a > b]
# (falseValue, trueValue)[test]
### Ternary operator ###
# https://en.wikipedia.org/wiki/%3F:#Python


### Properties ###
# variant 1 #
_x = None
@property
def x(self): return self._x
@x.setter
def x(self, value): self._x = value
@x.deleter
def x(self): del self._x

# variant 2 #
_y = None
def y_get(): return _y
def y_set(value): _y = value
def y_del(): del _y
y = property(fget=y_get, fset=y_set, fdel=x_del, doc=None)

# variant 3 #
_z = None
def z_get(): return _z
def z_set(value): _z = value
def z_del(): del _z
z = property()
z = z.getter(z_get)
z = z.setter(z_set)
z = z.delete(z_del)



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


if __name__ == '__main__':
    pass


### Truth / False List ###
"""
None
False
zero of any numeric type, for example, 0, 0L, 0.0, 0j.
any empty sequence, for example, '', (), [].
any empty mapping, for example, {}.
instances of user-defined classes, if the class defines a __nonzero__() or 
__len__() method, when that method returns the integer zero or bool value False.
"""

