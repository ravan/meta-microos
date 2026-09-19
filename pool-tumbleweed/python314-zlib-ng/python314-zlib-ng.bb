SUMMARY = "Faster zlib and gzip compatible compression and decompression"
DESCRIPTION = "Faster zlib and gzip compatible compression and decompression by providing Python bindings for the zlib-ng library. \
 \
This package provides Python bindings for the zlib-ng library."
LICENSE = "Python-2.0"

PV = "1.0.0"

RPM_NAME = "python314-zlib-ng-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "b2be4847fcf558c84895144fa6195ddb651db94e106cdbf6803dfb13038fcb2e6541aa3f8176e544295e01f560b287c456ff64e87678ca6d892a9954148edcc4"

RPROVIDES:${PN} += "python3.14dist-zlib-ng \
python314-zlib-ng \
python3dist-zlib-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz-ng.so.2 \
python-abi"

inherit rpm
