SUMMARY = "EPub support for LeechCraft Monocle"
DESCRIPTION = "This package contains the EPub subplugin for LeechCraft Monocle."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-monocle-boop-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "f6ee1f86d17b6c33301c19261bc03c0723175b6ec4b11a4108838c693afe96fe8242beae92e776cdc9c8ceaecf2457a11a8212d2b2315cf482bfa74b0156d816"

RPROVIDES:${PN} += "leechcraft-monocle-boop \
leechcraft-monocle-subplugin \
libleechcraft-monocle-boop.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-monocle-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libquazip1-qt6.so.1.7 \
libstdc++.so.6"

inherit rpm
