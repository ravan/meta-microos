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

RPM_NAME = "python314-numpy-2.5.3-1.1.aarch64.rpm"
RPM_HASH = "283d24e20302d969a5558637fd1a3eb8b3d51c8298ec24474e369bad3209a4a9aac85d0e8f3416e9d57461ccab93cd3c90e3efb383f35acf33c1002642745a41"

RPROVIDES:${PN} += "python3.14dist-numpy \
python314-numpy \
python3dist-numpy"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
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
