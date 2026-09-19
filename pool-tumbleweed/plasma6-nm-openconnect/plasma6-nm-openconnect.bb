SUMMARY = "OpenConnect support for plasma6-nm"
DESCRIPTION = "OpenConnect plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-openconnect-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "418ba9e51818a097ce60baa2245923303da67edf47e35c87e3687808acdcf6a52935936be7a26e948d1e19b896ee58475ee15ac3526d0bacf337ff41fe100a23"

RPROVIDES:${PN} += "NetworkManager-openconnect-frontend \
plasma-nm-openconnect \
plasma-nm5-openconnect \
plasma6-nm-openconnect"

RDEPENDS:${PN} += "NetworkManager-openconnect \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libopenconnect.so.5 \
libplasmanm-editor.so \
libstdc++.so.6 \
openconnect \
plasma6-nm"

inherit rpm
