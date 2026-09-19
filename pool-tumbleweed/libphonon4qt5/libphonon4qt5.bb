SUMMARY = "Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-or-later"

PV = "4.12.0"

RPM_NAME = "libphonon4qt5-4.12.0-2.8.aarch64.rpm"
RPM_HASH = "3c6a1f15c3d1e0b35ff794020756808b50fc4b2576d58ea3c5618c7521fa0c0d2a1fd59bfc6f638c597ee50448412bac7e7e260c4be080262d3530da7394d76f"

RPROVIDES:${PN} += "libphonon4qt5 \
libphonon4qt5.so.4 \
libphonon4qt5experimental.so.4 \
phonon4qt5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
