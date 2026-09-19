SUMMARY = "GTK launchers and menu for sway and i3"
DESCRIPTION = "GTK-based launchers: application grid, button bar, dmenu for sway and other window managers."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.1.1"

RPM_NAME = "nwg-launchers-0.7.1.1-2.9.aarch64.rpm"
RPM_HASH = "386d0d736d7d1b5b67eb7cd9256d8be628cf4a9e903bc8c878bb82fab634c95e4af58e12dd2ac6d81cb3a8f34fe34693b7b2aa1a7c4c115a3c6e5e40a35fb3ef"

RPROVIDES:${PN} += "nwg-launchers"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatkmm-1.6.so.1 \
libc.so.6 \
libcairomm-1.0.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdkmm-3.0.so.1 \
libgiomm-2.4.so.1 \
libglib-2.0.so.0 \
libglibmm-2.4.so.1 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libgtk-layer-shell.so.0 \
libgtkmm-3.0.so.1 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
