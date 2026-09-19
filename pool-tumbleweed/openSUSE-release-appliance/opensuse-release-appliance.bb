SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-appliance-20260915-3446.1.aarch64.rpm"
RPM_HASH = "a50f9a8bcaee0ec202eec7322e345f9cc46bd6dc3f453ca6d67ced92406a5a5145b1652ddd647a524d5b2d850126cd2a601ff1bf2fbca0b3dbde15a25e58bec7"

RPROVIDES:${PN} += "flavor-appliance \
openSUSE-release-appliance \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
