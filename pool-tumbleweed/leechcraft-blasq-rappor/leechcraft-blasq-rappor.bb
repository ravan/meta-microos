SUMMARY = "LeechCraft Blasq VKontakte client Module"
DESCRIPTION = "This package provides a VKontakte image storage client subplugin \
for LeechCraft Blasq."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-blasq-rappor-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "0fe6559cacaa257c03e0414164ce7bfebe46f4b868c4842929088b1152657a48a26d0a42d022120640bdd3ee790dd595b82e4c70b4c6712e158fb7282f58d6ac"

RPROVIDES:${PN} += "leechcraft-blasq-rappor \
leechcraft-blasq-subplugin \
libleechcraft-blasq-rappor.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-blasq \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-svcauth-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
