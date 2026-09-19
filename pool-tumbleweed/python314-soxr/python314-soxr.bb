SUMMARY = "High quality, one-dimensional sample-rate conversion library"
DESCRIPTION = "High quality, one-dimensional sample-rate conversion library"
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "python314-soxr-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "e30a9515fcf0189f201cc5942e97f3d3c88230d9ba7eaed351973b55d7c30b28e6e0ab42c15fb391ddfd1230259f4d580292a8990a731cb4d052b7bd119e0ebc"

RPROVIDES:${PN} += "python3.14dist-soxr \
python314-soxr \
python3dist-soxr"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libsoxr.so.0 \
libstdc++.so.6 \
python-abi \
python314-numpy"

inherit rpm
