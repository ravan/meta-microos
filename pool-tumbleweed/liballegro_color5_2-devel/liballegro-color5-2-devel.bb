SUMMARY = "Development files for liballegro_color"
DESCRIPTION = "Development files needed to build applications which use liballegro_color."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_color5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "cbf9f5b4703d14ee34b8d3246e9a7647521fae713ac9e260971fa4a66a6f3dd749841b34d04daa1211939465e9d8d3a7b65eb358c034fe080dc96d48fe1190c9"

RPROVIDES:${PN} += "liballegro-color5-2-devel \
pkgconfig-allegro-color-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-color5-2 \
pkgconfig-allegro-5"

inherit rpm
