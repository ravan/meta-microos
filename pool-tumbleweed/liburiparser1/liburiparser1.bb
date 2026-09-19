SUMMARY = "A strictly RFC 3986 compliant URI parsing library"
DESCRIPTION = "uriparser is a strictly RFC 3986 compliant URI parsing library \
and supports Unicode. \
 \
This package contains the shared library for uriparser."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "liburiparser1-1.0.2-2.2.aarch64.rpm"
RPM_HASH = "eadaba7123d7bf60a27976f96302525a8dd5c21a3137c4323c5a36b3a11596bc80fe4edfe017ac247c91fadee8dcdba65607783dce972364c1b2cb136397eece"

RPROVIDES:${PN} += "liburiparser.so.1 \
liburiparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
