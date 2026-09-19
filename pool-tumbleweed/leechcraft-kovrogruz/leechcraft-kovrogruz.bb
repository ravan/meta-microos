SUMMARY = "LeechCraft Album art Module"
DESCRIPTION = "This package provides a plugin for LeechCraft \
for fetching album art from various services."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-kovrogruz-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "dc5f41ff956150bc40699e1c595ff8146dbf0f2f2210df1518dfb632aed9cff7cde23a71faf4f2dc388a607254e0b6c3a563fdb6a7e45028371854700caf2f88"

RPROVIDES:${PN} += "leechcraft-kovrogruz \
libleechcraft-kovrogruz.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
