SUMMARY = "Holiday API for KDE PIM"
DESCRIPTION = "This package contains a library which helps developers determining when holidays occur."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Holidays6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "1a1c5b3af894d61132042c46a1abfe9fd9a64b6e165773a3717bdbb87a671b929f07b8acf57ad2a04f65d580d54add6274830028d526cc6c3bd3a28f0fb2ba2d"

RPROVIDES:${PN} += "libKF6Holidays.so.6 \
libKF6Holidays6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kholidays \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
