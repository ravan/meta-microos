SUMMARY = "Development files for liballegro_image"
DESCRIPTION = "Development files needed to build applications which use liballegro_image."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_image5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "95221ba947f9946dc4514ac03ea24ff0852cf11412888e2d5a63054b0e7ce3438dc01534062b11aa8589f6ec3fcbffb2caebaeadeb3a415d7090b131adfc4b87"

RPROVIDES:${PN} += "liballegro-image5-2-devel \
pkgconfig-allegro-image-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-image5-2 \
pkgconfig-allegro-5"

inherit rpm
