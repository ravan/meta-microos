SUMMARY = "Extended osip2 library"
DESCRIPTION = "Extended library for the osip2 protocol."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "libeXosip2-15-5.3.0-1.14.aarch64.rpm"
RPM_HASH = "e4fce6224750d071a7fec1f9bce50d06b6c41d4d1dbd0b4f19f6fa782b692be5d4db573420c0ab53b03b7fac52ce2362bad8aab9ff479b6121fe8ef5b42c9190"

RPROVIDES:${PN} += "libeXosip2 \
libeXosip2-15 \
libeXosip2.so.15"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcares.so.2 \
libcrypto.so.3 \
libosip2.so.15 \
libosipparser2.so.15 \
libssl.so.3"

inherit rpm
