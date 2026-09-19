SUMMARY = "Adwaita Qt5 theme"
DESCRIPTION = " \
Adwaita theme variant for applications utilizing Qt5"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.4.2"

RPM_NAME = "adwaita-qt5-1.4.2-4.11.aarch64.rpm"
RPM_HASH = "4d47ad84ba853704da4afcfa1e34f565a7aa26af554c6fc980bc5beea785ade6ac55fe0392e4b7cfcbae12f4227dee79685f4d823ce183a8e639be7ea1373531"

RPROVIDES:${PN} += "adwaita-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libadwaitaqt.so.1 \
libadwaitaqt5-1 \
libadwaitaqtpriv.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1"

inherit rpm
