SUMMARY = "Media Player Classic Qute Theater"
DESCRIPTION = "A clone of Media Player Classic reimplemented in Qt."
LICENSE = "GPL-2.0-only"

PV = "26.07"

RPM_NAME = "mpc-qt-26.07-1.1.aarch64.rpm"
RPM_HASH = "4584979d8593ccecad3afe1bb2cee2cca9bb2caaa17d75dbe637a269ec81cf7495e6abb3bd8144fbbf245a054f3a1bb6518ca1f12ebf5552bddcff1a4e2f046f"

RPROVIDES:${PN} += "mpc-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmpv.so.2 \
libstdc++.so.6"

inherit rpm
