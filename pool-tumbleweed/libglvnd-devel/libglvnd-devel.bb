SUMMARY = "Development files for libglvnd"
DESCRIPTION = "Vendor-neutral dispatch layer for arbitrating OpenGL API calls between \
multiple vendors on a per-screen basis, as described by Andy Ritger's \
OpenGL ABI proposal. This package contains the required files for \
development."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "libglvnd-devel-1.7.0-2.3.aarch64.rpm"
RPM_HASH = "0a502705a385dca5274e10f78ff9b47abef37e6e0b5384ce96cdbb3e2f1b110bf180ebbdd85d30af794003c12bad3b15c27509be5921e3978419528daec8bc2b"

RPROVIDES:${PN} += "libglvnd-devel \
pkgconfig-glx \
pkgconfig-libglvnd \
pkgconfig-opengl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglvnd"

inherit rpm
