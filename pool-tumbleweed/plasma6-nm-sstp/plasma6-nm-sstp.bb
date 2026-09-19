SUMMARY = "SSTP support for plasma6-nm"
DESCRIPTION = "Secure Sockets Tunneling Protocol (SSTP) plugin for plasma-nm components."
LICENSE = "(GPL-2.0-only | GPL-3.0-only) & (LGPL-2.1-only | LGPL-3.0-only)"

PV = "6.7.5"

RPM_NAME = "plasma6-nm-sstp-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "5a186d5c527af9df4cabf313f9e2a82a4f8bd6fb2a7342e589c1de56b49d0a2b0d1b54ed074239dc9f39c6469e4a864212972bdec8ac4ba9b869b89546c04576"

RPROVIDES:${PN} += "NetworkManager-sstp-frontend \
plasma6-nm-sstp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOWidgets.so.6 \
libKF6NetworkManagerQt.so.6 \
libKF6WidgetsAddons.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libplasmanm-editor.so \
libstdc++.so.6 \
plasma6-nm"

inherit rpm
