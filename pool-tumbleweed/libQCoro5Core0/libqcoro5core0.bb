SUMMARY = "Core library of qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides the core library."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro5Core0-0.13.0-1.2.aarch64.rpm"
RPM_HASH = "e537c3d7d2c7654ed4c2b02e7a4911af3e9d1245a24a6f72cd3419c98b20ba0ed877e38ecfe89a1a714a13bce5dd56fd37cc7a417d450ca481f622f297a0f236"

RPROVIDES:${PN} += "libQCoro5Core.so.0 \
libQCoro5Core0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
