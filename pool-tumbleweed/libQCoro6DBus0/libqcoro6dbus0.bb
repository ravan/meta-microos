SUMMARY = "DBus support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for D-Bus support."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro6DBus0-0.13.0-1.6.aarch64.rpm"
RPM_HASH = "6046298efa69ea445a88e8dd6a5b72a2b8eb50a7a896e53b7269bf01f94e5816d2c8ca8bec939dbbda1c35613e47725e4f91bbc6985d55316aa360a81089a0ce"

RPROVIDES:${PN} += "libQCoro6DBus.so.0 \
libQCoro6DBus0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
