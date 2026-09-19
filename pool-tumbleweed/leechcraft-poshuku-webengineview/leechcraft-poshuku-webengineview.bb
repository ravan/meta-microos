SUMMARY = "LeechCraft Poshuku WebEngine-based backend Module"
DESCRIPTION = "This package provides WebEngine-based backend for LeechCraft Poshuku browser."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-poshuku-webengineview-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "5b22358193a3a1cfa5a296fdcd515941866f986752c35d85228900d971bafffdb1046fd9c444a0d71a99b71a2f4c71a69bd0b2c6e11903b91b4621e6cc0e5dec"

RPROVIDES:${PN} += "leechcraft-poshuku-backend \
leechcraft-poshuku-webengineview \
libleechcraft-poshuku-webengineview.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
