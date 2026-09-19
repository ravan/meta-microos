SUMMARY = "Python wrapper for the C-Blosc2 library"
DESCRIPTION = "Blosc (https://blosc.org) is a high performance compressor optimized \
for binary data. It has been designed to transmit data to the processor \
cache faster than the traditional, non-compressed, direct memory fetch \
approach via a memcpy() OS call. \
 \
Blosc works well for compressing numerical arrays that contains data \
with relatively low entropy, like sparse data, time series, grids with \
regular-spaced values, etc. \
 \
python-blosc2 is a Python package that wraps C-Blosc2, the newest version \
of the Blosc compressor. Currently python-blosc2 already reproduces the \
API of python-blosc, so the former can be used as a drop-in replacement \
for the later."
LICENSE = "BSD-3-Clause"

PV = "4.13.0"

RPM_NAME = "python314-blosc2-4.13.0-1.1.aarch64.rpm"
RPM_HASH = "2d213211b89fca730bcda3eeb44e516c71f617d2854b029865a299a1525088734e35ea3c20fca66f78ba358044e9b30cf088e6b5787dead20200db2af6b86152"

RPROVIDES:${PN} += "python3.14dist-blosc2 \
python314-blosc2 \
python3dist-blosc2"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
alts \
ld-linux-aarch64.so.1 \
libblosc2.so.9 \
libc.so.6 \
libm.so.6 \
python-abi \
python314-httpx \
python314-msgpack \
python314-ndindex \
python314-numexpr \
python314-numpy \
python314-pydantic \
python314-requests \
python314-rich \
python314-threadpoolctl"

inherit rpm
