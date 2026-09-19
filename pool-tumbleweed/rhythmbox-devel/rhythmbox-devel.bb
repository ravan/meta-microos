SUMMARY = "GNOME Music Management Application -- Development Files"
DESCRIPTION = "Music Management application with support for ripping audio-CD's, \
playback of Ogg Vorbis and MP3 and burning of CD-ROMs. \
 \
This package contains the development requirements to extend rhythmbox."
LICENSE = "GPL-2.0-or-later"

PV = "3.5.1"

RPM_NAME = "rhythmbox-devel-3.5.1-1.1.aarch64.rpm"
RPM_HASH = "4c139b957e0264bde65d8927342bde776b4467e94a7dfb5186fcc2775ba3f1cf225b975dd3ef884a090792eb7c1595e4da954d4102813f49f7e56fe89a9d10e7"

RPROVIDES:${PN} += "pkgconfig-rhythmbox \
rhythmbox-devel \
rhythmbox-doc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
pkgconfig-totem-plparser \
rhythmbox"

inherit rpm
