SUMMARY = "Multi-machine network music performance over the Internet"
DESCRIPTION = "JackTrip is a system used for multi-machine network performance over the \
Internet. It supports any number of channels (as many as the \
computer/network can handle) of bidirectional, high quality, uncompressed \
audio signal streaming."
LICENSE = "GPL-3.0-only & MIT & LGPL-3.0-only"

PV = "3.0.1"

RPM_NAME = "jacktrip-3.0.1-1.1.aarch64.rpm"
RPM_HASH = "d6937b028bf1832d97b279f23910ff02f3f02e2a1dadc8ac084ec97a62c43b9f6d135e1632e1c04d30e322b0ece263bbec360cb796741a8176364de8f0f2d312"

RPROVIDES:${PN} += "jacktrip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6QuickControls2.so.6 \
libQt6Svg.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineQuick.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
librtaudio.so.7 \
libsamplerate.so.0 \
libstdc++.so.6"

inherit rpm
