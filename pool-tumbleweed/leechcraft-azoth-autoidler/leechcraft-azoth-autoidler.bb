SUMMARY = "LeechCraft Azoth Module for automatic status change"
DESCRIPTION = "This package provides a LeechCraft Azoth plugin which can \
automatically change your status based on an inactivity period."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-autoidler-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "4e8529a7e6e176752ffd39d8bdb97a68ed8062d0c8425f8e770ae9e00ef63728cb920f7b152f2144fb53a1321f80639af620dd196998c9d0ed4ead7935be726f"

RPROVIDES:${PN} += "leechcraft-azoth-autoidler \
libleechcraft-azoth-autoidler.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-x11-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
