SUMMARY = "Guile bindings to zlib"
DESCRIPTION = "This package provides Guile bindings to zlib, a data lossless date-coompression \
library."
LICENSE = "GPL-3.0-or-later"

PV = "0.1.0"

RPM_NAME = "guile-zlib-0.1.0-1.20.aarch64.rpm"
RPM_HASH = "fbeb25902aa31a32a53694dd93effe72b821fb22c5a56f3d33a5f9a5c19d6908d7f6d0b7d69fc6e61542660f4e54604c925bab2e2f54da5dbd60c917accfd7e7"

RPROVIDES:${PN} += "guile-zlib"

RDEPENDS:${PN} += "guile \
zlib-devel"

inherit rpm
