SUMMARY = "A minimalistic media player"
DESCRIPTION = "A modern video player that combines DVD playback, streaming media and file \
playback in a single unified user interface."
LICENSE = "GPL-3.0-or-later"

PV = "8.0.2"

RPM_NAME = "pantheon-videos-8.0.2-1.4.aarch64.rpm"
RPM_HASH = "14f170b22f5806c01f9a41daba87960e7d62b58f966ab46846f742137e9bfc3f64062d63b0ccb4bf47306d8c805aaa4bb68ce92dabd72833a928b5d23d48a17f"

RPROVIDES:${PN} += "elementary-videos \
pantheon-videos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite-7.so.7 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgtk-4.so.1"

inherit rpm
