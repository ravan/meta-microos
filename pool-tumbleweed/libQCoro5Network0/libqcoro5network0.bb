SUMMARY = "Network support library for qcoro, a library providing coroutines for Qt"
DESCRIPTION = "The QCoro library provides set of tools to make use of the C++20 \
coroutines in connection with certain asynchronous Qt actions. This package \
provides a library for network operations support."
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "libQCoro5Network0-0.13.0-1.2.aarch64.rpm"
RPM_HASH = "56f1632e6b2f4001d11dad4bb4ba062f79d8715dac60370d41ec94dcb0dba92d98a33f3925516279bc0f7d0d53d898c53f6cbc5503ad54ae269fecb40ceef397"

RPROVIDES:${PN} += "libQCoro5Network.so.0 \
libQCoro5Network0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQCoro5Core.so.0 \
libQt5Core.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
