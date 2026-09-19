SUMMARY = "Development files for liballegro_audio"
DESCRIPTION = "Development files needed to build applications which use liballegro_audio."
LICENSE = "BSD-3-Clause & Zlib"

PV = "5.2.11.3"

RPM_NAME = "liballegro_audio5_2-devel-5.2.11.3-1.5.aarch64.rpm"
RPM_HASH = "9f12f0861dcbceb9a18d66e6c5c98b37c998fade8b6f3ead01ea53b0d70b16766b71b1ae0d9b4465769db71379b38262b830c5734717d72060642b4412cb3a72"

RPROVIDES:${PN} += "liballegro-audio5-2-devel \
pkgconfig-allegro-audio-5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
liballegro-audio5-2 \
pkgconfig-allegro-5"

inherit rpm
