SUMMARY = "Interactive whiteboard for schools and universities"
DESCRIPTION = "OpenBoard is an open source cross-platform interactive white board \
application designed primarily for use in schools. It was \
originally forked from Open-Sankoré, which was itself based on \
Uniboard."
LICENSE = "GPL-3.0-or-later"

PV = "1.7.7"

RPM_NAME = "OpenBoard-1.7.7-2.4.aarch64.rpm"
RPM_HASH = "c934007da723cbe053f17949141d820a5d839ef81dc444e2e1b2ef1102fcea44388da5b7475f058ac8649b769415907773a796d3e64cdadb347f0691170d8875"

RPROVIDES:${PN} += "OpenBoard \
config-OpenBoard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6MultimediaWidgets.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libX11.so.6 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler.so.162 \
libquazip1-qt6.so.1.7 \
libstdc++.so.6 \
libswresample.so.6 \
libswscale.so.9 \
libz.so.1"

inherit rpm
