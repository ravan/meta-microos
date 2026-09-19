SUMMARY = "Efficient ID3 Tag Editor: Libraries and Data"
DESCRIPTION = "This package contains common libraries and data files used by kid3, kid3-qt, and kid3-cli."
LICENSE = "GPL-2.0-or-later"

PV = "3.9.7"

RPM_NAME = "kid3-core-3.9.7-2.6.aarch64.rpm"
RPM_HASH = "965a380ac91b6e193d18f5e55587c07ed645645a7610d6375f7b76780896da7696f3700c4ba51c339b0b22fa53c82b29c971b8b952da5b0cbc49b0170ecd4e36"

RPROVIDES:${PN} += "config-kid3-core \
kid3-core \
libacoustidimport.so \
libamazonimport.so \
libdiscogsimport.so \
libfreedbimport.so \
libid3libmetadata.so \
libkid3-core.so \
libkid3-gui.so \
libkid3qml.so \
libmusicbrainzimport.so \
liboggflacmetadata.so \
libqmlcommand.so \
libtaglibmetadata.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libFLAC++.so.11 \
libFLAC.so.14 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libchromaprint.so.1 \
libgcc-s.so.1 \
libid3-3.8.so.3 \
libm.so.6 \
libogg.so.0 \
libstdc++.so.6 \
libswresample.so.6 \
libtag.so.2 \
libvorbis.so.0 \
libvorbisfile.so.3 \
qt6qmlimport-QtQml.2 \
qt6qmlimport-QtQuick.2"

inherit rpm
