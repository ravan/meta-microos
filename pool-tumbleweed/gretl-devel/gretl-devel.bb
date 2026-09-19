SUMMARY = "Development files for gretl"
DESCRIPTION = "This package contains the development files for gretl."
LICENSE = "GPL-3.0-only"

PV = "2025a"

RPM_NAME = "gretl-devel-2025a-1.7.aarch64.rpm"
RPM_HASH = "3fbb1c019cd5ef25632e15045267d3dac5a640bc7168cc667e7880eed0be5a931104ebb4e8656521a8c2947e38c970845403c3b4eb7cea8a4d90479d2b749d27"

RPROVIDES:${PN} += "gretl-devel \
pkgconfig-gretl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgretl-1-0-51 \
pkgconfig-fftw3 \
pkgconfig-glib-2.0 \
pkgconfig-libxml-2.0"

inherit rpm
