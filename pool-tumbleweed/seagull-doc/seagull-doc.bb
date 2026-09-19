SUMMARY = "Documentation for seagull"
DESCRIPTION = "Documentation for seagull."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.2"

RPM_NAME = "seagull-doc-0.8.2-1.1.noarch.rpm"
RPM_HASH = "2b2afbecaade6486e969df3c790dd64b757b629aa53669e3e489ba3d768a2103e851e6fb4b8d590e1d3e8ff3e7b1ea7dea04456b3ea523d348c976334bf10ee6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "seagull-doc"

RDEPENDS:${PN} += ""

inherit rpm
