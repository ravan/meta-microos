SUMMARY = "Documentation for qt6-quick3dphysics in QCH format"
DESCRIPTION = "This package contains documentation for qt6-quick3dphysics in QCH format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-quick3dphysics-docs-qch-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "ee95d247836f93bfc48514868957b0e8610a7335dde24f2177b1c40a20e7947b73e15a83d78823e8b49fa10a2ee0bdacdac99c9ee977e0dbb85c52fd44e5510a"

RPROVIDES:${PN} += "qt6-quick3dphysics-docs-qch"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
