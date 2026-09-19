SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-appliance-hyperv-20260915-3446.1.aarch64.rpm"
RPM_HASH = "5f24bd75b2370cdd2a6c8ed67562dae068db6837d178450647203dc60fff1f6adbb76fddac8b5f98e7cac309ddd8552ce071ea8b03a1be2afb4bc476f211cca4"

RPROVIDES:${PN} += "flavor-appliance-hyperv \
openSUSE-release-appliance-hyperv \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
