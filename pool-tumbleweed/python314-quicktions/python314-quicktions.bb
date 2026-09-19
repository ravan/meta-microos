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

RPM_NAME = "python314-quicktions-1.23-1.4.aarch64.rpm"
RPM_HASH = "33502c92eb3010f3bdaea71373d08760288d4fb8b85e87f06833d29401a434b91d464c0903fe49c251d0d7e2629f6f41b6f0a8c2e404288bf0717639c1f2fc5a"

RPROVIDES:${PN} += "python3.14dist-quicktions \
python314-quicktions \
python3dist-quicktions"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
