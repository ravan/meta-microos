SUMMARY = "LeechCraft Equalizer Module"
DESCRIPTION = "This package provides a 10-band equalizer."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-lmp-fradj-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "ad1d05033186f5d1565b5ca048ae1376ae0d8ed900001f236c76e697e736722ce126f266f1c79908c508ac8d13c20d3a0f10440f93fe7fbeb0eb9b732930c3fa"

RPROVIDES:${PN} += "leechcraft-lmp-fradj \
libleechcraft-lmp-fradj.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-lmp \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libqwt-qt6.so.6.3 \
libstdc++.so.6"

inherit rpm
