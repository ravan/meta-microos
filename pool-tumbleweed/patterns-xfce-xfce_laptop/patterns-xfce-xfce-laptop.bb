SUMMARY = "XFCE Laptop"
DESCRIPTION = "XFCE Laptop"
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce_laptop-20230212-12.3.aarch64.rpm"
RPM_HASH = "6a0a2e0d193281d7b988ae7d5f24bf23a3e234ac2564ccda3eb887379c38b8d4dd5d23fb66ba2058f7f12a9019cfeafc7dc7998f5b161a763049622f162308e2"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-openSUSE-xfce-laptop \
patterns-xfce-xfce-laptop"

RDEPENDS:${PN} += "pattern-"

inherit rpm
