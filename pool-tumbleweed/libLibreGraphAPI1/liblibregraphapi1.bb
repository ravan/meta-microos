SUMMARY = "A client library for the LibreGraphAPI library"
DESCRIPTION = "Libregraphapi is a MS Graph API influenced API for cloud collaboration."
LICENSE = "Apache-2.0"

PV = "1.0.4"

RPM_NAME = "libLibreGraphAPI1-1.0.4-3.4.aarch64.rpm"
RPM_HASH = "667d726674e06f79cdbb35e8453066e5d04df1ccb702fc25fb98fb2fe6a67a30bbb1b77969f9148b997044121ca349ed8305ab621a742e755f2dde3786f1f0d3"

RPROVIDES:${PN} += "libLibreGraphAPI.so.1 \
libLibreGraphAPI1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
