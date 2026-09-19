SUMMARY = "Development files for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.2"

RPM_NAME = "libgcr3-devel-3.41.2-5.4.aarch64.rpm"
RPM_HASH = "6b61b144438390c17fc0bb0f4b97b258e3adece3e2e79820e752f6e9ff5e0aeb943c3159d3652321d8db969f1182d82670971255635392bdf1979d23517f4458"

RPROVIDES:${PN} += "libgcr3-devel \
pkgconfig-gcr-3 \
pkgconfig-gcr-base-3 \
pkgconfig-gcr-ui-3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcr-3-1 \
pkgconfig-gck-1 \
pkgconfig-gcr-base-3 \
pkgconfig-gcr-ui-3 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-p11-kit-1 \
typelib-1-0-Gcr-3 \
typelib-1-0-GcrUi-3"

inherit rpm
