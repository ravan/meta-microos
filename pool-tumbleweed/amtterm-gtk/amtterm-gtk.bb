SUMMARY = "Serial-over-lan (sol) graphical client"
DESCRIPTION = "Graphical client for the amtterm utility"
LICENSE = "GPL-2.0-or-later"

PV = "1.7"

RPM_NAME = "amtterm-gtk-1.7-2.4.aarch64.rpm"
RPM_HASH = "ab8f18c31cb337a82748865bf3736c40fe40319308fa40f581ee13d3f3e8f3dbdcf1ea1f9c49ede0682d337c9877134617f34cb53f197817bf655e105153f1ee"

RPROVIDES:${PN} += "amtterm-gtk"

RDEPENDS:${PN} += "amtterm \
libc.so.6 \
libcrypto.so.3 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libssl.so.3 \
libvte-2.91.so.0"

inherit rpm
