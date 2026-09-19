SUMMARY = "Qt 5 BodyMovin Library"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package includes a library for reading BodyMovin animation files."
LICENSE = "GPL-3.0-or-later"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Bodymovin5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "edd4a96bf445e1029e51d5c10b27ca50a9443e7470719d448c5c221418871bf372fa1d8b909dad8fd4e779fd0e5ca375603a542ad67df5f96804e1bf5e7e2e7f"

RPROVIDES:${PN} += "libQt5Bodymovin.so.5 \
libQt5Bodymovin5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
