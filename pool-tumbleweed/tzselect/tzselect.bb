SUMMARY = "Helper script to select the timezone"
DESCRIPTION = "This package contains a helper script to select the timezone."
LICENSE = "BSD-3-Clause & LicenseRef-SUSE-Public-Domain"

PV = "2026c"

RPM_NAME = "tzselect-2026c-2.1.noarch.rpm"
RPM_HASH = "7dbb6b03debd069b273cdf8d76bfc3011d991696098575723545811ce16a1dc6959ec8106f62fc1ca996b7559bebb7b3513be310e0253cc9e84177c8092a6ed1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "timezone-/usr/bin/tzselect \
tzselect"

RDEPENDS:${PN} += "/usr/bin/sh \
awk \
timezone"

inherit rpm
