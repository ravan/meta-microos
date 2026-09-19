SUMMARY = "Documentation for gplugin"
DESCRIPTION = "Documentation for gplugin."
LICENSE = "LGPL-2.0-or-later"

PV = "0.44.2"

RPM_NAME = "gplugin-doc-0.44.2-2.4.noarch.rpm"
RPM_HASH = "6f71711f82fa86c5ca6633db770d60bef1171240198cdc342ae3580ec1b48607b7dea18be7e2e5cc1051eecd838ff306fe82b9fd1d82b897153d3f34c44e7be6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gplugin-doc"

RDEPENDS:${PN} += ""

inherit rpm
