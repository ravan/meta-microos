SUMMARY = "Devel"
DESCRIPTION = "A Gtk client and libraries for SPICE remote desktop servers, (Linux and Windows)"
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "0.43"

RPM_NAME = "spice-gtk-devel-0.43-1.1.aarch64.rpm"
RPM_HASH = "f3f7703faeb47c210ff1dd80187ea46c732e55036a1d9d861a48d22945f47d15991ac62f01f6d3c6a0d3c13d038b5f93c1c1f024452cfad9f961d0e97cbbdbac"

RPROVIDES:${PN} += "pkgconfig-spice-client-glib-2.0 \
pkgconfig-spice-client-gtk-3.0 \
spice-gtk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspice-client-glib-2-0-8 \
libspice-client-gtk-3-0-5 \
pkgconfig-epoxy \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-app-1.0 \
pkgconfig-gstreamer-audio-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-video-1.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-json-glib-1.0 \
pkgconfig-libcacard \
pkgconfig-libjpeg \
pkgconfig-liblz4 \
pkgconfig-libphodav-3.0 \
pkgconfig-libsasl2 \
pkgconfig-libsoup-3.0 \
pkgconfig-libudev \
pkgconfig-libusb-1.0 \
pkgconfig-libusbredirhost \
pkgconfig-libusbredirparser-0.5 \
pkgconfig-openssl \
pkgconfig-opus \
pkgconfig-pixman-1 \
pkgconfig-spice-client-glib-2.0 \
pkgconfig-spice-protocol \
pkgconfig-wayland-client \
pkgconfig-wayland-cursor \
pkgconfig-wayland-server \
pkgconfig-x11 \
pkgconfig-zlib \
typelib-1-0-SpiceClientGlib-2-0 \
typelib-1-0-SpiceClientGtk-3-0"

inherit rpm
