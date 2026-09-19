SUMMARY = "Qt 6 SVGWidgets library"
DESCRIPTION = "The Qt 6 SvgWidgets library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6SvgWidgets6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9c7e75fe9d1060187b87e16f881781dd9789cb81623c98aeb2c33b43e302effc6111ec4e8493055c1f4df104d5ee170332914cadad1a7a4a6acd588d6d236281"

RPROVIDES:${PN} += "libQt6SvgWidgets.so.6 \
libQt6SvgWidgets6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
