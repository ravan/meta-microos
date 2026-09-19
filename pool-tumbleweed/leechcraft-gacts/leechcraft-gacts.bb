SUMMARY = "LeechCraft Global actions Module"
DESCRIPTION = "This package provides a global shortcut manager for LeechCraft \
with which global hotkeys can be set and used."
LICENSE = "BSL-1.0 & (CPL-1.0 | LGPL-2.1-only)"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-gacts-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "7741aafe94ba9cfd913d94dd67b6b6025d84bd9dd41c2126cf2dd6de8b1a8ff5bd0ae1eaa36193bc0de949476331ad28302e3c6827c8490f932bba2b7f4e4bc3"

RPROVIDES:${PN} += "leechcraft-gacts \
libleechcraft-gacts.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-x11-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
