SUMMARY = "Implementation of Cyrus SASL API"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-2.1.28-12.5.aarch64.rpm"
RPM_HASH = "e5a1cf80acefc7fbd1528953578c9f17a18dc40dcf09d20ca18869cc484212efb327d1a3a6be49f8db087724540c218554bf88e55303d98ecf50b09db4482be9"

RPROVIDES:${PN} += "cyrus-sasl \
libanonymous.so.3 \
liblogin.so.3 \
libsasldb.so.3"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdbm.so.6 \
libgssapi-krb5.so.2 \
libsasl2.so.3"

inherit rpm
