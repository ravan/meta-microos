SUMMARY = "Tupi plugins"
DESCRIPTION = "A design and authoring tool for 2D animation. \
 \
This package contains plugins for tupitube."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "0.2.23"

RPM_NAME = "tupitube-plugins-0.2.23-1.5.aarch64.rpm"
RPM_HASH = "9da5d03fbe59b15238a2fa3c5a47b5d93025bbdf040fec5a798baa3d6d3d1006a2f5a003440ea5658a3e266edfecfbd9a7a52b473c5012e75f62e9ec2f426357"

RPROVIDES:${PN} += "libtupibuckettool.so \
libtupicoloringtool.so \
libtupieyedropper.so \
libtupiffmpegplugin.so \
libtupigeometrictool.so \
libtupiimageplugin.so \
libtupiinktool.so \
libtupimotiontool.so \
libtupinodestool.so \
libtupiopacitytool.so \
libtupipapagayotool.so \
libtupipenciltool.so \
libtupipolylinetool.so \
libtupirotationtool.so \
libtupiscaletool.so \
libtupiselectiontool.so \
libtupisheartool.so \
libtupitexttool.so \
tupitube-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libswresample.so.6 \
libtupi.so.1 \
libtupibase.so.1 \
libtupifwcore.so.1 \
libtupifwgui.so.1 \
libtupiplugincommon.so.1 \
libtupistore.so.1 \
tupitube"

inherit rpm
