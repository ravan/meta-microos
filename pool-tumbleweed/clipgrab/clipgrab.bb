SUMMARY = "Video downloader"
DESCRIPTION = "A program which downloads and converts online videos from YouTube, Vimeo, \
DailyMotion, MyVideo and many other platforms."
LICENSE = "GPL-3.0-or-later"

PV = "3.9.14"

RPM_NAME = "clipgrab-3.9.14-2.1.aarch64.rpm"
RPM_HASH = "72b78af5acd27ea1918e9f1c8d0a4bcadd4d192cfda87160df732b39ccbf1adc2a1bfc32bfb059755a28052b6dfcefe834616c957c4f5eb16b2c9b7abd62dc9d"

RPROVIDES:${PN} += "clipgrab"

RDEPENDS:${PN} += "ffmpeg \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
