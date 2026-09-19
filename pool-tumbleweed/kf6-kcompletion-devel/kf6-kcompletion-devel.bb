SUMMARY = "Header files for kcompletion, a widget collection with completion support"
DESCRIPTION = "Development files for KCompletion, a widget collection with advanced \
completion support as well as a lower-level completion class which \
can be used with own widgets."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kcompletion-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "0166584f3399114f7ae54eaab70cb5bcb7705f8f1610fff01858ee5e3049dee41d850eed3b310ba4315b432062271775732675873a337c996a10839a17d2a246"

RPROVIDES:${PN} += "cmake-KF6Completion \
kf6-kcompletion-devel"

RDEPENDS:${PN} += "cmake-Qt6Widgets \
ld-linux-aarch64.so.1 \
libKF6Completion.so.6 \
libKF6Completion6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
