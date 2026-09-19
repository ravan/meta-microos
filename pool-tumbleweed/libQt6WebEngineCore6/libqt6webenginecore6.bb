SUMMARY = "Qt6 WebEngineCore library"
DESCRIPTION = "The Qt6 WebEngineCore library."
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6WebEngineCore6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9047ed4317eb5ef6cc2c1abe40885274ab3929f6e70944f3c6b3dcfe5f17383598e07d9f352a538dd67e153c21426175a1f95f21dc9c46d6cd347f0649c75639"

RPROVIDES:${PN} += "libQt6WebEngineCore.so.6 \
libQt6WebEngineCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Positioning.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6WebChannel.so.6 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXrandr.so.2 \
libXtst.so.6 \
libasound.so.2 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libdbus-1.so.3 \
libexpat.so.1 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgbm.so.1 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libharfbuzz-subset.so.0 \
libharfbuzz.so.0 \
libicui18n.so.78 \
libicuuc.so.78 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libminizip.so.1 \
libnspr4.so \
libnss3.so \
libnssutil3.so \
libopenh264.so.8 \
libopenjp2.so.7 \
libopus.so.0 \
libpng16.so.16 \
libsmime3.so \
libsnappy.so.1 \
libstdc++.so.6 \
libtiff.so.6 \
libudev.so.1 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libxcb.so.1 \
libxkbcommon.so.0 \
libxkbfile.so.1 \
libxml2.so.16 \
libxslt.so.1 \
libz.so.1 \
qt6-webengine"

inherit rpm
