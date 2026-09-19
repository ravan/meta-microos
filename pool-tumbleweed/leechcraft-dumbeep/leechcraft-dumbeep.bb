SUMMARY = "LeechCraft DumBeep Module"
DESCRIPTION = "This package provides a dumb sound notifier plugin for LeechCraft. \
 \
It uses Phonon as a backend, or something like aplay/mplayer."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-dumbeep-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "7d7a1b09b7339c628717d2f10c77f6c1715fe4721c9146d88d20c37924bc7c57a29d319f90e9f1727b7aeec4a83c0f4f32ffb8ef324ddbeb3ab7546c68fd1f50"

RPROVIDES:${PN} += "leechcraft-dumbeep \
leechcraft-soundnotifications \
libleechcraft-dumbeep.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
