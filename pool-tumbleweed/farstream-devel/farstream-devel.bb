SUMMARY = "GStreamer modules and libraries for videoconferencing -- Development files"
DESCRIPTION = "Farstream is a collection of GStreamer modules and libraries for \
videoconferencing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.2.9+5"

RPM_NAME = "farstream-devel-0.2.9+5-3.3.aarch64.rpm"
RPM_HASH = "46e5358218e8211e58db81dd1612f4a4d79bf9a95d8aed492eadcdfb80102a3e675a9c43845c9188761eaa84d65762ed6bfaf42ce39d5be2ed17b13ee357e686"

RPROVIDES:${PN} += "farstream-devel \
pkgconfig-farstream-0.2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfarstream-0-2-5 \
pkgconfig-gstreamer-1.0 \
pkgconfig-gstreamer-base-1.0 \
typelib-1-0-Farstream-0-2"

inherit rpm
