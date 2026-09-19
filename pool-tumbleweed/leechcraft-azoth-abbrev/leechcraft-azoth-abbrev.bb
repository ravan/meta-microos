SUMMARY = "LeechCraft Azoth Abbreviations Module"
DESCRIPTION = "This package provides abbreviations via commands like /abbrev, /unabbrev \
and /listabbrevs for LeechCraft Azoth."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-abbrev-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "0347cebf30a17d9a08deb574c9ecd7fe31bc6c53aaa835f57b7bbbad7544a346cc79fbb0876480672996b424a516f2d876329fef86bfda1fad4aecc7169bb61b"

RPROVIDES:${PN} += "leechcraft-azoth-abbrev \
libleechcraft-azoth-abbrev.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth-protocolplugin \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-azoth-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
