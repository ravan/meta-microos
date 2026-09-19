SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-appliance-kvm-20260915-3446.1.aarch64.rpm"
RPM_HASH = "dfdd922f3350da23995085d69f61328a89e92c0979c91a7bee9b1d0faf9ae7e1f50ec562503b3f268deb6491b2eefd9e10b1887e9c85d6acbba0c44219bfe7d7"

RPROVIDES:${PN} += "flavor-appliance-kvm \
openSUSE-release-appliance-kvm \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
