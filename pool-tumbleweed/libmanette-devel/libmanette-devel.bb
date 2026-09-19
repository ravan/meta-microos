SUMMARY = "Development files for the libmanette library"
DESCRIPTION = "libmanette allows easy access to game controllers."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.13"

RPM_NAME = "libmanette-devel-0.2.13-2.3.aarch64.rpm"
RPM_HASH = "d141df449d65edb23c2137a594f401b8ec71220744ce9804b30cbab70582d7b0b6fab03b826f3e0995cb9a26cd826d4c17a4ce493aa053033d8cc291769c8ae1"

RPROVIDES:${PN} += "libmanette-devel \
pkgconfig-manette-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmanette-0-2-0 \
libmanette-0.2.so.0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gudev-1.0 \
pkgconfig-hidapi-hidraw \
pkgconfig-libevdev"

inherit rpm
