SUMMARY = "Fast fractions data type for rational numbers"
DESCRIPTION = "Python's Fraction data type is an excellent way to do exact money \
calculations and largely beats Decimal in terms of simplicity, \
accuracy and safety.  Clearly not in terms of speed, though, given \
the cdecimal accelerator in Py3.3+. \
 \
Quicktions is an adaptation of the original fractions module \
(as included in CPython 3.5) that is compiled and optimised with \
Cython into a fast, native extension module. \
 \
Compared to the standard library fractions module in Py2.7 and \
Py3.4, quicktions is currently about 10x faster, and still about \
6x faster than the current version in Python 3.5.  It's also about \
15x faster than the (Python implemented) decimal module in Py2.7."
LICENSE = "Python-2.0"

PV = "1.23"

RPM_NAME = "python313-quicktions-1.23-1.4.aarch64.rpm"
RPM_HASH = "9c2517d3583dde39cba70a0cfbf4209186380400b1b82f1e72edc7dd74759a15ff1be7bd298b225cb12283eca12573e00626a76c486867614747e5bbf35b7fba"

RPROVIDES:${PN} += "python3-quicktions \
python3.13dist-quicktions \
python313-quicktions \
python3dist-quicktions"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
