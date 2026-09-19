SUMMARY = "MATE Desktop Environment"
DESCRIPTION = "The MATE desktop environment is a desktop environment using traditional metaphors."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate-20170319-6.3.aarch64.rpm"
RPM_HASH = "5282d59408ad34ba312105d2d2d06f774941b6f59b0623a6234b85936229c2df8f98a0ff11c14004599dd1f2b5337c52e1596d3e88cb7f576b78d33f5183e0bf"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-mate-mate"

RDEPENDS:${PN} += "pattern-"

inherit rpm
