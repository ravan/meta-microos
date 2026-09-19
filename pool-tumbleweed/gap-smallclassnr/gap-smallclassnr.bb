SUMMARY = "GAP: Finite groups library with small class number"
DESCRIPTION = "The SmallClassNr package provides access to finite groups with small \
class number. Currently, the package contains the finite groups of \
class number at most 14."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.1"

RPM_NAME = "gap-smallclassnr-1.7.1-1.1.noarch.rpm"
RPM_HASH = "969e1ce08fae58812ece6f5319eec5de15b1f52eb0030f1813f7d972b5f243e21f39c2cde53e87becf8d6da25ddc39681583fd2aaa7d9857994404395e01ca3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-smallclassnr"

RDEPENDS:${PN} += "gap-core"

inherit rpm
