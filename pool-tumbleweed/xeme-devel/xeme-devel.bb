SUMMARY = "Development files for xeme"
DESCRIPTION = "Development files for xeme."
LICENSE = "LGPL-2.1-or-later"

PV = "0+64"

RPM_NAME = "xeme-devel-0+64-1.5.aarch64.rpm"
RPM_HASH = "a20c8527ea043278d15519a956bc158d79884ca434a0111a7f42d7c68ee3530ff4c9c3d97acd980aa7fd7b0f6144eff935f01d91a526a4eeaf162da6612fde3e"

RPROVIDES:${PN} += "pkgconfig-xeme \
xeme-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-birb \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
typelib-1-0-Xeme-1-0"

inherit rpm
