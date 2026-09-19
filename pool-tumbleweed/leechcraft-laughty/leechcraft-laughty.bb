SUMMARY = "LeechCraft Notification Server Module"
DESCRIPTION = "This package provides a desktop notifications server plugin for Leechcraft."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-laughty-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "4600c986ba11b939669d45ac2fb95ddc5cc662d3c432358b445aba5a959fe84041039c1d1468741dcada9567fa4f60081f55981b635a2b00826827a063274a2e"

RPROVIDES:${PN} += "leechcraft-laughty \
libleechcraft-laughty.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-xdg-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
