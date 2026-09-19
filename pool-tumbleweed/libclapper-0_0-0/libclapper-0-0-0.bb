SUMMARY = "Media player components"
DESCRIPTION = "A modern media player powered by GStreamer and built for the GNOME desktop environment."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "libclapper-0_0-0-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "f4da10033ec4e25658cb1f15c4e6c9f47b192e2c170e198d79924ff65370fdec6dd5f41120151be84202df1486f7ee73063f5b3e8042546da69493a3ddc454d5"

RPROVIDES:${PN} += "gstreamer1 \
libclapper-0-0-0 \
libclapper-0.0.so.0 \
libgstclapper.so \
libgstclapperglcontexthandler.so.0 \
libgstclapperglimporter.so \
libgstclappergluploader.so \
libgstclapperrawimporter.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstaudio-1.0.so.0 \
libgstbase-1.0.so.0 \
libgstgl-1.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgstvideo-1.0.so.0 \
libgtk-4.so.1 \
libmicrodns.so.1 \
libpeas-2.so.0 \
libsoup-3.0.so.0"

inherit rpm
