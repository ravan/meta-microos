SUMMARY = "Implementation of Cyrus SASL API"
DESCRIPTION = "This is the Cyrus SASL API. It can be used on the client or server side \
to provide authentication. See RFC 2222 for more information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "d177e24f79d41e70f7843085d6d67e7b8824b65579176cd7bb87f21fea3338982a4ef740828f5083753c947a02dc31e68161995fcbff26caba4030ee18c856ff"

RPROVIDES:${PN} += "cyrus-sasl-bdb \
libanonymous.so.3 \
liblogin.so.3 \
libsasldb.so.3"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdb-4.8.so \
libgssapi-krb5.so.2 \
libsasl2-3 \
libsasl2.so.3"

inherit rpm
