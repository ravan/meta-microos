SUMMARY = "Graphical UI to help manage overlays"
DESCRIPTION = "GOverlay is a graphical UI to manage Vulkan/OpenGL overlays."
LICENSE = "GPL-3.0-or-later"

PV = "1.9.2"

RPM_NAME = "goverlay-1.9.2-1.1.aarch64.rpm"
RPM_HASH = "f99958116a447d86b7dc34a538e69e259f19f82ec61ec430650dd345ebefb584b8a0ccf0a1682e4d29dadddb1484a8aecb216818acda17549bbed490f676b41a"

RPROVIDES:${PN} += "goverlay \
pascube"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
/usr/bin/sh \
7zip \
ld-linux-aarch64.so.1 \
libQt6Pas.so.6 \
libSDL2-2.0.so.0 \
libX11.so.6 \
libc.so.6 \
libz.so.1 \
mangohud \
symbols-only-nerd-fonts \
wget"

inherit rpm
