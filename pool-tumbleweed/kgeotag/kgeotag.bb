SUMMARY = "A photo geotagging utility"
DESCRIPTION = "KGeoTag is a standalone geotagging program. \
Images can be associated with geographic coordinates by different means: On the \
one hand, a matching with GPX encoded geodata can be done, on the other hand, \
the coordinates can be set manually, either via drag and drop onto a map, via \
bookmarks or by manually supplying them. The coordinates can be stored in the \
images' Exif header and/or in XMP sidecar files."
LICENSE = "GPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "kgeotag-2.0.0-1.4.aarch64.rpm"
RPM_HASH = "811b9aeeb986267934bc372b03d50f2c5a136edb63e70d19550e5babe441df8ae5ed0255bce1f90053ab377a2e43e00a3d4d0db8be27d4ee9418bf0b0f662fd3"

RPROVIDES:${PN} += "kgeotag"

RDEPENDS:${PN} += "/usr/bin/env \
ld-linux-aarch64.so.1 \
libKExiv2Qt6.so.0 \
libKF6ColorScheme.so.6 \
libKF6ConfigCore.so.6 \
libKF6ConfigWidgets.so.6 \
libKF6CoreAddons.so.6 \
libKF6Crash.so.6 \
libKF6I18n.so.6 \
libKF6XmlGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libm.so.6 \
libmarblewidget-qt6.so.28 \
libstdc++.so.6"

inherit rpm
