SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-appliance-docker-20260915-3446.1.aarch64.rpm"
RPM_HASH = "f86215d87acfc19a62c044685937b669bea50cc83e4dfdbe59af8ef23431aeae1b8ee3bea6f4a9f53e1d0a5aac2e99a0e7b7564cc9f892420fa7198ad28c62a1"

RPROVIDES:${PN} += "flavor-appliance-docker \
openSUSE-release-appliance-docker \
product-flavor- \
product-flavor-openSUSE"

RDEPENDS:${PN} += ""

inherit rpm
