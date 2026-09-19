SUMMARY = "Python library for calculating contours of 2D quadrilateral grids"
DESCRIPTION = "A Python library for calculating contours of 2D quadrilateral grids \
 \
It contains the 2005 and 2014 algorithms used in Matplotlib as well \
as a newer algorithm that includes more features and is available \
in both serial and multithreaded versions. It provides an easy way \
for Python libraries to use contouring algorithms without having \
to include Matplotlib as a dependency."
LICENSE = "BSD-3-Clause"

PV = "1.3.3"

RPM_NAME = "python314-contourpy-1.3.3-1.7.aarch64.rpm"
RPM_HASH = "5616c9d25a59f8b9736c79a61d1c84730ecfa020e33bddcb6e35597fce8f1419de4432748643dc37ae1d78d3322cef8bd3e834c0b6c7cc7a0c44b5d34dde6dc8"

RPROVIDES:${PN} += "python3.14dist-contourpy \
python314-contourpy \
python3dist-contourpy"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
