SUMMARY = "Executables compatible with the original espeak"
DESCRIPTION = "This package contains executables compatible with the original espeak."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & Unicode-DFS-2015"

PV = "1.52.0"

RPM_NAME = "espeak-ng-compat-1.52.0-2.6.noarch.rpm"
RPM_HASH = "5c9c23d432d6e10cccb1a14c584dc3c1c2d2adde049cb82223859ccb059c88e829c7faf40fc660d668566e6903eb3e271465c7bd0117f34d25dc74a9fa4c0660"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "espeak-ng-compat"

RDEPENDS:${PN} += "espeak-ng"

inherit rpm
