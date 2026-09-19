SUMMARY = "Development headers for libchdr"
DESCRIPTION = "Development headers for libchdr"
LICENSE = "BSD-3-Clause"

PV = "0.3.0"

RPM_NAME = "libchdr-devel-0.3.0-1.2.aarch64.rpm"
RPM_HASH = "3b7c475a82b7f8e6e77640f1ed0f47679f633183c44468cf1255f4edcfb2a8667bdbfb27fa882314fcd8ae6af025fe0597def97b65b2f743eda2709707ebb383"

RPROVIDES:${PN} += "libchdr-devel \
pkgconfig-libchdr"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libchdr0"

inherit rpm
