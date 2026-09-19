SUMMARY = "Plugin for the GSSAPI SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-bdb-gssapi-2.1.28-12.4.aarch64.rpm"
RPM_HASH = "f3677c80ae532ef3c8aa2f2ab9601d7c43c5c76790efc16a4a1591de5ae50ad7b46f7fb409414389791947bcca72320a84b415a08ea7d235e46ba6f1d5896047"

RPROVIDES:${PN} += "cyrus-sasl-bdb-gssapi \
libgssapiv2.so.3"

RDEPENDS:${PN} += "cyrus-sasl-bdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2"

inherit rpm
