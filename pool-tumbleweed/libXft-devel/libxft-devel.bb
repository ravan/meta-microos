SUMMARY = "Development files for the X FreeType library"
DESCRIPTION = "Xft is a library that connects X applications with the FreeType font \
rasterization library. Xft uses fontconfig to locate fonts so it has \
no configuration files. \
 \
This package contains the development headers for the library found \
in libXft2."
LICENSE = "MIT"

PV = "2.3.9"

RPM_NAME = "libXft-devel-2.3.9-1.5.aarch64.rpm"
RPM_HASH = "497f957553aebc8b59b4c11318d09b9b2b3387a371f5267be6d612db4e81b99d85bd6a46883af448a5777b836608f0d1cbafc784e405cbd88f14706f8d888324"

RPROVIDES:${PN} += "libXft-devel \
pkgconfig-xft"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXft2 \
pkgconfig-fontconfig \
pkgconfig-freetype2 \
pkgconfig-xproto \
pkgconfig-xrender"

inherit rpm
