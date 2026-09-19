SUMMARY = "Apparmor profile for Tor Browser"
DESCRIPTION = "This package provides the apparmor profiles to safeguard against \
a Tor network compromise."
LICENSE = "BSD-3-Clause"

PV = "0.3.9"

RPM_NAME = "torbrowser-apparmor-profile-0.3.9-1.3.noarch.rpm"
RPM_HASH = "9a1e7470f5f87f47fc6ddc8735dec3e45d7aab7ca6d9644370d04a4defd71ceb82b8f684bd79b5be3d36d23a035c9274180bb57f488712ffd5177147bdddca74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-torbrowser-apparmor-profile \
torbrowser-apparmor-profile"

RDEPENDS:${PN} += "/usr/bin/sh \
apparmor-utils"

inherit rpm
