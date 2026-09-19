SUMMARY = "Window manager for Wayland compatible with i3"
DESCRIPTION = "Sway is a tiling Wayland compositor and a drop-in replacement for the i3 \
window manager for X11. It works with your existing i3 configuration and \
supports most of i3's features, plus a few extras."
LICENSE = "MIT"

PV = "1.12"

RPM_NAME = "sway-1.12-12.3.aarch64.rpm"
RPM_HASH = "f633366ffe6b3a5b6f9a0d5e2126885c12a923640c9d33658405221115fe52b737d9bf50442c2f0d604ba0f74c41bd89a33c41b14c656a28b037f8b41bcc986e"

RPROVIDES:${PN} += "sway"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libevdev.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libinput.so.10 \
libjson-c.so.5 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpcre2-8.so.0 \
libpixman-1.so.0 \
libudev.so.1 \
libwayland-server.so.0 \
libwlroots-0.20.so \
libxcb-icccm.so.4 \
libxcb.so.1 \
libxkbcommon.so.0 \
sway-branding"

inherit rpm
