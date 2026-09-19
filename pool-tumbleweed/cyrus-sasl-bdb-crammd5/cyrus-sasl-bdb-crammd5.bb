SUMMARY = "Plugin for the CRAMMD5 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-crammd5-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "50b697dedc1e2f436790ff2246418b0d67396880c4e093bcd10299d85a840588e11da6de63ccdd4b160753c4661a35215cba5aec61a8424d444e477bac956c0d"

RPROVIDES:${PN} += "cyrus-sasl-bdb-crammd5 \
libcrammd5.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
