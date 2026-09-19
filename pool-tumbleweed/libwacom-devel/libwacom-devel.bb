SUMMARY = "Header files for libwacom"
DESCRIPTION = "libwacom is a library to identify graphics tablets and their model-specific \
features. \
This subpackage provides the header files for the library."
LICENSE = "HPND"

PV = "2.19.1"

RPM_NAME = "libwacom-devel-2.19.1-1.1.aarch64.rpm"
RPM_HASH = "a4a1b2494302cb62c84ccf87f32de34161565e516b3ba00bb3280320232fadd45faf7518357f89642745619fca01df24b6cbfc11d943f7f5dd9d9032dee40c11"

RPROVIDES:${PN} += "libwacom-devel \
pkgconfig-libwacom"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwacom9 \
pkgconfig-glib-2.0 \
pkgconfig-gudev-1.0 \
pkgconfig-libevdev"

inherit rpm
