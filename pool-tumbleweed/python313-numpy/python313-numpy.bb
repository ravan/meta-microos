SUMMARY = "NumPy array processing for numbers, strings, records and objects"
DESCRIPTION = "NumPy is a general-purpose array-processing package designed to \
efficiently manipulate large multi-dimensional arrays of arbitrary \
records without sacrificing too much speed for small multi-dimensional \
arrays.  NumPy is built on the Numeric code base and adds features \
introduced by numarray as well as an extended C-API and the ability to \
create arrays of arbitrary type which also makes NumPy suitable for \
interfacing with general-purpose data-base applications. \
 \
There are also basic facilities for discrete fourier transform, \
basic linear algebra and random number generation."
LICENSE = "BSD-3-Clause"

PV = "2.5.3"

RPM_NAME = "python313-numpy-2.5.3-1.1.aarch64.rpm"
RPM_HASH = "8d6b5a9675e56bbb3210555317ee2b879abb9a546c1d6a4b9001c46eea9b9ffd9e17fffe300cf84d39bcb42c63d184bcc43902ee1618af0b6199c2a1466b9ada"

RPROVIDES:${PN} += "python3-numpy \
python3.13dist-numpy \
python313-numpy \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libblas.so.3 \
libc.so.6 \
libcblas.so.3 \
libgcc-s.so.1 \
liblapack.so.3 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
