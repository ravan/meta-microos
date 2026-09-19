SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "1.28.7"

RPM_NAME = "gstreamer-devel-1.28.7-1.1.aarch64.rpm"
RPM_HASH = "e48a5ea61736b99c37db5c9b7e275739ffdad8b4c34f41b0f116f085bcba08163c86dbac34a4100ba18f1dd0ff3c8ce37d4729fcf887a62a3538a7846b2e9af8"

RPROVIDES:${PN} += "gstreamer-devel \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-gstreamer-check-1.0 \
pkgconfig-gstreamer-controller-1.0 \
pkgconfig-gstreamer-net-1.0"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/pkg-config \
/usr/bin/python3.13 \
gstreamer \
gstreamer-utils \
libgstreamer-1-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
pkgconfig-libdw \
pkgconfig-libunwind \
typelib-1-0-Gst-1-0"

inherit rpm
