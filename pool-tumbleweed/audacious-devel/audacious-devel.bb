SUMMARY = "Development files for Audacious"
DESCRIPTION = "Development files for Audacious audio player."
LICENSE = "BSD-2-Clause"

PV = "4.6.1"

RPM_NAME = "audacious-devel-4.6.1-1.3.aarch64.rpm"
RPM_HASH = "f1d71eca2050c56f375bf758a20a27bb7e2965685c4e9719a41cea48c9432ec447e92c4a7f662035100d21121b0fd7710c4851b32e71f11795b43168473baa27"

RPROVIDES:${PN} += "audacious-devel \
pkgconfig-audacious"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libaudcore6 \
libaudgui7 \
libaudqt4 \
libaudtag4"

inherit rpm
