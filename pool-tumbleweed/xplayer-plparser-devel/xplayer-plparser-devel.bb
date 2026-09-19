SUMMARY = "Simple GObject-based library to parse playlist formats"
DESCRIPTION = "xplayer-plparser is a simple GObject-based library to parse a host \
of playlist formats, to save them too."
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "xplayer-plparser-devel-1.0.3-1.13.aarch64.rpm"
RPM_HASH = "437387ead62b32e72b99fdb7470516dac1d93dc51633578432d8a76cfbcbf9af529cadcdf369c1b7df5ce048d1358e1b60be6aeb3c48aaed1ace2a62d9d64efa"

RPROVIDES:${PN} += "pkgconfig-xplayer-plparser \
pkgconfig-xplayer-plparser-mini \
xplayer-plparser-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxplayer-plparser-mini18 \
libxplayer-plparser18 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmime-3.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-libarchive \
pkgconfig-libxml-2.0 \
typelib-1-0-XplayerPlParser-1-0"

inherit rpm
