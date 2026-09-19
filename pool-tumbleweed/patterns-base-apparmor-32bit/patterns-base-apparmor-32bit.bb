SUMMARY = "AppArmor (32bit)"
DESCRIPTION = "The 32bit pattern complementing apparmor."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-apparmor-32bit-20241218-34.1.aarch64.rpm"
RPM_HASH = "dbcb422279ee86aa636375dd09c68d99b19c52931fdfe2b3a3cc12d0d5281484026aaefa6281d31322e71da6209a6e6c84d13d5b4ccf397fedf0f4fbf61a59c7"

RPROVIDES:${PN} += "pattern- \
patterns-base-apparmor-32bit"

RDEPENDS:${PN} += ""

inherit rpm
