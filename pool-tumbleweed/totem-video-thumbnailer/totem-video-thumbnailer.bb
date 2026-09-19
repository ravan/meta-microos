SUMMARY = "Totem video thumbnailer"
DESCRIPTION = "Totem is a movie player for the GNOME desktop based on GStreamer. \
 \
This package contains the video thumbnailer."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.2+git402.b8d8108e0"

RPM_NAME = "totem-video-thumbnailer-43.2+git402.b8d8108e0-2.3.aarch64.rpm"
RPM_HASH = "b46e6dd6b050abacda2b767e3318f9d121a6962b99529e99145c4c7c8069aab1d41e57a904f2414091bbbc60920f7eac88218d9741230e52fb1610cf007bb187"

RPROVIDES:${PN} += "totem-/usr/bin/totem-video-thumbnailer \
totem-video-thumbnailer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libtotem-plparser.so.18"

inherit rpm
