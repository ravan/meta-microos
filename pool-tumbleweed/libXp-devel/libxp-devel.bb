SUMMARY = "Development files for the X Printing Extension library"
DESCRIPTION = "libXp provides APIs to allow client applications to render to \
non-display devices. \
 \
This package contains the development headers for the library found \
in libXp6."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "libXp-devel-1.0.4-1.12.aarch64.rpm"
RPM_HASH = "72943c51242ef7c9ae50e955a0dab03d458a83eeebec0ec6b53342a745babbfd5fb57f170c565e96ebe307506bc8b1d59491ef1e33ffe2657bebcfe42da000a2"

RPROVIDES:${PN} += "libXp-devel \
pkgconfig-xp \
xorg-x11-libXp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXp6 \
pkgconfig-printproto \
pkgconfig-x11 \
pkgconfig-xau \
pkgconfig-xext"

inherit rpm
