SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-appliance-vmware-20260915-3446.1.aarch64.rpm"
RPM_HASH = "f3aec53cd1fd3039fe4ff04264e70dbb5efec289765630720eef611bff430d49edd2be6d41fb88fa9c663ac7113ec16e04fe991ea0c8ba0d2f3f25b74d4fc360"

RPROVIDES:${PN} += "flavor-appliance-vmware \
openSUSE-release-appliance-vmware \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
