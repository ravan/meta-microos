SUMMARY = "Plugin for the CRAMMD5 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-crammd5-2.1.28-12.5.aarch64.rpm"
RPM_HASH = "8694bb83a24ecceccd7ab86c33bd1c30233856cd78007a32005e297a9edcc18861f2738a408d3c692c33046738dcde3741d5dc5e264c847ce10f321cc48e658d"

RPROVIDES:${PN} += "cyrus-sasl-crammd5 \
libcrammd5.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
