SUMMARY = "Qml support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for Qml operations support."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro6Qml0-0.13.0-1.6.aarch64.rpm"
RPM_HASH = "bd335342f004700969b2faddc83f2ecdc8c3470a0bccaf5da07df69af12201aec3c76272868a103022da1edbc2c1ce96a9f5926d14c3507b3dfd3c92a1844203"

RPROVIDES:${PN} += "libQCoro6Qml.so.0 \
libQCoro6Qml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
