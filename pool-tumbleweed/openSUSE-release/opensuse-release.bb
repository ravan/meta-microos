SUMMARY = "openSUSE Tumbleweed"
DESCRIPTION = "openSUSE Tumbleweed is the rolling distribution by the openSUSE.org project."
LICENSE = "BSD-3-Clause"

PV = "20260915"

RPM_NAME = "openSUSE-release-20260915-3446.1.aarch64.rpm"
RPM_HASH = "5dbe888a3e45d260f66ef63e160d1891d027f04cb12df4650015cf1301849aa999b66adacf7645eeee9ca9bce52b6cd5a5d83cbac2a8f2d8e6997a557442e756"

RPROVIDES:${PN} += "aaa-version \
config-openSUSE-release \
distribution-release \
openSUSE-release \
openSUSE-release-20260915 \
product- \
product-cpeid- \
product-label- \
product-openSUSE \
product-register-target- \
product-update- \
product-url-releasenotes \
product-url-repository \
suse-release \
suse-release-oss \
system-installation-"

RDEPENDS:${PN} += "product-flavor-openSUSE"

inherit rpm
