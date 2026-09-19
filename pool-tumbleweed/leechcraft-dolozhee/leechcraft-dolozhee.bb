SUMMARY = "LeechCraft Issue reporting Module"
DESCRIPTION = "This package provides a Dolozhee plugin for LeechCraft which \
allows submitting bug reports and feature requests to the \
LeechCraft issue tracker."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-dolozhee-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "1fc86d216bb923dcb32e7b660e887e316b073baf7e1f67a41e071acc82d54092a0cf5857774693ab85ca9cc15b4d5570a5a2922b2b290309f671e55f84334c51"

RPROVIDES:${PN} += "leechcraft-dolozhee \
libleechcraft-dolozhee.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
