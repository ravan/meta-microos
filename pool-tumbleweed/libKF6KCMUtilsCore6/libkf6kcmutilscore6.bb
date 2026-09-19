SUMMARY = "Core library of classes to work with KCModules"
DESCRIPTION = "KCMUtils provides various classes to work with KCModules. This package provides \
the main core library."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6KCMUtilsCore6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "48d49ffa33ad9f7405a77924961a03329040a6748d8e9f48c17f02a1ded6b60fd921723a09e857ac591930c97e37955df8f751cc43c9368d287d113ac7a37be6"

RPROVIDES:${PN} += "libKF6KCMUtilsCore.so.6 \
libKF6KCMUtilsCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
