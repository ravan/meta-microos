SUMMARY = "Development Files for garcon"
DESCRIPTION = "This package contains the files needed for developing applications based on \
garcon."
LICENSE = "GFDL-1.1-only & LGPL-2.0-only"

PV = "4.20.0"

RPM_NAME = "libgarcon-devel-4.20.0-1.8.aarch64.rpm"
RPM_HASH = "06da85167c03fffad1a173d1a224bd9caa7b003962ab60e54882d5875ef5e2edbff152bd29a9e54a5af0053957476e1bd0dd962ab7ae7e967d9fc2fd7d532ec0"

RPROVIDES:${PN} += "libgarcon-devel \
pkgconfig-garcon-1 \
pkgconfig-garcon-gtk3-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgarcon-1-0 \
pkgconfig-garcon-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libxfce4ui-2"

inherit rpm
