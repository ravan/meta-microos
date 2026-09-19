SUMMARY = "Qt 6 Multimedia library"
DESCRIPTION = "The Qt 6 Multimedia library."
LICENSE = "GPL-3.0-only"

PV = "6.11.2"

RPM_NAME = "libQt6Multimedia6-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "3f926ce21e0bd371ae735b7b30a8e213ee318e6cdd66c4870df2a394cb5514a91dfeb7ba990d62fa0f1a1e030e71917813756e15b803727ea7b0b3a54a563641"

RPROVIDES:${PN} += "libQt6Multimedia.so.6 \
libQt6Multimedia6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libm.so.6 \
libpulse.so.0 \
libstdc++.so.6 \
qt6-multimedia"

inherit rpm
