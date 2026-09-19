SUMMARY = "A C/C++ library for the E1.31 (sACN) protocol"
DESCRIPTION = "A C/C++ library that provides an API for packet, client and server programming \
to be used for communicating with devices implementing the E1.31 (sACN) \
protocol."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "libe131-1-1.4.0-1.21.aarch64.rpm"
RPM_HASH = "3778f6cf7d7d924c1735c5faeb5596f3551627b58c0fee262105d4b795230dc3cf42e37d9d1a9ee3b4053871d5ca4bb21dc715dc0453b64d3637a6bab9853200"

RPROVIDES:${PN} += "libe131-1 \
libe131.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
