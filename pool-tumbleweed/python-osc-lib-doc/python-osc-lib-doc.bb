SUMMARY = "Documentation for the OpenStack client library"
DESCRIPTION = "Documentation for the OpenStack client library."
LICENSE = "Apache-2.0"

PV = "4.7.0"

RPM_NAME = "python-osc-lib-doc-4.7.0-1.1.noarch.rpm"
RPM_HASH = "5f34693ca298536d9feb168ed0b689cc64c341b1c01e526fa622cf67ceef8f67593018d60c8b0912b3176ab70095d9c7e0502e0577ee45fc7ea30cb91d8d9d45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-osc-lib-doc"

RDEPENDS:${PN} += ""

inherit rpm
