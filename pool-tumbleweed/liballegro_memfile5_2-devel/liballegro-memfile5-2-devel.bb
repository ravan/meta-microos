SUMMARY = "Development files for liballegro_memfile"
DESCRIPTION = "Development files needed to build applications which use liballegro_memfile."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_memfile5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "da05a417d71d319458a6824e33fd2b2cc19616db268140afa4778ecf2a99ed4279401e0b04742d2b95072b300b25dbd14cf2b890a96db2bb7b0a75445f66fac2"

RPROVIDES:${PN} += "liballegro-memfile5-2-devel \
pkgconfig-allegro-memfile-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-memfile5-2 \
pkgconfig-allegro-5"

inherit rpm
