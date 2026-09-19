SUMMARY = "Software Management (32bit)"
DESCRIPTION = "The 32bit pattern complementing sw_management."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-sw_management-32bit-20241218-34.1.aarch64.rpm"
RPM_HASH = "192e0c63d413850fcec7897a66946dbcfc919b049c30fd88111966152a90d4875aeea3b0dd0907dbea463dfa055de27370a79bc77bdd83e2315eccee8b516be0"

RPROVIDES:${PN} += "pattern- \
patterns-base-sw-management-32bit"

RDEPENDS:${PN} += ""

inherit rpm
