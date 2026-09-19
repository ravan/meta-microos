SUMMARY = "Music player with a Waveform Progress Bar"
DESCRIPTION = "Nulloy is a opensource, simple and clean music player with a Waveform \
Progressbar. It is written in C++ using QT."
LICENSE = "GPL-3.0-only"

PV = "0.9.9"

RPM_NAME = "nulloy-0.9.9-1.3.aarch64.rpm"
RPM_HASH = "4f6a81d856bebfe54c0f7ef1a1322b71055fa01b4b78c41b01d3262d8015651b792494ede2ca107a6d165cc4719b8edf76d6c0900733f7abad8357c7aa8ca76e"

RPROVIDES:${PN} += "nulloy"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Script.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libxcb.so.1 \
libz.so.1"

inherit rpm
