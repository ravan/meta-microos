SUMMARY = "Oxygen sounds"
DESCRIPTION = "This package contains the Oxygen sound set for a KDE Plasma workspace."
LICENSE = "LGPL-3.0-or-later & CC-BY-3.0"

PV = "6.6.3"

RPM_NAME = "oxygen6-sounds-6.6.3-1.2.noarch.rpm"
RPM_HASH = "213ddf0245d8ef265d064dd150f57ac299e954d418744322169bc2b53dfca6f26cc4cb871ccfaab41b80176d87093425926086e09b2ee9e794848098eee64094"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "oxygen-sounds5 \
oxygen5-sounds \
oxygen6-sounds"

RDEPENDS:${PN} += ""

inherit rpm
