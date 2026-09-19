SUMMARY = "The best way for reading your comics"
DESCRIPTION = "A cross platform comic reader and library manager."
LICENSE = "GPL-3.0-or-later"

PV = "10.0.0"

RPM_NAME = "yacreader-10.0.0-1.5.aarch64.rpm"
RPM_HASH = "af7f443f3bc9842853021a375a70e28b788583f28b99ffb2a175fe6f1d4a330e44750f2cbbcc4c984b580745046661752de4ca103a9701e6fe5f2d8f4f616760"

RPROVIDES:${PN} += "yacreader"

RDEPENDS:${PN} += "kf6-kimageformats \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6TextToSpeech.so.6 \
libQt6Widgets.so.6 \
libarchive.so.13 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpoppler-qt6.so.3 \
libstdc++.so.6"

inherit rpm
