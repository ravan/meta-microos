SUMMARY = "The ISL shared library"
DESCRIPTION = "The shared library for the ISL. \
 \
ISL is a library for manipulating sets and relations of integer points \
bounded by linear constraints."
LICENSE = "MIT"

PV = "0.27"

RPM_NAME = "libisl23-0.27-1.8.aarch64.rpm"
RPM_HASH = "85616dec483681066efe59f8241add5e86516393f27a6b628ac61407e166ba9c115f99325f8dbd98aa41d7d21b806c990cd6513d72fd2504ad00d02e4372f7d8"

RPROVIDES:${PN} += "libisl.so.23 \
libisl23"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10"

inherit rpm
