SUMMARY = "Plugin for the GS2 SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-gs2-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "1eef58e53787477cfd6bb505c909a55b35fd372bb8932f43a3ad9a375294f37382ec6b6fdaa8d16a8599cc33fe08c0bcb1c4e5bbc93899237c7731a814d93028"

RPROVIDES:${PN} += "cyrus-sasl-bdb-gs2 \
libgs2.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2"

inherit rpm
