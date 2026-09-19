SUMMARY = "LeechCraft Crash handler Module"
DESCRIPTION = "This package provides a crash handler plugin for LeechCraft \
which shows backtraces and aids in sending bug reports."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-anhero-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "e8831746a139f7750f4b5036c715f24bdf68c7784eeac157d76c3fe5d2f953a65e09dfef25d45a41e2f05d68ee708807658e142482c4733afc1860c40dc0336a"

RPROVIDES:${PN} += "leechcraft-anhero \
libleechcraft-anhero.so"

RDEPENDS:${PN} += "gdb \
ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
