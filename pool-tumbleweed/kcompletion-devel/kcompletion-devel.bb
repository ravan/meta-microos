SUMMARY = "Header files for kcompletion, a widget collection with completion support"
DESCRIPTION = "Development files for KCompletion, a widget collection with advanced \
completion support as well as a lower-level completion class which \
can be used with own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "kcompletion-devel-5.116.0-1.8.aarch64.rpm"
RPM_HASH = "81070a720ac3075e8d5bb05c0b968eff8dc90031a187f55007f7a02d9fec059ff18ad7852c7f32b85e4a2ecae19cee955ce070561dc8760f1733eaf7b59a7ea1"

RPROVIDES:${PN} += "cmake-KF5Completion \
kcompletion-devel"

RDEPENDS:${PN} += "cmake-Qt5Widgets \
ld-linux-aarch64.so.1 \
libKF5Completion.so.5 \
libKF5Completion5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
