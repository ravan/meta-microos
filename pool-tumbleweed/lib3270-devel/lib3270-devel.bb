SUMMARY = "TN3270 Access library development files"
DESCRIPTION = "Header files for the TN3270 access library."
LICENSE = "LGPL-3.0-only"

PV = "5.5.0+git20250123"

RPM_NAME = "lib3270-devel-5.5.0+git20250123-1.9.aarch64.rpm"
RPM_HASH = "938606d5d18f790d6ad118abe643f7d5b0039658d252e868ca814e0e3a883142f32bd6c6a6e8ca33187f39b7b2fe1a64f036bb599f49fd7f98b739a1d188aebd"

RPROVIDES:${PN} += "lib3270-devel \
pkgconfig-lib3270 \
pkgconfig-lib3270-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
lib3270-5-5 \
pkgconfig-libcrypto \
pkgconfig-libcurl \
pkgconfig-libssl"

inherit rpm
