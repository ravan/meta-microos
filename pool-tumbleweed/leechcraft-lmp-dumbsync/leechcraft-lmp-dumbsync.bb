SUMMARY = "LeechCraft Media synchronization Module"
DESCRIPTION = "This package provides an audio syncing plugin for LeechCraft \
to synchronize with Flash-like media players."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lmp-dumbsync-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "25922018ee10de409d60306cea23d2a109c8d3e373057683e3923af468bffe9c8db9fd7b76f401047cc352269d1e18417052ab607e9b003f242b7cff7fc3152a"

RPROVIDES:${PN} += "leechcraft-lmp-dumbsync \
libleechcraft-lmp-dumbsync.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-lmp-util-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
