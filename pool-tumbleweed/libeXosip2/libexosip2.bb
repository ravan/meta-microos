SUMMARY = "Extended osip2 library"
DESCRIPTION = "Extended library for the osip2 protocol."
LICENSE = "GPL-2.0-or-later"

PV = "5.3.0"

RPM_NAME = "libeXosip2-5.3.0-1.14.aarch64.rpm"
RPM_HASH = "6f02180fdb9496ebb10843537d5b045a70b064ea85c61f3ceae52b2c5a6a716f2b9553af8ce2dc63105bb44df48c70f7000f84a32734b77227d7ef58bf3eb079"

RPROVIDES:${PN} += "libeXosip2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libeXosip2.so.15 \
libosip2.so.15 \
libosipparser2.so.15"

inherit rpm
