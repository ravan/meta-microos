SUMMARY = "Applets for Budgie Desktop Environment"
DESCRIPTION = "Applets for Budgie Desktop Environment"
LICENSE = "MIT"

PV = "20250305"

RPM_NAME = "patterns-budgie-budgie_applets-20250305-2.4.aarch64.rpm"
RPM_HASH = "b88f16bfa0e7594cf54d050d0ee54b563e14de7ca9a5b1a0e8c3a684d3e3d135d3950941d001dd2e5ffae5104754b4e97ee9902cdd5567993e746b25dba350c5"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-budgie-budgie-applets"

RDEPENDS:${PN} += "pattern-"

inherit rpm
