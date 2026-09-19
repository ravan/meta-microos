SUMMARY = "LeechCraft Blasq LiveJournal/FotoBilder client Module"
DESCRIPTION = "This package provides a LiveJournal FotoBilder image storage client subplugin \
for LeechCraft Blasq."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-blasq-deathnote-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "16a7e24417f43514aa00c3df1435658b5f67964c2659fae470100299e6eb948b2127c5047b58120cd8d95b6969e46bfc7850279509073ca8c9fb00dff2578a3e"

RPROVIDES:${PN} += "leechcraft-blasq-deathnote \
leechcraft-blasq-subplugin \
libleechcraft-blasq-deathnote.so"

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
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
