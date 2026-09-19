SUMMARY = "Network Administration"
DESCRIPTION = "Tools for administering and debugging networks."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-network-network_admin-20170319-3.15.aarch64.rpm"
RPM_HASH = "53e8af18c998502fc03bcbc0ff08fa0d964a58a1c0835851674aa59052fc118f06660aa219c9e3d8f9b55a20fd8472740987c32a51a821847d21270c7c5ca877"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-network-network-admin"

RDEPENDS:${PN} += "pattern-"

inherit rpm
