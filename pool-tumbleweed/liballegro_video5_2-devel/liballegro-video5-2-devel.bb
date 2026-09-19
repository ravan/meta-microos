SUMMARY = "Development files for liballegro_video"
DESCRIPTION = "Development files needed to build applications which use liballegro_video."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_video5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "1a65d792fb2f0354e6d2695be61ead9a0e9c73e5d82f640fff1508f10a09e197343b0afaa265ad05ba05f9362a9ed687b8a65b841d4f7fa61a89e434513cb09e"

RPROVIDES:${PN} += "liballegro-video5-2-devel \
pkgconfig-allegro-video-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-video5-2 \
pkgconfig-allegro-audio-5"

inherit rpm
