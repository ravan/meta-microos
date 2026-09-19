SUMMARY = "Development files for occt"
DESCRIPTION = "This package contains the files needed for development with OpenCASCADE."
LICENSE = "LGPL-2.1-only-with-OCCT-exception-1.0"

PV = "7.9.3"

RPM_NAME = "occt-devel-7.9.3-1.4.aarch64.rpm"
RPM_HASH = "24ce914691ad75981bc5e984ed91c90a5ae5f29630ac5bcf1625455ec9bea4b7aba2f61e2c167e2ad59f0dd9e33d2c96278a7b1907b91788854e03b3735891c5"

RPROVIDES:${PN} += "OpenCASCADE-devel \
cmake-OpenCASCADE \
occt-devel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libTKExpress.so.7.9.3 \
libTKernel.so.7.9.3 \
libc.so.6 \
libgcc-s.so.1 \
libopencascade-applicationframework7-9-3 \
libopencascade-dataexchange7-9-3 \
libopencascade-draw7-9-3 \
libopencascade-foundationclasses7-9-3 \
libopencascade-modelingalgorithms7-9-3 \
libopencascade-modelingdata7-9-3 \
libopencascade-visualization7-9-3 \
libstdc++.so.6 \
pkgconfig-freetype2 \
pkgconfig-gl \
pkgconfig-xext \
pkgconfig-xmu \
tcl-devel \
tk-devel"

inherit rpm
