SUMMARY = "IBM Sametime Community Client Library"
DESCRIPTION = "A library to establish instant messaging connections to the IBM \
Sametime IM server."
LICENSE = "LGPL-2.1-or-later"

PV = "1.1.1"

RPM_NAME = "libmeanwhile1-1.1.1-2.10.aarch64.rpm"
RPM_HASH = "162b64f8959f34935a6ce8472844d68bb2bf54aa12882d9ac647affccda69960e2d2e4a0fc902dfc9b366bf07bc6fa4172739dc64f61d5acebb7a0c14a5deeea"

RPROVIDES:${PN} += "libmeanwhile \
libmeanwhile.so.1 \
libmeanwhile1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libtommath.so.1"

inherit rpm
