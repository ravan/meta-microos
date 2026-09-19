SUMMARY = "Async Bluez wrapper library"
DESCRIPTION = "Async Bluez wrapper library."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6BluezQt6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "ff6538521d244e5e14260b3ed3346a8647ec07deafbc509f25d73076e9d009c5f74be60925fb440686bcabe26e81ae7f6d1063cb167f6a1fc788aeb2927aa2a0"

RPROVIDES:${PN} += "libKF6BluezQt.so.6 \
libKF6BluezQt6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-bluez-qt \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
