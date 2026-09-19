SUMMARY = "Qt5 input module for kime"
DESCRIPTION = "Qt5 input module for kime Korean Input Method Engine."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "kime-qt5-3.1.1-2.12.aarch64.rpm"
RPM_HASH = "a98a558444452b45dd4fedb36e0d19597e24d0dbf1007f0bb0986b36b283624e9d659febee25c977b47bfd93e347d34278a6d84c83a07fc3bd6c4fa9ec83e616"

RPROVIDES:${PN} += "kime-qt5 \
libkime-qt5.so"

RDEPENDS:${PN} += "kime \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libkime-engine.so \
libstdc++.so.6"

inherit rpm
