SUMMARY = "Qml support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for Qml operations support."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro5Qml0-0.13.0-1.2.aarch64.rpm"
RPM_HASH = "fff46152cd5a6430e69459517d66543ad656701bbd75bcb621ccb0de5212ec958866414f8be218ba9da8a3bad9193736a4154d18eb01f1dfb64514e39c076df8"

RPROVIDES:${PN} += "libQCoro5Qml.so.0 \
libQCoro5Qml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Qml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
