SUMMARY = "Development files for liballegro_dialog"
DESCRIPTION = "Development files needed to build applications which use liballegro_dialog."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_dialog5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "58774496556f43a6513c3dfa316454bd79ad27d4f6826a602d78fe3eedbd1cba7b84bc540c29f35918945e9888c4d2fa6417d9e32240dbbb89cdc60486f5652e"

RPROVIDES:${PN} += "liballegro-dialog5-2-devel \
pkgconfig-allegro-dialog-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-dialog5-2 \
pkgconfig-allegro-5"

inherit rpm
