SUMMARY = "Open Collaboration Service client library"
DESCRIPTION = "Attica is a library to access Open Collaboration Service servers."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Attica6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "2a4d1adebf592a8befc46a8893bf51e9db5f1c96388f4aa955951b20b4f1ba75504df987f730d2278d7770af2c7412262a28f0aafaffba2e8be00544723d811e"

RPROVIDES:${PN} += "libKF6Attica.so.6 \
libKF6Attica6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-attica \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
