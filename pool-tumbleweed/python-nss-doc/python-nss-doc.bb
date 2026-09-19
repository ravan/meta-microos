SUMMARY = "Documentation files for python-nss"
DESCRIPTION = "HTML Documentation and examples for python-nss."
LICENSE = "GPL-2.0-or-later | MPL-1.1+ | LGPL-2.0-or-later"

PV = "1.0.1"

RPM_NAME = "python-nss-doc-1.0.1-7.12.noarch.rpm"
RPM_HASH = "e8dafd19ac002071a49b4689c280aedbb6ace3027040f7b3cfc221327600f8667b084791b5e3279bc3fdf194dedc7365891c25cc5090affd17958842b80b1655"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-nss-doc"

RDEPENDS:${PN} += ""

inherit rpm
