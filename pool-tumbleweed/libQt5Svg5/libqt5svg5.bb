SUMMARY = "Qt 5 SVG Library"
DESCRIPTION = "The Qt SVG module provides functionality for displaying SVG images \
as a widget, and to create SVG files using drawing commands."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde5"

RPM_NAME = "libQt5Svg5-5.15.19+kde5-1.3.aarch64.rpm"
RPM_HASH = "00c39bcc05f2ebbdfcd900e5a418d6d2efbf2f0cc2c9efc63bb274beddb480861e0fe97778b5868e6367d2fbcf65e1f9d589dab6ba0a562b90121525ebf47ddd"

RPROVIDES:${PN} += "libQt5Svg.so.5 \
libQt5Svg5 \
libqsvg.so \
libqsvgicon.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libQt5Widgets5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
