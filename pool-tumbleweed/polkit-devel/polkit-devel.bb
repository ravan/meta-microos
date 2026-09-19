SUMMARY = "Development files for PolicyKit"
DESCRIPTION = "Development files for PolicyKit Authorization Framework."
LICENSE = "LGPL-2.1-or-later"

PV = "127"

RPM_NAME = "polkit-devel-127-7.2.aarch64.rpm"
RPM_HASH = "f5c7e66a49a89581fd5a27396ca09a1cb6688142899fa3145b040bb932c31d140972ed5a0fadb6bbf1d9c7df53f334cd875e42eb68a482be7fbe4ab771ddacb9"

RPROVIDES:${PN} += "pkgconfig-polkit-agent-1 \
pkgconfig-polkit-gobject-1 \
polkit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6 \
libglib-2.0.so.0 \
libpolkit-agent-1-0 \
libpolkit-gobject-1-0 \
pkgconfig \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-polkit-gobject-1 \
polkit \
typelib-1-0-Polkit-1-0"

inherit rpm
