SUMMARY = "Blosc data compressor for Python"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data in \
Python."
LICENSE = "MIT"

PV = "1.11.4"

RPM_NAME = "python314-blosc-1.11.4-1.4.aarch64.rpm"
RPM_HASH = "569b71b558e29cf84dd69770752f60b580a612ca809bc68996c97fffffa0d3a8f0cd2741c0209d3a89b6f4c3126a4a14d6ee76705f5e00d44dde241657062adf"

RPROVIDES:${PN} += "python3.14dist-blosc \
python314-blosc \
python3dist-blosc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblosc.so.1 \
libc.so.6 \
python-abi"

inherit rpm
