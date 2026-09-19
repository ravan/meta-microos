SUMMARY = "Shared library libvacuumutils for Vacuum-IM"
DESCRIPTION = "This package includes shared libraris needed to work Vacuum-IM program."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1639054987.g0abd5e1"

RPM_NAME = "libvacuumutils37-1.3.0+git1639054987.g0abd5e1-1.9.aarch64.rpm"
RPM_HASH = "f5a49bdbe92e6a64d086c087ae2370a26cca3a1d4a054a0bf148078eb6b5b46c35380b90e9ea2e213cbc407677c7960cd74b842f37043296b29a997b3cecca05"

RPROVIDES:${PN} += "libvacuumutils.so.37 \
libvacuumutils37"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libQt5Xml.so.5 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libminizip.so.1 \
libqxtglobalshortcut.so.0 \
libstdc++.so.6"

inherit rpm
