SUMMARY = "Wayland compositor for Minecraft speedrunning"
DESCRIPTION = "Waywall is a Wayland compositor that provides various convenient features for Minecraft speedrunning."
LICENSE = "GPL-3.0-only & Zlib"

PV = "0.2026.06.13"

RPM_NAME = "waywall-0.2026.06.13-1.2.aarch64.rpm"
RPM_HASH = "fb11f387369e61964f3babad848170584ef6b57b5baa8fa103a8612125203a21be919828ab1b0a641478fbf3bf5688b558d013b5cdaf7250a12454189a619479"

RPROVIDES:${PN} += "waywall"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libGLESv2.so.2 \
libc.so.6 \
libluajit-5.1.so.2 \
libm.so.6 \
libspng.so.0 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libwayland-server.so.0 \
libxcb-composite.so.0 \
libxcb-res.so.0 \
libxcb-xtest.so.0 \
libxcb.so.1 \
libxkbcommon.so.0 \
xwayland"

inherit rpm
