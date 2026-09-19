SUMMARY = "Plugin for the DIGESTMD5 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-digestmd5-2.1.28-12.5.aarch64.rpm"
RPM_HASH = "392b13cddb1851778d26a2144307b25327cf72805e6179702422be2b1aafb960073316b8335ea1e8c2242efaf3ab12fef9b7c1c69fd5d9b32be17c4d1b5487a7"

RPROVIDES:${PN} += "cyrus-sasl-digestmd5 \
libdigestmd5.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3"

inherit rpm
