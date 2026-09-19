SUMMARY = "Include Files and Libraries mandatory for Development"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "LGPL-2.1-only"

PV = "0.4.0"

RPM_NAME = "libtwolame-devel-0.4.0-1.25.aarch64.rpm"
RPM_HASH = "99f5dca44a71fcd0fa1085903e095e8534519844d2f408e101fb3f03f85e116dda342c04e66505f1416c495ceb3b041cbee5ba54a30915147c1a7cfa792683f4"

RPROVIDES:${PN} += "libtwolame-devel \
pkgconfig-twolame \
twolame-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtwolame0"

inherit rpm
