SUMMARY = "Plasma Desktop artwork, styles and assets"
DESCRIPTION = "Artwork, styles and assets for the Breeze visual style for the Plasma Desktop. \
This package provides Breeze style for Qt 5, color-scheme and aditional assets."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "breeze6-style-qt5-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "cc7c4ae53085cfa7f01b63fd77a135d7fa4c5652a352b7582c19bb762fdad436fa20676b34caf56deed5be5c7f4c220b24c86cbf8b5f96550c3020e2b80f9177"

RPROVIDES:${PN} += "breeze6-style-qt5"

RDEPENDS:${PN} += "breeze6-style \
ld-linux-aarch64.so.1 \
libKF5ConfigCore.so.5 \
libKF5ConfigGui.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5GuiAddons.so.5 \
libKF5IconThemes.so.5 \
libKF5Style.so.5 \
libKF5WindowSystem.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
