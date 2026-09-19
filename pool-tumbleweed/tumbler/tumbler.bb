SUMMARY = "Thumbnail Management for Xfce"
DESCRIPTION = "Tumbler is a D-Bus service for applications to request thumbnails for various \
URI schemes and MIME types. It is an implementation of the thumbnail management \
D-Bus specification described on http://live.gnome.org/ThumbnailerSpec and \
extensible through a plugin interface or via specialized thumbnailer services \
implemented in accordance to the thumbnail management D-Bus specification."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.20.2"

RPM_NAME = "tumbler-4.20.2-1.1.aarch64.rpm"
RPM_HASH = "6f7af14e8bd1616240412fe385110b7810548eef2eabd186af12aa862ac30b84e1023e4f0e2fc50604cdf10404590806d53be0f68d9841e3df97ebfda353d04c"

RPROVIDES:${PN} += "config-tumbler \
tumbler"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libfreetype.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgepub-0.7.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgsf-1.so.114 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libjpeg.so.8 \
libopenrawgnome.so.9 \
libpng16.so.16 \
libpoppler-glib.so.8 \
libtumbler-1-0 \
libtumbler-1.so.0 \
libxfce4util.so.7"

inherit rpm
