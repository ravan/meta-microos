SUMMARY = "A custom launcher for Minecraft"
DESCRIPTION = "A custom launcher for Minecraft that allows you to easily manage multiple installations of Minecraft at once \
with unblocked the use of Offline Accounts, disabling the restriction of having a functional Online Account."
LICENSE = "GPL-3.0-only & Apache-2.0 & LGPL-3.0-only & OFL-1.1 & LGPL-2.1-only & MIT & BSD-3-Clause"

PV = "11.0.3"

RPM_NAME = "prismlauncher-cracked-11.0.3-1.1.aarch64.rpm"
RPM_HASH = "9c16f188b0ae57af89eabe5236d56ec93ddf7bc6f01305125334647662f4f940758e99bb1731abe19d896bf62b136df8ce15d279d07604cbac2da16548a45e0a"

RPROVIDES:${PN} += "prismlauncher-cracked"

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
