SUMMARY = "Libraries and header files for libctl library"
DESCRIPTION = "libctl is a free Guile-based library implementing flexible control files \
for scientific simulations. It was written to support MIT Photonic Bands \
and Meep software, but has proven useful in other programs too. \
 \
This package contains libraries and header files for developing \
applications that use libctl."
LICENSE = "GPL-2.0-or-later"

PV = "4.5.1"

RPM_NAME = "libctl-devel-4.5.1-1.18.aarch64.rpm"
RPM_HASH = "8d0bab21796793f18f26d32fef4821da1254ab856b92fc6493cdb93b42b7d2d969721e3e5def23d6f1071632e7eb8ffa2deb8783839ea46b5f86695770a216ce"

RPROVIDES:${PN} += "libctl-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libctl7"

inherit rpm
