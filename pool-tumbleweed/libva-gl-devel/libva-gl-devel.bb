SUMMARY = "Development files for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
 \
This package provides the development environment for libva gl packages."
LICENSE = "MIT"

PV = "2.24.1"

RPM_NAME = "libva-gl-devel-2.24.1-1.1.aarch64.rpm"
RPM_HASH = "cec3e7981a4416dd6337add490b87908418ccf2e5ad943877f4da4147df7a684d6cd74c2b7aa5faad4417036dc523bcde9b3356d6ae28697bf79dfa3b389c858"

RPROVIDES:${PN} += "libva-gl-devel \
pkgconfig-libva-glx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libva-glx2 \
pkgconfig-gl \
pkgconfig-libva"

inherit rpm
