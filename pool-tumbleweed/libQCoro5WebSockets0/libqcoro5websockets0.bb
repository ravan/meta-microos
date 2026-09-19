SUMMARY = "WebSockets support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for websockets support."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro5WebSockets0-0.13.0-1.2.aarch64.rpm"
RPM_HASH = "ce445d1f08b9b3c6a19ba9a838b368de7da41720b10d56bfd02dce1908cec58ccaefe4106b9c612ecd6ac409739f20c9b7e464bfeb8e60bf8ad29232ad3e0950"

RPROVIDES:${PN} += "libQCoro5WebSockets.so.0 \
libQCoro5WebSockets0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libQt5WebSockets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
