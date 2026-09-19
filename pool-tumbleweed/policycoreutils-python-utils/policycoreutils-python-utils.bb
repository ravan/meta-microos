SUMMARY = "SELinux policy core python utilities"
DESCRIPTION = "The policycoreutils-python-utils package contains the management tools \
use to manage an SELinux environment."
LICENSE = "GPL-2.0-or-later"

PV = "3.11"

RPM_NAME = "policycoreutils-python-utils-3.11-2.2.noarch.rpm"
RPM_HASH = "0bd2d1ba7ab70bb025695120d26c123535696d7d7577a133c5331240baa4339637c1b4105d6e906e43e9cea3bcb0b7f731c5652b130466ceba416f40273a025f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "policycoreutils-python-utils"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python3-policycoreutils"

inherit rpm
