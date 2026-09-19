SUMMARY = "Qt Quick support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for Qt Quick operations support."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro5Quick0-0.13.0-1.2.aarch64.rpm"
RPM_HASH = "b3d60f6aca0f4484dd55744087f9bf9287ea1a0a739372f541eccd9ad522a25568ee079aecb8027922ba864e1410c3296f90cb2effa54813878e5b22c2211c5a"

RPROVIDES:${PN} += "libQCoro5Quick.so.0 \
libQCoro5Quick0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Quick.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
