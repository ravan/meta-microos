SUMMARY = "Settings Tool for Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "4.12.0"

RPM_NAME = "phononsettings-qt6-4.12.0-2.8.aarch64.rpm"
RPM_HASH = "f1d2d7e6be929ce76c4cccaeddc5dce1bf622de5cd3ccb0077f2b1374e2310457b591bbee1cf5d8bb27ab9b9216fffd7391833cc5fe6115085c2fa2c89c16ea0"

RPROVIDES:${PN} += "phononsettings-qt6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libphonon4qt6.so.4 \
libstdc++.so.6"

inherit rpm
