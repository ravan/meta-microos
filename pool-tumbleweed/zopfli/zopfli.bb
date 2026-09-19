SUMMARY = "GZip compatible compression utlity"
DESCRIPTION = "Example program for libzopfli to create gzip compatible files. Files can be \
decompressed with e.g. gzip."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "zopfli-1.0.3-2.12.aarch64.rpm"
RPM_HASH = "53f430b3dbf5f88218f396d946a8be21027052de1edb45af6544f81811c660cc00cd807d4fc20337a6ba23e7923256f42c460bc82c818f3b9d6f96067d714bfc"

RPROVIDES:${PN} += "zopfli"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libzopfli.so.1 \
libzopflipng.so.1"

inherit rpm
