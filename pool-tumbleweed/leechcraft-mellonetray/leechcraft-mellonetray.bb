SUMMARY = "LeechCraft Tray Area Module"
DESCRIPTION = "This package provides a tray area quark for third-party apps \
for LeechCraft SB2."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-mellonetray-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "77fde78b2f0d08bb1c0fc68a077a3ce9a87f5278c96e6ea92de01a4d3cc6029128ccdaf1446541048e38d08d497dae1ba1fcd6d72a4936df1311b9afef3ab36b"

RPROVIDES:${PN} += "leechcraft-mellonetray \
libleechcraft-mellonetray.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-sb2 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libX11.so.6 \
libXdamage.so.1 \
libXrender.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-x11-qt6.so.0.6.75 \
libstdc++.so.6 \
qt6qmlimport-QtQuick"

inherit rpm
