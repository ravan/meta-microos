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

RPM_NAME = "python314-pyerfa-2.0.1.5-1.9.aarch64.rpm"
RPM_HASH = "4cbfdb917dfc09bcbbf31d407517e6a66ffc594f32ab93c6eec7d332f535e590127866ceea014781103b91a804ab5e36edd715be3a0d3bf3a0b2303c0e0eb08c"

RPROVIDES:${PN} += "python3.14dist-pyerfa \
python314-pyerfa \
python3dist-pyerfa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liberfa.so.1 \
python-abi \
python314-numpy"

inherit rpm
