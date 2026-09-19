SUMMARY = "SVG viewer component"
DESCRIPTION = "An SVG viewer component (KPart)."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "svgpart-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "be16d3c9e1351e7b1c0be5f44fa0d9c9ec4ab25a2bb076b962a3ac8f53f1246cc3b733c5f2bb4551d075b93400ca3e17848b4782a8d44cc66fb8d0853e8f7bdc"

RPROVIDES:${PN} += "svgpart"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6Parts.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
