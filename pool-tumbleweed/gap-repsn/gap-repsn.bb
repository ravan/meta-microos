SUMMARY = "GAP: Finite group representation construction"
DESCRIPTION = "The package provides GAP functions for computing characteristic zero \
matrix representations of finite groups."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.3"

RPM_NAME = "gap-repsn-3.1.3-1.1.aarch64.rpm"
RPM_HASH = "64bd991a56755a767e2b4e6014ff4f88c1a659822287f7dfa7520283646776e3a6299b77e0af2ccd82a86f448a1eada4a9293fed630a513c83789e7a6227ac16"

RPROVIDES:${PN} += "gap-repsn"

RDEPENDS:${PN} += "gap-core"

inherit rpm
