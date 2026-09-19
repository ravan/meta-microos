SUMMARY = "Development files for liballegro_acodec"
DESCRIPTION = "Development files needed to build applications which use liballegro_acodec."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_acodec5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "6be40ceccf452d4508025b8e2a0952a8245c6b6c3c80f88276dca5d1517be5ddcaf6a374b5c70d3713f267ffc6b9434f2fa84336b01111c13a3a948b11752d32"

RPROVIDES:${PN} += "liballegro-acodec5-2-devel \
pkgconfig-allegro-acodec-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-acodec5-2 \
pkgconfig-allegro-audio-5"

inherit rpm
