SUMMARY = "WebSockets support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for websockets support."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro6WebSockets0-0.13.0-1.6.aarch64.rpm"
RPM_HASH = "c9f6252289b6f84fc467c147f03f3ac17a2cf93027d8308b1989e746ad78de01eca9a421a166e89ceac9cc18041f438ec4d0e575a83b4d53b769d691afc86bc9"

RPROVIDES:${PN} += "libQCoro6WebSockets.so.0 \
libQCoro6WebSockets0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libQt6WebSockets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
