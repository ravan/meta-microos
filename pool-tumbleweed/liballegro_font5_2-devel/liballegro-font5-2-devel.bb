SUMMARY = "Development files for liballegro_font"
DESCRIPTION = "Development files needed to build applications which use liballegro_font."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_font5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "cb546d395d8c7ff472fdf0e6565eac67edabe52e4ef4da4033f8f3a8cbf8a66ee56e9bf21adc13e6b10b5f4fa5cd00d4f8c5c0658b98f0efa197f3050e903fb4"

RPROVIDES:${PN} += "liballegro-font5-2-devel \
pkgconfig-allegro-font-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-font5-2 \
pkgconfig-allegro-5"

inherit rpm
