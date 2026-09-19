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

RPM_NAME = "python313-wrapt-2.3.0-1.1.aarch64.rpm"
RPM_HASH = "5ca511340ce91805f50357e803ba8b9b347284ea895202893b9fdbc322df0871d756e9e39738b1f6c7cc308e0aad68dd89e0368a46a34278e19288349bf6d539"

RPROVIDES:${PN} += "python3-wrapt \
python3.13dist-wrapt \
python313-wrapt \
python3dist-wrapt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
