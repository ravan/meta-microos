SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-appliance-openstack-20260915-3446.1.aarch64.rpm"
RPM_HASH = "0d54bc13deacad6e038a6bf640cabf6839c87a034380f7cea84b61122cbd5931b24a0e12fe547b60ee7dc4270f325a799eff4886bc3980a042f475cf3acfe169"

RPROVIDES:${PN} += "flavor-appliance-openstack \
openSUSE-release-appliance-openstack \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
