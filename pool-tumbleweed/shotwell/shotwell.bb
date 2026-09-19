SUMMARY = "Photo Manager for GNOME"
DESCRIPTION = "Shotwell is a digital photo organizer designed for the GNOME desktop \
environment. It allows you to import photos from disk or camera, \
organize them in various ways, view them in full-window or fullscreen \
mode, and export them to share with others."
LICENSE = "LGPL-2.1-or-later"

PV = "33.0"

RPM_NAME = "shotwell-33.0-1.1.aarch64.rpm"
RPM_HASH = "cc769370fec8ec723e38cc3538b395ff6dce2935b3df22109716e58a5139a3d3ef36dce735e0728515d95119b6a54a6a70fbef1f9fbd5cdec7ec12563e753bb2"

RPROVIDES:${PN} += "libshotwell-authenticator.so.0 \
libshotwell-plugin-common.so.0 \
libshotwell-plugin-dev-1.0.so.0 \
libshotwell-publishing.so \
libshotwell-transitions.so \
shotwell"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libexif.so.12 \
libgcr-4.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgee-0.8.so.2 \
libgexiv2-0.16.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgphoto2-port.so.12 \
libgphoto2.so.6 \
libgraphene-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libportal-gtk4.so.1 \
libportal.so.1 \
libraw.so.25 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libwebp.so.7 \
libwebpdemux.so.2 \
libxml2.so.16"

inherit rpm
