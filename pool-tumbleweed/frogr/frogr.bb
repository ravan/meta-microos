SUMMARY = "Tool to Manage Flickr Accounts"
DESCRIPTION = "Frogr is a application for the GNOME desktop that allows users to \
manage their accounts in the Flickr image hosting website. It supports \
all the basic Flickr features, including uploading pictures, adding \
descriptions, setting tags and managing sets and groups pools."
LICENSE = "GPL-3.0-only"

PV = "1.8.1"

RPM_NAME = "frogr-1.8.1-1.13.aarch64.rpm"
RPM_HASH = "36fb5aafbdb5b28e8afaf765efbdb83d1e62bbbb0baf1902ea2fda2387f433ddba19976dbc9466ed7b774d03313d0a5a76cca76a1106d68aea632d5a07eccd85"

RPROVIDES:${PN} += "frogr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libexif.so.12 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libjson-glib-1.0.so.0 \
libsoup-3.0.so.0 \
libxml2.so.16"

inherit rpm
