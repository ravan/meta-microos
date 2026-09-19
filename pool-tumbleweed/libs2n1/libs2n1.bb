SUMMARY = "AWS implementation of the TLS/SSL protocol"
DESCRIPTION = "s2n is a C99 implementation of the TLS/SSL protocols. \
 \
This package contains the dynamically linked library."
LICENSE = "Apache-2.0"

PV = "1.7.9"

RPM_NAME = "libs2n1-1.7.9-1.1.aarch64.rpm"
RPM_HASH = "00ec8df6638d0627f04be4214ce83b70618f050dd9e3908b8aaf779a90f92dbf126db53cda5dbf1b250e5d89b131400113424f8c6ba6578560ea5c6759607399"

RPROVIDES:${PN} += "libs2n.so.1 \
libs2n1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
