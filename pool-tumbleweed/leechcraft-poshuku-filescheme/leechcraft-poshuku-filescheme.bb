SUMMARY = "LeechCraft Poshuku file: scheme module"
DESCRIPTION = "This package provides file: scheme support for LeechCraft Poshuku, \
allowing to navigate local resources. \
FileScheme also supports 'downloading' files from there."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-poshuku-filescheme-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "ad7c3e1c0d014fadb7a221e173ab5ef32395ea9099d24a9c1c79cf8666969e12aa8b3df27657a661c2742f8b4430ac922e65e2d930d8f3a7686e983eb7d73b7d"

RPROVIDES:${PN} += "leechcraft-poshuku-filescheme \
libleechcraft-poshuku-filescheme.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-poshuku \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-util-qt6.so.0.6.75 \
libstdc++.so.6"

inherit rpm
