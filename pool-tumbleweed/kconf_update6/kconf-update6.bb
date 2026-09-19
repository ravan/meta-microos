SUMMARY = "Configuration file access"
DESCRIPTION = "KConfig provides an advanced configuration system. It is made of two parts: \
KConfigCore and KConfigGui. \
 \
This package contains the kconf_update tool."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kconf_update6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "bcbe0ac13fc90b7b7722b93d3bf2fc68cbc48048014626ff014de750c4c4797ea891c5e3912f0285fd1be0b78f503b6ced2a0942f4f3f3fb96e97096eaab6415"

RPROVIDES:${PN} += "kconf-update6"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigCore6 \
libQt6Core.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
