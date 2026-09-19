SUMMARY = "Web browser engine for Qt applications"
DESCRIPTION = "The Qt WebEngine module provides a web browser engine to embed web content into \
Qt applications. \
The functionality in Qt WebEngine is divided into the following \
modules: \
* Qt WebEngine Core module for interacting with Chromium \
* Qt WebEngine Widgets module for creating widget-based web applications \
* Qt WebEngine module for creating Qt Quick based web applications"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "qt6-webengine-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "dfb222dd9be5425847db8c55d6bfd1767fbb68b99e5323aa202a8f948458d21fbaa808b9fbf1db188c07839e9a1d05cfc7fd3a3278c85e295db0a1c9d8f6f5af"

RPROVIDES:${PN} += "libqwebengineview.so \
qt6-webengine"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libdbus-1.so.3 \
libexpat.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgcc-s.so.1 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libjpeg.so.8 \
libm.so.6 \
libminizip.so.1 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libpng16.so.16 \
libsmime3.so \
libstdc++.so.6 \
libwebp.so.7 \
libwebpmux.so.3 \
libxcb.so.1 \
libz.so.1"

inherit rpm
