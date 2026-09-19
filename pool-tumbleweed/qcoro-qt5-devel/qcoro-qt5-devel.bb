SUMMARY = "Development files for qcoro"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 coroutines \
in connection with certain asynchronous Qt actions. \
This package provides development headers to use QCoro in Qt based \
applications."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "qcoro-qt5-devel-0.13.0-1.2.aarch64.rpm"
RPM_HASH = "4f2a34b3f1521d9e8301398bbbee2849eeb69c6d4f424930b04390958798dad87a7465d07648c04f5edf3172bb78c5dcac491ba5ab86ff2f8272b5efca68e80f"

RPROVIDES:${PN} += "cmake-QCoro5 \
cmake-QCoro5Core \
cmake-QCoro5Coro \
cmake-QCoro5DBus \
cmake-QCoro5Network \
cmake-QCoro5Qml \
cmake-QCoro5Quick \
cmake-QCoro5Test \
cmake-QCoro5WebSockets \
qcoro-qt5-devel"

RDEPENDS:${PN} += "libQCoro5Core0 \
libQCoro5DBus0 \
libQCoro5Network0 \
libQCoro5Qml0 \
libQCoro5Quick0 \
libQCoro5WebSockets0"

inherit rpm
