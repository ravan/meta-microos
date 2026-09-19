SUMMARY = "Development package for SpeeX"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
SpeeX library."
LICENSE = "BSD-3-Clause & GFDL-1.1-or-later"

PV = "1.2.1"

RPM_NAME = "speexdsp-devel-1.2.1-2.12.aarch64.rpm"
RPM_HASH = "8554bc753933b90c5bada3df15b2a965f5a1ca9df2e5a0f2f6384cf29dd1c10b9294ac050e57b0c7e27d121b5ca69dff7e74995d160325646236fd0883123e64"

RPROVIDES:${PN} += "pkgconfig-speexdsp \
speexdsp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libspeexdsp1"

inherit rpm
