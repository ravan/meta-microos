SUMMARY = "Shared libraries for Cantor"
DESCRIPTION = "Shared libraries for package cantor."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "libcantorlibs28-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "1970aa6f7dee358123128fe8a69c515068c8c0b3b27feb07b1f8cc783efeffc7e4c4789e6f9b0480a79e098ce58d05f637732c1f7efbd4e2c89e8d28b4a82ad2"

RPROVIDES:${PN} += "libcantorlibs.so.28 \
libcantorlibs28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6KIOCore.so.6 \
libKF6SyntaxHighlighting.so.6 \
libKF6WidgetsAddons.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-qt6.so.3 \
libstdc++.so.6"

inherit rpm
