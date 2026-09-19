SUMMARY = "Phonon Multimedia Platform Abstraction"
DESCRIPTION = "Phonon is a cross-platform portable Multimedia Support Abstraction, \
which allows you to play multiple audio or video formats with the same \
quality on all platforms, no matter which underlying architecture is \
used."
LICENSE = "LGPL-2.0-or-later"

PV = "4.12.0"

RPM_NAME = "libphonon4qt6-4.12.0-2.8.aarch64.rpm"
RPM_HASH = "3ffe14b13957dd574369da05736506e34378068ecee121f77c57c1860b8b827a517f9cb539b81c2e7103e1fc1d65fb507268437d695ed8a6b9157296a4c84ed1"

RPROVIDES:${PN} += "libphonon4qt6 \
libphonon4qt6.so.4 \
libphonon4qt6experimental.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libpulse-mainloop-glib.so.0 \
libpulse.so.0 \
libstdc++.so.6"

inherit rpm
