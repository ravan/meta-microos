SUMMARY = "Hex editor/viewer QWidgets libraries"
DESCRIPTION = "Okteta libraries for QWidget-based hex editing widgets."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.28"

RPM_NAME = "libOkteta3-0.26.28-1.1.aarch64.rpm"
RPM_HASH = "97f7b7f86cabd7e37c3f83d65b06c6ba14dd8fdbbbea1477b9649046694b769ff40cd4b72a94adcbb1d8c99d698241f645b950c07c353c3f8935e61ca8b771e4"

RPROVIDES:${PN} += "libOkteta3 \
libOkteta3Core.so.0 \
libOkteta3Gui.so.0 \
libokteta"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5Codecs.so.5 \
libKF5ConfigWidgets.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
