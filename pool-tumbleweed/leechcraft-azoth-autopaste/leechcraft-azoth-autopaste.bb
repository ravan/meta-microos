SUMMARY = "LeechCraft Azoth Autopaste Module"
DESCRIPTION = "This package provides a plugin for LeechCraft Azoth with \
which long messages can automatically be pasted to pastebins."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-autopaste-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "c2258e412804af589d7b7f828b046bc363cf92967d90cff929d348a729a6de96a9cc0d34d0fb0e01102046598f0f5963288534d0ee5e618803268562a18d4fff"

RPROVIDES:${PN} += "leechcraft-azoth-autopaste \
libleechcraft-azoth-autopaste.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-azoth-util-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
