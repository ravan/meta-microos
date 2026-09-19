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

RPM_NAME = "python313-contourpy-1.3.3-1.7.aarch64.rpm"
RPM_HASH = "37d4adcb635eaba97032669db95e89059db28011aea4daf7af8123db5ae3c1b77862d5f7bce00ff2a4d4c6d9f8f603d78f9ed469dd9cc1237542bac03d1926dc"

RPROVIDES:${PN} += "python3-contourpy \
python3.13dist-contourpy \
python313-contourpy \
python3dist-contourpy"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
