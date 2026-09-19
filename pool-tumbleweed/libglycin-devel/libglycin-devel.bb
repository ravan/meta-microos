SUMMARY = "Development Files for libglycin"
DESCRIPTION = "Sandboxed and extendable image decoding. \
 \
This package provides developments files for libglycin"
LICENSE = "LGPL-2.1-or-later | MPL-2.0"

PV = "2.1.5"

RPM_NAME = "libglycin-devel-2.1.5-1.3.aarch64.rpm"
RPM_HASH = "2858be2e6d38e0cd6313263a4887b6fa5606e2241e144d138d3a5020860fe6b19808a5e603ec80f1f22859e2e9986d84b1b1b8ccea8b32b7b72a38338d0807cd"

RPROVIDES:${PN} += "glycin-loaders-devel \
libglycin-devel \
pkgconfig-glycin-2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglycin-2-0 \
pkgconfig-fontconfig \
pkgconfig-gio-2.0 \
pkgconfig-lcms2 \
pkgconfig-libseccomp \
typelib-1-0-Gly-2"

inherit rpm
