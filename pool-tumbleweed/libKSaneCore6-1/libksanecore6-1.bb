SUMMARY = "Qt interface for the SANE library for scanner hardware"
DESCRIPTION = "KSaneCore is a Qt-based interface for SANE library to control scanner hardware."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "26.08.1"

RPM_NAME = "libKSaneCore6-1-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "197765b618d6f6f1fdae2ecd65582c1d77e74db4e94a259fedaa54791c5e8558e80d7425d5160c896566a2b820c9387c2540c82a3a11eaeae0f361a679a350a0"

RPROVIDES:${PN} += "libKSaneCore6-1 \
libKSaneCore6.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libsane.so.1 \
libstdc++.so.6"

inherit rpm
