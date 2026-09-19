SUMMARY = "Plugin for the DIGESTMD5 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-digestmd5-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "4d23b2dbe8d7579d6e35ca92b51ac62829423f558e0837808e10b996ce07b534b055f36f18c1f963a19a2be25364421805de621d598cf6ffcc684d3abb6c16a4"

RPROVIDES:${PN} += "cyrus-sasl-bdb-digestmd5 \
libdigestmd5.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
