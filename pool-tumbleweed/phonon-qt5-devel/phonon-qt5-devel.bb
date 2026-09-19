SUMMARY = "Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-or-later"

PV = "4.12.0"

RPM_NAME = "phonon-qt5-devel-4.12.0-2.8.aarch64.rpm"
RPM_HASH = "977c2d9f4550208de1605171bca5e095fb1e6940d89440ee3f0d2e7583d730db26ff3d20bd9087b9558f83398b3143b0d8a92be6fe25ffc2f77de5b1fabf1bcf"

RPROVIDES:${PN} += "cmake-Phonon4Qt5 \
cmake-Phonon4Qt5Experimental \
phonon-qt5-devel \
phonon4qt5-devel \
pkgconfig-phonon4qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-Qt5Core \
cmake-Qt5Widgets \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Designer.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libphonon4qt5 \
libphonon4qt5.so.4 \
libstdc++.so.6"

inherit rpm
