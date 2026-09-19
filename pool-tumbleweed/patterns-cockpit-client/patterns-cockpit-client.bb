SUMMARY = "Cockpit Client"
DESCRIPTION = "Packages for using the Cockpit client launcher together with the full Cockpit \
management stack."
LICENSE = "MIT"

PV = "16.0"

RPM_NAME = "patterns-cockpit-client-16.0-7.1.aarch64.rpm"
RPM_HASH = "8dbfd2e9fc61f6dc3485743eef0c74a94f72673110afabdd92aeb95526d923e53236cc20f0ca4d0bbef39153417102b534556dddee78a93428dcd2ca4ad20714"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-cockpit-client"

RDEPENDS:${PN} += "cockpit-client-launcher \
pattern-"

inherit rpm
