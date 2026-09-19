SUMMARY = "Library to work with X.509 certificates"
DESCRIPTION = "This subpackage of mbedtls contains a library that can read, verify \
and write X.509 certificates, read/write Certificate Signing Requests \
and read Certificate Revocation Lists."
LICENSE = "Apache-2.0 | GPL-2.0-or-later"

PV = "2.28.10"

RPM_NAME = "libmbedx509-1-2.28.10-5.1.aarch64.rpm"
RPM_HASH = "736ad98e2c330d52d4b020f94124aceae2d5c8bad6b360edc9f98cdefda008263b87e194f7386c0848942ae0551f514afe4184b4acf70023fb0d6853eed4b0c4"

RPROVIDES:${PN} += "libmbedx509-1 \
libmbedx509.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmbedcrypto.so.7"

inherit rpm
