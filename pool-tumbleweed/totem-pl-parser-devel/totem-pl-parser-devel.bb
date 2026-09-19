SUMMARY = "Development files for the Totem playlist parser library"
DESCRIPTION = "totem-pl-parser is a GObject-based library to parse a host of \
playlist formats, to save them too."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "3.26.7"

RPM_NAME = "totem-pl-parser-devel-3.26.7-1.4.aarch64.rpm"
RPM_HASH = "3b5ae676ace0568f2baac6db9ee7e95942e5d3c868c41818f2bedf88669694d80dc9481b22e2f2d763106c643fa1ab809d65d2e4661400661db1de5da1bc0139"

RPROVIDES:${PN} += "pkgconfig-totem-plparser \
pkgconfig-totem-plparser-mini \
totem-pl-parser-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtotem-plparser-mini18 \
libtotem-plparser18 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libarchive \
pkgconfig-libxml-2.0 \
typelib-1-0-TotemPlParser-1-0"

inherit rpm
