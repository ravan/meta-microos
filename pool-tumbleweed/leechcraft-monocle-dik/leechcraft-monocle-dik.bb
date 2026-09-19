SUMMARY = "MOBI support for LeechCraft Monocle"
DESCRIPTION = "This package contains the MOBI subplugin for LeechCraft Monocle."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-monocle-dik-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "e451e91b5b6218965718dd2437e7fe38ad13fd7ff56975897491e5f6a0c447efe4017c21a6ae962ef4fa47b60d4a12a13f77ff7a0a0bdc54187a451b16f56c47"

RPROVIDES:${PN} += "leechcraft-monocle-dik \
leechcraft-monocle-subplugin \
libleechcraft-monocle-dik.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft \
leechcraft-monocle \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-monocle-util-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
