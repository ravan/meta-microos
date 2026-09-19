SUMMARY = "Development files for libsass, a library for a CSS preprocessor language"
DESCRIPTION = "This package provides development header files for libsass."
LICENSE = "MIT"

PV = "3.6.6"

RPM_NAME = "libsass-devel-3.6.6-1.9.aarch64.rpm"
RPM_HASH = "81c958c2769fc9fd4c8153e41bb05c7a15bf82b900647fcba851dfe21d9d33e9976b04535be9779d6719379f271c56bc26cf85b92034e8e839ce3419c29d385b"

RPROVIDES:${PN} += "libsass-devel \
pkgconfig-libsass"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsass-3-6-6-1"

inherit rpm
