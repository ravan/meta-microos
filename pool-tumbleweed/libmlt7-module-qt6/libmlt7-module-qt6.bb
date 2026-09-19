SUMMARY = "Qt 6 module for the MLT multimedia framework"
DESCRIPTION = "MLT is a multimedia framework for television broadcasting. It \
provides a toolkit for broadcasters, video editors, media players, \
transcoders and web streamers. \
 \
The functionality of the system is provided via an assortment of \
tools, XML authoring components, and an plug-in based API. \
 \
This package provides a Qt 6 module for MLT."
LICENSE = "GPL-3.0-or-later"

PV = "7.40.0"

RPM_NAME = "libmlt7-module-qt6-7.40.0-1.1.aarch64.rpm"
RPM_HASH = "52bb08641207bca60f2d6b0d4294bc6c3a63918822be01639b2d9ff2cb84f8ef1c0c8450b7b6c8c8082ebaf57f92161f163201fae3bec138463686e58e4d6871"

RPROVIDES:${PN} += "libmlt7-module-qt6 \
libmltglaxnimate-qt6.so \
libmltqt6.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libmlt++-7.so.7 \
libmlt-7.so.7 \
libmlt7-modules \
libstdc++.so.6 \
libz.so.1"

inherit rpm
