SUMMARY = "Library to work with X.509 certificates"
DESCRIPTION = "This subpackage of mbedtls contains a library that can read, verify \
and write X.509 certificates, read/write Certificate Signing Requests \
and read Certificate Revocation Lists."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "4.2.0"

RPM_NAME = "libmbedx509-9-4.2.0-1.2.aarch64.rpm"
RPM_HASH = "6fcd5a45311c8e5d694b945ab042d0b4665e6ecea75103434e096e364de7f74ebaa559a28d9802f19d417d1bbbbb977ae78763e2b87c390ee029988687df411e"

RPROVIDES:${PN} += "libmbedx509-9 \
libmbedx509.so.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtfpsacrypto.so.2"

inherit rpm
