SUMMARY = "Library for Qt Matrix Clients"
DESCRIPTION = "Library for Qt-based Matrix chat clients. It is required by \
Quaternion."
LICENSE = "LGPL-2.1-only"

PV = "0.9.6"

RPM_NAME = "libQuotientQt6-0_9-0.9.6-2.3.aarch64.rpm"
RPM_HASH = "25ba7a99f1f155ed8407531c23769cb04d3af07afeedaa00af96da7f7eaff4b4fdad5b25b2754dff5f8424d0f875134042d0705f5ef40a386cdf2a004c815d93"

RPROVIDES:${PN} += "libQuotientQt6-0-9 \
libQuotientQt6.so.0.9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libolm.so.3 \
libqt6keychain.so.1 \
libstdc++.so.6"

inherit rpm
