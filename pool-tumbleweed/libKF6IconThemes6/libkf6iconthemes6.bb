SUMMARY = "Icon GUI utilities"
DESCRIPTION = "This library contains classes to improve the handling of icons \
in applications using the KDE Frameworks."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6IconThemes6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f840b5b6e6d0db50d66bd3c64c8ef9db6ae9e31abecbc1b9e6b0cee8baa26d0191cd0429e5dd8fe730deb0f721c5dd85883587ed8fad962f62062adab58b2351"

RPROVIDES:${PN} += "libKF6IconThemes.so.6 \
libKF6IconThemes6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kiconthemes \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6BreezeIcons.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6I18n.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
