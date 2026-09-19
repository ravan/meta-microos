SUMMARY = "Adwaita Qt5 library"
DESCRIPTION = " \
Adwaita theme variant for applications utilizing Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "libadwaitaqt5-1-1.4.2-4.11.aarch64.rpm"
RPM_HASH = "6511fd65316d6a1a96741ea7f82bbf4541bad6eb541c71dfe705360433caea3789634d33aed790cb8651e2b86e9fe8685a7fbacedf5f920d0bcd3fcf9dbe8a96"

RPROVIDES:${PN} += "libadwaitaqt.so.1 \
libadwaitaqt1 \
libadwaitaqt5-1 \
libadwaitaqtpriv.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
