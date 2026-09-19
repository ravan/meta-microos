SUMMARY = "Development files for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "4.4.0.1"

RPM_NAME = "libgcr-devel-4.4.0.1-3.3.aarch64.rpm"
RPM_HASH = "8c5a971bcbb591213a1d79ef262687ca391f134c21788355e408460ae2774aee623348d187f4cbf49f44fd38069fdc766842e5828324a53471cf8be11932a1f6"

RPROVIDES:${PN} += "libgcr-devel \
pkgconfig-gcr-4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcr-4-4 \
pkgconfig-gck-2 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-p11-kit-1 \
typelib-1-0-Gcr-4"

inherit rpm
