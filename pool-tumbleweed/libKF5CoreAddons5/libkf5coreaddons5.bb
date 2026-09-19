SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.116.0"

RPM_NAME = "libKF5CoreAddons5-5.116.0-1.9.aarch64.rpm"
RPM_HASH = "2dfcb0753597286cda18548036c4aac82354744e52bd633f5f67062785d2216858930f99efc7a98d13767d1b68bd46e82c7df024ccfbc937c8330e0f8d013eeb"

RPROVIDES:${PN} += "libKF5CoreAddons.so.5 \
libKF5CoreAddons5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
