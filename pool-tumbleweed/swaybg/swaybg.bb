SUMMARY = "Wallpaper tool for Wayland compositors"
DESCRIPTION = "swaybg is a wallpaper utility for Wayland compositors. It is compatible with any Wayland compositor which implements the following Wayland protocols: \
wlr-layer-shell, xdg-output, xdg-shell."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "swaybg-1.2.2-1.4.aarch64.rpm"
RPM_HASH = "86c646cde1593b5c1bfac72eb7013b421eb302d833e6b7caa9f1d3c1a1a36b611dbb3af27ab8a6a67e2f429a194767b8a4116c5eb05d8c657f6db89c4b4f2498"

RPROVIDES:${PN} += "swaybg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgobject-2.0.so.0 \
libwayland-client.so.0"

inherit rpm
