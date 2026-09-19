SUMMARY = "Faster zlib and gzip compatible compression and decompression"
DESCRIPTION = "Faster zlib and gzip compatible compression and decompression by providing Python bindings for the zlib-ng library. \
 \
This package provides Python bindings for the zlib-ng library."
LICENSE = "Python-2.0"

PV = "1.0.0"

RPM_NAME = "python313-zlib-ng-1.0.0-2.1.aarch64.rpm"
RPM_HASH = "0def20f5dbe845c1c7746d7a68a4e61c8dafabfed54d64b64549256cb74c51f8a89fa43586859fc4cc6eaa3381e6459b2f2cc08d5512d5d75e1db78a096aeece"

RPROVIDES:${PN} += "python3-zlib-ng \
python3.13dist-zlib-ng \
python313-zlib-ng \
python3dist-zlib-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz-ng.so.2 \
python-abi"

inherit rpm
