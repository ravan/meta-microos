SUMMARY = "leechcraft_netutils"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_netutils-20170319-1.24.aarch64.rpm"
RPM_HASH = "7e10e3d496c7567243fcdcf3f83e6c332f7162a4f9f2be546c938ae63592c796d477c204260bdde686b7f0e61a1b8ca1ca15787e03338f72495a0e3e79d2c484"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-leechcraft-leechcraft-netutils"

RDEPENDS:${PN} += "leechcraft-cstp \
pattern-"

inherit rpm
