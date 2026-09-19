SUMMARY = "Library for handling system-wide shortcuts in Qt applications"
DESCRIPTION = "Library for handling system-wide shortcuts in Qt applications."
LICENSE = "BSD-Source-Code"

PV = "0.0.1+git1533120914.688715b"

RPM_NAME = "libqxtglobalshortcut0-0.0.1+git1533120914.688715b-1.34.aarch64.rpm"
RPM_HASH = "8a9648b58672419650e7c548c199284d0131a20cb76086c07f039c7a5827a19b0524a60678f1a2f18805a3bf7286103328bd004d02112bad606aa10c86ebc28e"

RPROVIDES:${PN} += "libqxtglobalshortcut.so.0 \
libqxtglobalshortcut0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
