SUMMARY = "Development files for qcoro"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 coroutines \
in connection with certain asynchronous Qt actions. \
This package provides development headers to use QCoro in Qt based \
applications."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "qcoro-qt6-devel-0.13.0-1.6.aarch64.rpm"
RPM_HASH = "e217a626c84176e162462e50436b928ffcc92c2de87da88bbb8df8f82afdef33804d3d07ee0b164d5402ff24729791fd817a66b06e60749a46c1f2156927f5e4"

RPROVIDES:${PN} += "cmake-QCoro6 \
cmake-QCoro6Core \
cmake-QCoro6Coro \
cmake-QCoro6DBus \
cmake-QCoro6Network \
cmake-QCoro6Qml \
cmake-QCoro6Quick \
cmake-QCoro6Test \
cmake-QCoro6WebSockets \
qcoro-qt6-devel"

RDEPENDS:${PN} += "libQCoro6Core0 \
libQCoro6DBus0 \
libQCoro6Network0 \
libQCoro6Qml0 \
libQCoro6Quick0 \
libQCoro6WebSockets0"

inherit rpm
