SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-appliance-custom-20260915-3446.1.aarch64.rpm"
RPM_HASH = "bfdb90bfdca18070ffe7c8f734dcae66f40930b56cabd25da5669660c4076eee2b8d023acad20fd881554bbb9845b2f4a86a738db3790179abb7fdc215ba2eac"

RPROVIDES:${PN} += "flavor-appliance-custom \
openSUSE-release-appliance-custom \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
