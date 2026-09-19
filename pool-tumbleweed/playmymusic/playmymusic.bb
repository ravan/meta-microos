SUMMARY = "A music player for local files and remote streams"
DESCRIPTION = "A music player for listening local music files, online radios and Audio CDs."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.1"

RPM_NAME = "playmymusic-2.2.1-1.9.aarch64.rpm"
RPM_HASH = "19a04e3c65e641ed00ae88039b7098bc3a2bfb53d0f276739ca0bbc3aeeee0f6a97b951e0650c4a1d6078e9e01826542b0e06d4118d004ee79369d03f8c2e419"

RPROVIDES:${PN} += "melody \
playmymusic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgsttag-1.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libsoup-2.4.so.1 \
libsqlite3.so.0 \
libtag-c.so.2"

inherit rpm
