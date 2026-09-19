SUMMARY = "Plugin for the GSSAPI SASL mechanism"
DESCRIPTION = "This is the Cyrus SASL API implementation. It can be used on the client \
or server side to provide authentication. See RFC 2222 for more \
information."
LICENSE = "BSD-4-Clause"

PV = "2.1.28"

RPM_NAME = "cyrus-sasl-gssapi-2.1.28-12.5.aarch64.rpm"
RPM_HASH = "3156ae5fcf7737b5ef398b28d3670cc7fa195f88e7dcf7de5d1d141129eb0bd1c35749da303078b59d6fa6ee49e1a21569abb93325054dd8391d0d594f82c149"

RPROVIDES:${PN} += "cyrus-sasl-gssapi \
libgssapiv2.so.3"

RDEPENDS:${PN} += "cyrus-sasl \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgssapi-krb5.so.2"

inherit rpm
