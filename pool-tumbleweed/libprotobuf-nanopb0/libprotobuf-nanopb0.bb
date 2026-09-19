SUMMARY = "Shared library for nanopb"
DESCRIPTION = "Shared library for nanopb - a C implementation of Google's Protocol Buffers \
data format."
LICENSE = "Zlib"

PV = "0.4.9.2"

RPM_NAME = "libprotobuf-nanopb0-0.4.9.2-1.1.aarch64.rpm"
RPM_HASH = "9270e606f1ecac2158068d345ef9155c4f6e6ce48b956c9bf4bb35891008b3d9c628e410c8409b7160c4bb21828953f83d5e60228da51853c0a54534ab7782d8"

RPROVIDES:${PN} += "libprotobuf-nanopb.so.0 \
libprotobuf-nanopb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
