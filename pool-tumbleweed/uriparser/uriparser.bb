SUMMARY = "A strictly RFC 3986 compliant URI parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
 \
 \
 \
There is a command line tool, uriparse, which allows parsing URIs and \
show how the liburiparser splits it into components."
LICENSE = "Apache-2.0 & BSD-3-Clause & LGPL-2.1-or-later"

PV = "1.0.2"

RPM_NAME = "uriparser-1.0.2-2.2.aarch64.rpm"
RPM_HASH = "e02cef37c2b1f356d3624be6f6e6a2a68514d4447c11e77c1ea3e30a089d2c23b465aab31315088d93a987b07477b1597099c744996ea86458e70fef06beb1c2"

RPROVIDES:${PN} += "uriparse \
uriparser"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liburiparser.so.1"

inherit rpm
