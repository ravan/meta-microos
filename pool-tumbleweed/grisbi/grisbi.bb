SUMMARY = "Personal Accounting Application"
DESCRIPTION = "Grisbi is a personal accounting application, aiming at providing the most \
simple and intuitive software for basic use, although it can be very powerful \
if you spend a little time on the setup. \
 \
One notable feature is that it respects French accounting rules."
LICENSE = "GPL-2.0-or-later"

PV = "3.90.1"

RPM_NAME = "grisbi-3.90.1-1.6.aarch64.rpm"
RPM_HASH = "6c7e043d0e545f2b47ec36b6aec3bb50b3773476911d97a53770eab5b8a97b06345aa0560d9432e30e00cff62d03615d9e6fa863b8c5457d1637ef9e5e10bba2"

RPROVIDES:${PN} += "grisbi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcrypto.so.3 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgoffice-0.10.so.10 \
libgtk-3.so.0 \
libm.so.6 \
libofx.so.7 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.16 \
libz.so.1"

inherit rpm
