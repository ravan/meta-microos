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

RPM_NAME = "python313-blosc2-4.13.0-1.1.aarch64.rpm"
RPM_HASH = "d8ce4c84e0578505100fde0921edab98bef3ee83551a4becf0a7d789f7421bb625c7d37db56ab1d574cb45e471fa09210fbe4ddd206567085e7d962ffbc2eaf2"

RPROVIDES:${PN} += "python3-blosc2 \
python3.13dist-blosc2 \
python313-blosc2 \
python3dist-blosc2"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
alts \
ld-linux-aarch64.so.1 \
libblosc2.so.9 \
libc.so.6 \
libm.so.6 \
python-abi \
python313-httpx \
python313-msgpack \
python313-ndindex \
python313-numexpr \
python313-numpy \
python313-pydantic \
python313-requests \
python313-rich \
python313-threadpoolctl"

inherit rpm
