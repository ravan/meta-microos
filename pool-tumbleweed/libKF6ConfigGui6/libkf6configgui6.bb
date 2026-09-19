SUMMARY = "Widgets hooks for configuration entities"
DESCRIPTION = "KConfigGui provides a way to hook widgets to the configuration so that they are \
automatically initialized from the configuration and automatically propagate \
their changes to their respective configuration files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6ConfigGui6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "f3f153db092d0f27ffa60c476718e408d050a6c2600e31f0d8ec1fac3c2a62fca8745f7f3445b64ed69c212a08f5c8d73a5521fc51eaf569a58f58973af670f9"

RPROVIDES:${PN} += "libKF6ConfigGui.so.6 \
libKF6ConfigGui6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigCore6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
