SUMMARY = "Development files for xclass"
DESCRIPTION = "This package contains development files for xclass library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.2"

RPM_NAME = "xclass-devel-0.9.2-189.10.aarch64.rpm"
RPM_HASH = "9fead22c980c447b5e3e8b0747dc24d18f7b673d303a78a0ba5a619ccb14c058a03754d7398e299635e125fac17560f3f17598a11f8a297515c7d0227eec0f91"

RPROVIDES:${PN} += "xclass-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libstdc++-devel \
libxclass-0-9-2 \
pkgconfig \
pkgconfig-gl \
pkgconfig-x11 \
pkgconfig-xpm"

inherit rpm
