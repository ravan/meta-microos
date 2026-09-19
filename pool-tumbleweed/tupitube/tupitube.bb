SUMMARY = "2D vectorial/animation tool"
DESCRIPTION = "Tupitube is a design and authoring tool for digital artists \
interested in 2D animation. Its source code is based on the KTooN \
project. \
 \
Some of its main features are: basic illustration tools (shapes, fill, \
text), gradient tools, onion skin, brushes editor, pencil with smoothness \
support and a basic object library (for SVG files and raster images). \
 \
Using its modules of animation and reproduction, 2D projects can be exported \
to several formats such as OGG, MPEG, AVI, MOV and SWF. Additionally, the \
option of exporting image arrays as output is available."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "0.2.23"

RPM_NAME = "tupitube-0.2.23-1.5.aarch64.rpm"
RPM_HASH = "538a7fa0b271d4275c0758157a6571214d8c4f26876b54587871271ec90586dae7ca9f903a16b7d9cd2bd21087e0991d0dafd51668200de29031060adef5bd38"

RPROVIDES:${PN} += "ktoon \
libjson-c.so.1 \
liblibmypaint.so.1 \
libqtmypaint.so.1 \
librasterbrushes.so.1 \
librastercolor.so.1 \
librastermain.so.1 \
librastersize.so.1 \
libtupi.so.1 \
libtupibase.so.1 \
libtupibrush.so.1 \
libtupicolor.so.1 \
libtupicolorpalette.so.1 \
libtupiexport.so.1 \
libtupiexposure.so.1 \
libtupifwcore.so.1 \
libtupifwgui.so.1 \
libtupigui.so.1 \
libtupilibrary.so.1 \
libtupimicmanager.so.1 \
libtupimport.so.1 \
libtupinews.so.1 \
libtupipapagayo.so.1 \
libtupiplayer.so.1 \
libtupiplugincommon.so.1 \
libtupistore.so.1 \
libtupitimeline.so.1 \
libtupiworkspace.so.1 \
tupi \
tupitube"

RDEPENDS:${PN} += "/usr/bin/bash \
ffmpeg \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5MultimediaWidgets.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libogg0 \
libpng16.so.16 \
libquazip1-qt5.so.1.7 \
libsndfile.so.1 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libtheora1 \
tupitube-plugins"

inherit rpm
