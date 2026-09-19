SUMMARY = "Qt client for freeciv"
DESCRIPTION = "Freeciv executable using Qt library"
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "freeciv-qt-3.2.6-2.1.aarch64.rpm"
RPM_HASH = "9e9f3701c5ed30cd066c9f9ba6d90d79b2788cb04d1e6dd9ad87b779fa0401a2df084fbde38aa080c161134146b3bdc45fe20800e27ceb0d2ba6c66350bb2525"

RPROVIDES:${PN} += "freeciv-client-3.2.6 \
freeciv-qt"

RDEPENDS:${PN} += "freeciv \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libSDL3-mixer.so.0 \
libSDL3.so.0 \
libc.so.6 \
libfreeciv.so \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
