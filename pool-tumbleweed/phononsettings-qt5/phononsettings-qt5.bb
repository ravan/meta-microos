SUMMARY = "Settings Tool for Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-only | LGPL-3.0-only"

PV = "4.12.0"

RPM_NAME = "phononsettings-qt5-4.12.0-2.8.aarch64.rpm"
RPM_HASH = "d9f389265a0153a90ab8445ce76ce1c87dc22d9f648a4bf761baa7357747baf0639926083bf024cd95d8205e117ee22bcd3f07aa4ad15fa7b279db088e1b98fc"

RPROVIDES:${PN} += "phononsettings \
phononsettings-qt5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
