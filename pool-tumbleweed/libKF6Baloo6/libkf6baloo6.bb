SUMMARY = "Core library for Baloo Framework"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains Baloo's core library."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "libKF6Baloo6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "6fe5b03722c5ee7b0f55757902c67c5670356dfc541cb55a734fcf6369b45fbb8cd4fb0e8b317597c945ab7d20fa4ddb65099febd1dc737373e03083059d9b2b"

RPROVIDES:${PN} += "libKF6Baloo.so.6 \
libKF6Baloo6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6BalooEngine.so.6 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6FileMetaData.so.3 \
libKF6Solid.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
