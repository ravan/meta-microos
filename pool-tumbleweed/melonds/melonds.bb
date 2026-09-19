SUMMARY = "Nintendo DS emulator"
DESCRIPTION = "melonDS aims at providing fast and accurate Nintendo DS emulation."
LICENSE = "GPL-3.0-or-later"

PV = "1.1"

RPM_NAME = "melonds-1.1-1.5.aarch64.rpm"
RPM_HASH = "cdf7e4ff4d9e8c7a0c195c45e397a2047d877dabdb92bb0b0483f0cc4223da25bba4c4f207103717a6fe81d9b8e4b0ddb7d3fe46f3728fe5167884f1e3309987"

RPROVIDES:${PN} += "melonds"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libarchive.so.13 \
libc.so.6 \
libenet.so.7 \
libfaad.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libzstd.so.1"

inherit rpm
