SUMMARY = "Python bindings for ERFA"
DESCRIPTION = "A Python wrapper for the ERFA library (Essential Routines for \
Fundamental Astronomy), a C library containing key algorithms for astronomy, \
which is based on the SOFA library published by the International Astronomical \
Union (IAU).  All C routines are wrapped as Numpy universal functions, \
so that they can be called with scalar or array inputs. \
 \
The project is a split of astropy._erfa module, developed in the \
context of Astropy project, into a standalone package."
LICENSE = "BSD-3-Clause"

PV = "2.0.1.5"

RPM_NAME = "python313-pyerfa-2.0.1.5-1.9.aarch64.rpm"
RPM_HASH = "73a381c2760a63c8c5977e10b2a2a9460bc56d86d489bca0f20373cb7debe2c5d9855ccafc06c60fccf0ed7f4ac6d2b03c91f2bbd2585401447152e05c9834c7"

RPROVIDES:${PN} += "python3-pyerfa \
python3.13dist-pyerfa \
python313-pyerfa \
python3dist-pyerfa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liberfa.so.1 \
python-abi \
python313-numpy"

inherit rpm
