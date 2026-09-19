SUMMARY = "Programming language for GNOME"
DESCRIPTION = "Vala is an object-oriented programming language with a self-hosting \
compiler that generates C code and uses the GObject system."
LICENSE = "LGPL-2.1-or-later"

PV = "0.56.19"

RPM_NAME = "vala-0.56.19-1.4.aarch64.rpm"
RPM_HASH = "e3fd7295bbe5fca77c815a1d3a8a749be2f90cf59f63bfc923c16b7049765959c3c9b5e74bbcb2078823547b2b4a9c470b03359ff7a937f50bccfebba1b81acd"

RPROVIDES:${PN} += "libvalaccodegen.so \
pkgconfig-vapigen \
pkgconfig-vapigen-0.56 \
vala \
vala-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libvala-0.56.so.0"

inherit rpm
