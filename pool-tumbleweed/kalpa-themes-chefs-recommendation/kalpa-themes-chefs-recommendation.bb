SUMMARY = "Alternate Theme for Kalpa Desktop"
DESCRIPTION = "This package offers 'The Chef's Recommendation' light and dark \
themes for the Kalpa Desktop. \
 \
They are rather opinionated in their layout but offer an \
alternative take from the more default upstream-like experience \
of the Kalpa Light/Dark themes"
LICENSE = "GPL-2.0 & MIT & CC-BY-SA-4.0"

PV = "1.0"

RPM_NAME = "kalpa-themes-chefs-recommendation-1.0-1.2.noarch.rpm"
RPM_HASH = "f8c85e1b9d24eb5896fddfdf1c28964c279063ad0c3b1e2973a8a0a1816a739c13d774c7d30a99a74ee52341c52444ad13a387790eeb698b4de746ab6327275a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalpa-themes-chefs-recommendation"

RDEPENDS:${PN} += "kalpa-themes"

inherit rpm
