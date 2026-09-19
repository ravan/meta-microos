SUMMARY = "A Wayland window-stacking compositor"
DESCRIPTION = "Labwc is a wlroots-based window-stacking compositor for wayland, inspired \
by openbox."
LICENSE = "GPL-2.0-only"

PV = "0.20.2"

RPM_NAME = "labwc-0.20.2-1.1.aarch64.rpm"
RPM_HASH = "8044452c9c7e80b3727d658149e6536f235f276713e0bc7da886936fbd36eb72e4a236132faff3b6542d1da80e384cc56ff6e48348224e130c95e4c5580862e8"

RPROVIDES:${PN} += "config-labwc \
labwc"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libinput.so.10 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpixman-1.so.0 \
libpng16.so.16 \
librsvg-2.so.2 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-server.so.0 \
libwlroots-0.20.so \
libxcb-ewmh.so.2 \
libxcb.so.1 \
libxkbcommon.so.0 \
libxml2.so.16"

inherit rpm
