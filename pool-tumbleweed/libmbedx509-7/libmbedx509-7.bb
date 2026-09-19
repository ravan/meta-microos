SUMMARY = "Library to work with X.509 certificates"
DESCRIPTION = "This subpackage of mbedtls contains a library that can read, verify \
and write X.509 certificates, read/write Certificate Signing Requests \
and read Certificate Revocation Lists."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "3.6.7"

RPM_NAME = "libmbedx509-7-3.6.7-1.2.aarch64.rpm"
RPM_HASH = "86ec6e5ac1dc9dde51b71db58b70e242b291a444ff17c500fc48de29f5ada1544bb558c78b0af1fa3821036e3beebd489d1c508ae1ee1a9ad472c5e0f4f4fc9d"

RPROVIDES:${PN} += "libmbedx509-7 \
libmbedx509.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedcrypto.so.16"

inherit rpm
