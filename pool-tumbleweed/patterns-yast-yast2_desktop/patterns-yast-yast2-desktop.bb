SUMMARY = "YaST Desktop Utilities"
DESCRIPTION = "YaST tools for desktop system administration."
LICENSE = "MIT"

PV = "20260219"

RPM_NAME = "patterns-yast-yast2_desktop-20260219-1.2.aarch64.rpm"
RPM_HASH = "988ba7458731a52f9c7d585a1e6b41efa6546241276613772e3199317bd24ac576cece608e9e1d979d7efc7498cbd4e2252e888f5128e2a2333992cdde9b6e76"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-yast-yast2-desktop"

RDEPENDS:${PN} += "yast2-country \
yast2-installation \
yast2-services-manager \
yast2-sysconfig \
yast2-users"

inherit rpm
