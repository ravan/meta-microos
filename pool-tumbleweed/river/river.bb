SUMMARY = "A dynamic tiling Wayland compositor"
DESCRIPTION = "River is a dynamic tiling Wayland compositor with flexible runtime configuration."
LICENSE = "GPL-3.0-only"

PV = "0.3.12"

RPM_NAME = "river-0.3.12-2.6.aarch64.rpm"
RPM_HASH = "186af1f3a4d6eb5d561d30db4d7c9323e28542cb2dc22d20c529cbb3a1b0d820ace89bf0fc9c1ca20ad4761ac902e3ed8c802630e49920c3eaaad249ed546604"

RPROVIDES:${PN} += "river"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2 \
libinput.so.10 \
libpixman-1.so.0 \
libwayland-server.so.0 \
libwlroots-0.19.so \
libxkbcommon.so.0 \
river-riverctl \
river-rivertile"

inherit rpm
