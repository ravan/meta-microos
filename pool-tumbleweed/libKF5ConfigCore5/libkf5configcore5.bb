SUMMARY = "System for configuration files"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
KConfigCore provides access to the configuration files themselves."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5ConfigCore5-5.116.0-2.8.aarch64.rpm"
RPM_HASH = "747472b33201d7fd677b48bbe235e488c51b4dcce7643b40fe7a0081dee5ef3d8d2c70cf40c4f422cd670d18a95cba8b47f77f765e8374a982c17a47dbb5ca55"

RPROVIDES:${PN} += "libKF5ConfigCore.so.5 \
libKF5ConfigCore5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libQt5DBus.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
