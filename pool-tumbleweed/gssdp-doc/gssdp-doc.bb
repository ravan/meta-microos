SUMMARY = "Documentation for gssdp"
DESCRIPTION = "Documentation for gssdp."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.6"

RPM_NAME = "gssdp-doc-1.6.6-1.3.noarch.rpm"
RPM_HASH = "22799655a9c82358adbd6983583c2a3f2ab33311f597384411ee4afe1495bdfd149e9ec706368fdf5fe1a64660155b63adfaf8c74e4ad29c337828667ad59d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gssdp-doc"

RDEPENDS:${PN} += ""

inherit rpm
