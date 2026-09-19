SUMMARY = "The continuation of Shotwell in Granite"
DESCRIPTION = "pantheon-photos is a digital photo organizer based on Shotwell and \
designed for the Pantheon Desktop. It allows you to import \
photos from disk or camera, organize them in various ways, view them \
in full-window or fullscreen mode, and export them to share with \
others."
LICENSE = "LGPL-2.1-or-later"

PV = "8.0.2"

RPM_NAME = "pantheon-photos-8.0.2-1.1.aarch64.rpm"
RPM_HASH = "25c743d764d708441cfbf024c29c7b67d51978ec93de75951a4e6ea80df6d43fc64fc13d07a7983d90c82107ba07d710fad99cdbaf0f5fccbac13963a55814f8"

RPROVIDES:${PN} += "elementary-photos \
pantheon-photos"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libexif.so.12 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgeocode-glib-2.so.0 \
libgexiv2.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libgranite.so.6 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libgudev-1.0.so.0 \
libhandy-1.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libportal-gtk3.so.1 \
libportal.so.1 \
libraw.so.25 \
libsqlite3.so.0 \
libwebp.so.7"

inherit rpm
