SUMMARY = "Development files for GOffice"
DESCRIPTION = "GOffice is a GLib/GTK+ set of document-centric objects and utilities. \
 \
This package contains files needed to develop applications using \
goffice."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "0.10.61"

RPM_NAME = "goffice-devel-0.10.61-1.3.aarch64.rpm"
RPM_HASH = "9e6687b64304360a1cbfbc1091e4e854c4aad077af7e9a5b6a568060fdb7282f8a8c156ba4f9574899bccb4f17819e177f92c89955e5f59de3a185d4b2bc974c"

RPROVIDES:${PN} += "goffice-devel \
goffice-doc \
pkgconfig-libgoffice-0.10"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgoffice-0-10-10 \
pkgconfig-cairo \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-lasem-0.4 \
pkgconfig-libgsf-1 \
pkgconfig-librsvg-2.0 \
pkgconfig-libspectre \
pkgconfig-libxml-2.0 \
pkgconfig-libxslt \
pkgconfig-pangocairo \
typelib-1-0-GOffice-0-10"

inherit rpm
