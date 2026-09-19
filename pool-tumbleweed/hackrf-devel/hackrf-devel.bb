SUMMARY = "Development files for HackRF"
DESCRIPTION = "Library headers for the hackrf driver."
LICENSE = "GPL-2.0-only"

PV = "2026.01.3"

RPM_NAME = "hackrf-devel-2026.01.3-1.4.aarch64.rpm"
RPM_HASH = "e7520f9979a2a60165a0ce03d0413e385792b7aea08580b0bdfbc331b9a15d0650b2ac5ddf0d9fc47daa19d016ec2bcd02cbdb8090bacb787112be0a5f3f38a4"

RPROVIDES:${PN} += "cmake-HackRF \
hackrf-devel \
pkgconfig-libhackrf"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libhackrf0"

inherit rpm
