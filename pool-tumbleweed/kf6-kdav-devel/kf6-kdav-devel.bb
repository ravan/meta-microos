SUMMARY = "Development package for kdav"
DESCRIPTION = "This package contains development files needed to use kdav in other applications."
LICENSE = "LGPL-2.0-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kdav-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "182503f5db00311de53f0aa7bfa29b906b25af8065465efddc667fe02e8d340bf5d3353330ab2d3558be3f022f7363876308d16069dd0c26d8c9ec7b72bb2afb"

RPROVIDES:${PN} += "cmake-KF6DAV \
kf6-kdav-devel"

RDEPENDS:${PN} += "libKF6DAV6"

inherit rpm
