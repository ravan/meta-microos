SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-oem-20260915-3446.1.aarch64.rpm"
RPM_HASH = "08c9c2d206d07efd2d98c1b4e695f6c54d5288b99989250a119484b016e586739830e67bbe3d6ec12e568bb2450c8697de193f191562008e4e3cd4de02eafd93"

RPROVIDES:${PN} += "flavor-oem \
openSUSE-release-oem \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
