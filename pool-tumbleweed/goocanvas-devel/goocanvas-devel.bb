SUMMARY = "Development files for GooCanvas"
DESCRIPTION = "GooCanvas is a canvas widget for GTK+ that uses the Cairo 2D library \
for drawing. \
 \
This subpackage contains the header files for developing \
applications that want to make use of libgoocanvas."
LICENSE = "LGPL-2.0-only"

PV = "3.0.0"

RPM_NAME = "goocanvas-devel-3.0.0-5.6.aarch64.rpm"
RPM_HASH = "627279a176ea96e2ff2b476c16256665a8273ec4c14bcba80eb201740cc9a07d9b2f2ff9d9a6541b1e9bb1b1a977c7fa7d04cdc1552e9f4faff44f2708cc2329"

RPROVIDES:${PN} += "goocanvas-devel \
pkgconfig-goocanvas-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgoocanvas-3-0-9 \
pkgconfig-cairo \
pkgconfig-gtk+-3.0 \
typelib-1-0-GooCanvas-3-0"

inherit rpm
