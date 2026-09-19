SUMMARY = "Development files for libgepub"
DESCRIPTION = "A GObject-based library for handling and rendering EPUB documents."
LICENSE = "LGPL-2.1-or-later"

PV = "0.7.3"

RPM_NAME = "libgepub-devel-0.7.3-1.7.aarch64.rpm"
RPM_HASH = "46ce01b0e7b98b02c47a78855faaa80eb0b937ca6c9fa6829aecda40b5e3679f51cc064c64506ba001977b3823ce97c7f96b485dade77b5857f6644a3288fe57"

RPROVIDES:${PN} += "libgepub-devel \
pkgconfig-libgepub-0.7"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgepub-0-7-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libarchive \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
pkgconfig-webkit2gtk-4.1 \
typelib-1-0-Gepub-0-7"

inherit rpm
