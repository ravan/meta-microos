SUMMARY = "Development files for the X Damage Extension library"
DESCRIPTION = "The X Damage Extension allows applications to track modified regions \
of drawables. \
 \
This package contains the development headers for the library found \
in libXdamage1."
LICENSE = "MIT"

PV = "1.1.7"

RPM_NAME = "libXdamage-devel-1.1.7-1.4.aarch64.rpm"
RPM_HASH = "de719c293ecd3e046c30dcf0d7476f9324e11892ac8cd4df9b09604010d7eecd05fed839fca29a1af2dfd0d9d6a21dc9ebca4ed76aeca275bdfefbcca468ab46"

RPROVIDES:${PN} += "libXdamage-devel \
pkgconfig-xdamage"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXdamage1 \
pkgconfig-damageproto \
pkgconfig-fixesproto \
pkgconfig-x11 \
pkgconfig-xextproto \
pkgconfig-xfixes \
pkgconfig-xproto"

inherit rpm
