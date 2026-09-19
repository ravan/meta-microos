SUMMARY = "A Python module for decorators, wrappers and monkey patching"
DESCRIPTION = "The aim of the **wrapt** module is to provide a transparent object proxy \
for Python, which can be used as the basis for the construction of function \
wrappers and decorator functions. \
 \
The **wrapt** module focuses very much on correctness. It therefore goes \
way beyond existing mechanisms such as ``functools.wraps()`` to ensure that \
decorators preserve introspectability, signatures, type checking abilities \
etc. The decorators that can be constructed using this module will work in \
far more scenarios than typical decorators and provide more predictable and \
consistent behaviour. \
 \
To ensure that the overhead is as minimal as possible, a C extension module \
is used for performance critical components. An automatic fallback to a \
pure Python implementation is also provided where a target system does not \
have a compiler to allow the C extension to be compiled. \
 \
Documentation \
------------- \
 \
For further information on the **wrapt** module see: \
 \
* http://wrapt.readthedocs.org/"
LICENSE = "BSD-2-Clause"

PV = "2.3.0"

RPM_NAME = "python314-wrapt-2.3.0-1.1.aarch64.rpm"
RPM_HASH = "03643465afe3adbef734c8e9e1aa77f39c55bfb25b9d43f27fd7038b489d9c9e0fdd0b5cfec038e46c327b437f4500f26ada5f1f0c87273648e14bab56b77ab9"

RPROVIDES:${PN} += "python3.14dist-wrapt \
python314-wrapt \
python3dist-wrapt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
