SUMMARY = "Development files for the KLatexFormula tool library"
DESCRIPTION = "A C++/Qt4 library containing general-purpose GUI tools. \
 \
These tools were originially written for use by klatexformula, but they have \
been promoted to a library for use in any application. \
 \
This package contains the needed files for development."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "klftools-devel-4.1.0-1.26.aarch64.rpm"
RPM_HASH = "d3b884ffe0fec563b43a9760a5004fedb26e1867195a55f84c93c27880e4ff78a2bd3dc79b06d2a9fc1322994aefa1e3225aa1529eeb7ad4faf7ac9d45c3aa52"

RPROVIDES:${PN} += "klatexformula-devel \
klftools-devel \
libklftools-devel"

RDEPENDS:${PN} += "libklftools"

inherit rpm
