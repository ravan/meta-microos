SUMMARY = "A video player for local files"
DESCRIPTION = "A video player for watching local video files."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.2"

RPM_NAME = "playmyvideos-1.1.2-1.8.aarch64.rpm"
RPM_HASH = "9f52442842848eceb00194dd73b0cceef233dac037809bb1e06f039b6812930654c08d3f62e5d104b15ffd186ee44d4f45fe2c9eb215cee8c68133f42f382cc7"

RPROVIDES:${PN} += "cinema \
playmyvideos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libclutter-gtk-1.0.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libsoup-2.4.so.1 \
libsqlite3.so.0"

inherit rpm
