SUMMARY = "Package providing R-splines"
DESCRIPTION = "This package provides R-splines, one of R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-splines-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "e1c51a1013ca3bfc5917af18398d12e2da5bd2604b6e6e64a7701848206dc7f6227678e440a1458664b2dde04090ba5e7e255db0188a4e1cb3cea28d6c1fe3d3"

RPROVIDES:${PN} += "R-splines"

RDEPENDS:${PN} += "R-base \
libR.so \
libc.so.6"

inherit rpm
