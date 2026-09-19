SUMMARY = "A GNOME media player built using GJS with GTK4"
DESCRIPTION = "A modern media player powered by GStreamer and built for the GNOME desktop environment."
LICENSE = "GPL-3.0-or-later"

PV = "0.10.0"

RPM_NAME = "clapper-0.10.0-1.4.aarch64.rpm"
RPM_HASH = "14b7d72e9c58e0a49c9d29ff85e5125a5f35df7f3cf635dbd1f8221846e77895d5e81b5e829bd713417d92bac018cdd5eb4b02c392bd56d56d576596b20a4952"

RPROVIDES:${PN} += "clapper"

RDEPENDS:${PN} += "gstreamer \
gstreamer-plugins-bad \
gstreamer-plugins-base \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libcgraph.so.8 \
libclapper-0-0-0 \
libclapper-0.0.so.0 \
libclapper-gtk-0-0-0 \
libclapper-gtk-0.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libgvc.so.7 \
libpango-1.0.so.0"

inherit rpm
