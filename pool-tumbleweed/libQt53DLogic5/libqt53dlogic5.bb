SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
Qt 3D Logic module enables synchronizing frames with the Qt 3D \
backend."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DLogic5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "7e87f3d18641bdd47983ef9916eb7fb0cba25710e3025d83f942a052b0b245362e8dd979c965065f8e3f0f9ed5cc70a261b5adca9ae81e36032470663c41f0a8"

RPROVIDES:${PN} += "libQt53DLogic.so.5 \
libQt53DLogic5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
