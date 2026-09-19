SUMMARY = "Development files for the X11 Inter-Client Exchange Library"
DESCRIPTION = "The Inter-Client Exchange (ICE) protocol is intended to provide a \
framework for building such protocols, allowing them to make use of \
common negotiation mechanisms and to be multiplexed over a single \
transport connection. \
 \
This package contains the development headers for the library found \
in libICE6."
LICENSE = "MIT"

PV = "1.1.2"

RPM_NAME = "libICE-devel-1.1.2-1.7.aarch64.rpm"
RPM_HASH = "cd5c8200bfd259c6b0b5226fb892692619012e940bb2a701d2ed41b547a9d69126fc09f2b1e3be90de544c22c2497ca91219dd6aad662d59bcde52e4cb334698"

RPROVIDES:${PN} += "libICE-devel \
pkgconfig-ice \
xorg-x11-libICE-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libICE6 \
pkgconfig-xproto"

inherit rpm
