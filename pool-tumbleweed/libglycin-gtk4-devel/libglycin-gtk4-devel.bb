SUMMARY = "Development Files for libglycin-gtk4"
DESCRIPTION = "Sandboxed and extendable image decoding. \
 \
This package provides developments files for libglycin-gtk4"
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "2.1.5"

RPM_NAME = "libglycin-gtk4-devel-2.1.5-1.2.aarch64.rpm"
RPM_HASH = "cef535f03d059146dfc421b14c692dcb39192e96fbcf01aa1d25c4ea964acb9edb88900c511b370b2a24dfee5a06756397a97b3af4931def4e21573b7afed533"

RPROVIDES:${PN} += "libglycin-gtk4-devel \
pkgconfig-glycin-gtk4-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglycin-gtk4-2-0 \
pkgconfig-fontconfig \
pkgconfig-gio-2.0 \
pkgconfig-glycin-2 \
pkgconfig-gtk4 \
pkgconfig-lcms2 \
pkgconfig-libseccomp \
typelib-1-0-GlyGtk-2"

inherit rpm
