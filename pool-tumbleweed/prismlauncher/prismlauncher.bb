SUMMARY = "A custom launcher for Minecraft"
DESCRIPTION = "A custom launcher for Minecraft that allows you to easily manage multiple installations of Minecraft at once."
LICENSE = "GPL-3.0-only & Apache-2.0 & LGPL-3.0-only & OFL-1.1 & LGPL-2.1-only & MIT & BSD-3-Clause"

PV = "11.1.0"

RPM_NAME = "prismlauncher-11.1.0-1.1.aarch64.rpm"
RPM_HASH = "e94d8f72f1e87f0fc34e5ddfb61cc4a8aa5384728ae8be02ebb8000d557bec447a8fd3fa8101d72f486e6bc315bfc477b374142a4e04a2dced407935bb8d5a2d"

RPROVIDES:${PN} += "prismlauncher"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6NetworkAuth.so.6 \
libQt6OpenGL.so.6 \
libQt6Svg6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libarchive.so.13 \
libc.so.6 \
libcmark.so.0.31.1 \
libgcc-s.so.1 \
libm.so.6 \
libqrencode.so.4 \
libstdc++.so.6 \
libtomlplusplus.so.3 \
libz.so.1 \
pciutils \
qt6-imageformats"

inherit rpm
