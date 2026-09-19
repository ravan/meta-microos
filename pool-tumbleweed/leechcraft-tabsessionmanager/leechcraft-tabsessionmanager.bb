SUMMARY = "LeechCraft Tab Session Manager Module"
DESCRIPTION = "This package provides a Tab Session Manager plugin for Leechcraft \
which allows to automatically restore the last session and allows \
to create named sessions."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-tabsessionmanager-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "9e3ec27ad46162c994235e923cb0ab8732bb00a82f669202a59fcceb7f00f53c4fff4ab58401eaf1eeb69c1494b116cb82211a697f96c4ac90cb1f5c35ae5112"

RPROVIDES:${PN} += "leechcraft-tabsessionmanager \
libleechcraft-tabsessmanager.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
