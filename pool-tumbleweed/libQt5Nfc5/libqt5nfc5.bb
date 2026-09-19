SUMMARY = "Qt 5 Nfc Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libQt5Nfc5-5.15.19+kde0-1.2.aarch64.rpm"
RPM_HASH = "74ee3b99371984138e14b7cc770b675b415a472baa5423645500bcca6e249d06dc6b987da7e3a98593a7de51101388682470ee83eb6c23dda27f9e8fa1996b36"

RPROVIDES:${PN} += "libQt5Nfc.so.5 \
libQt5Nfc5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
