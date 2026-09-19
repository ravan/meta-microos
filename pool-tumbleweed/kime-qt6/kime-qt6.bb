SUMMARY = "Qt6 input module for kime"
DESCRIPTION = "Qt6 input module for kime Korean Input Method Engine."
LICENSE = "GPL-3.0-or-later"

PV = "3.1.1"

RPM_NAME = "kime-qt6-3.1.1-2.12.aarch64.rpm"
RPM_HASH = "34f743d55b3cae279c0a160c52b3806518f7a1d9c9dcd78511d501bf4f8c3fcd0c184ef798db116e541a6057f113b9f7e4349fff4f2a7d3cffb9b7de5c676696"

RPROVIDES:${PN} += "kime-qt6 \
libkime-qt6.so"

RDEPENDS:${PN} += "kime \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libkime-engine.so \
libstdc++.so.6"

inherit rpm
