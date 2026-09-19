SUMMARY = "Development files for the Telepathy Call channel handling library"
DESCRIPTION = "Telepathy Farstream is a Telepathy client library that uses Farsight2 \
to handle Call channels."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.2"

RPM_NAME = "telepathy-farstream-devel-0.6.2-4.8.aarch64.rpm"
RPM_HASH = "091f3cb793bed82614edfd1a13ef84fc0b93a1d9c029c41687b493d9870879a1ac7bf8227e3a836ea203dc430ff4d2af1adf3a58186ff00635407770129a95e7"

RPROVIDES:${PN} += "pkgconfig-telepathy-farstream \
telepathy-farstream-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtelepathy-farstream3 \
pkgconfig-dbus-glib-1 \
pkgconfig-farstream-0.2 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gstreamer-1.0 \
pkgconfig-telepathy-glib \
typelib-1-0-TelepathyFarstream-0-6"

inherit rpm
