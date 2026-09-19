SUMMARY = "Development files for libwlembed and libwlembed-gtk3"
DESCRIPTION = "This package contains development files for libwlembed and libwlembed-gtk3."
LICENSE = "GPL-3.0-only"

PV = "0.0.0"

RPM_NAME = "libwlembed-devel-0.0.0-1.7.aarch64.rpm"
RPM_HASH = "1cf08d35ff0e8c6df1f919c93f223f9238d8f8fa06d1e235d540db45b20d898a0b3ee19f69f65eabb1105d94727a5e38aeb4728e054c51b225551a6e8d8afd1d"

RPROVIDES:${PN} += "libwlembed-devel \
pkgconfig-libwlembed-0 \
pkgconfig-libwlembed-gtk3-0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwlembed-0-0 \
libwlembed-gtk3-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtk-layer-shell-0 \
pkgconfig-libwlembed-0 \
pkgconfig-wayland-client \
pkgconfig-wayland-server \
pkgconfig-xkbcommon"

inherit rpm
