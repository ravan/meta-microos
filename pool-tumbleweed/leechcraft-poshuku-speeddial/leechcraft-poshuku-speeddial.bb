SUMMARY = "LeechCraft Poshuku Speed Dial Module"
DESCRIPTION = "This package provides the Speed Dial support plugin for LeechCraft Poshuku."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-poshuku-speeddial-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "fbdb537812cff2fee8423688130fa36506f75280c9a5eb4b7b922d4dac2fa94015dce99f7ad457bf5aaa02bffb792a9b7d2d69a34a9232fb4b2f6492f0d74e82"

RPROVIDES:${PN} += "leechcraft-poshuku-speeddial \
libleechcraft-poshuku-speeddial.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
