SUMMARY = "A video wallpaper program for wlroots based wayland compositors"
DESCRIPTION = "A video wallpaper program for wlroots based wayland compositors."
LICENSE = "GPL-3.0-or-later"

PV = "1.9"

RPM_NAME = "mpvpaper-1.9-1.1.aarch64.rpm"
RPM_HASH = "ab66c0fa6eb533bd4425ef3e289afdf0c86e86ccfce77d29a03ccf8e9000082b33daf16d01733dd29d35947d10bab0573b975f96dd14cf5aa872059a831faf1f"

RPROVIDES:${PN} += "mpvpaper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libEGL.so.1 \
libc.so.6 \
libmpv.so.2 \
libwayland-client.so.0 \
libwayland-egl.so.1 \
mpv"

inherit rpm
