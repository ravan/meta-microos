SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-or-later"

PV = "0.6.0"

RPM_NAME = "tomoe-gtk-devel-0.6.0-45.6.aarch64.rpm"
RPM_HASH = "1b37f43906cb2f1be1d94df905076e2af58a2463a8ad3f330b821ed424ac0cc78ea82882ce4568eecca007304e0094518de77b404e8bc92406e1bdf942716603"

RPROVIDES:${PN} += "pkgconfig-tomoe-gtk \
tomoe-gtk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gucharmap-devel \
pkgconfig-gtk+-2.0 \
pkgconfig-tomoe \
tomoe-devel \
tomoe-gtk"

inherit rpm
