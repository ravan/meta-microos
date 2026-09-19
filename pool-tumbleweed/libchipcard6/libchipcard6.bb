SUMMARY = "Library That Allows Access to Smart Cards (Chipcards)"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "5.1.6"

RPM_NAME = "libchipcard6-5.1.6-2.9.aarch64.rpm"
RPM_HASH = "4ccc41148c3b1a48e3c67f59c92e4bbf6b75d2373c1ef9535030c73f0246f6557d707c9cb979f0870af31671da27c33089405490b1cfb8deed3d3723192c2647"

RPROVIDES:${PN} += "libchipcard.so.6 \
libchipcard6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libchipcard \
libgwenhywfar.so.79 \
libpcsclite.so.1 \
libz.so.1"

inherit rpm
