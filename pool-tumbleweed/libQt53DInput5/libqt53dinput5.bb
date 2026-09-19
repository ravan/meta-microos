SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The Qt 3D Input module provides classes for handling user input in \
applications using Qt3D."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt53DInput5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "831e658694d760b232eaa78b09c2436cd5639c36607a379aff609b4dab9313a8afe55274e675aa357a017e7cf1a9b259827ab8b965efaca4a5338e7771cb935b"

RPROVIDES:${PN} += "libQt53DInput.so.5 \
libQt53DInput5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt53DCore.so.5 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
