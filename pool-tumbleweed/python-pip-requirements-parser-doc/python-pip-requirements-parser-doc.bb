SUMMARY = "Documentation files for python-pip-requirements-parser"
DESCRIPTION = "Documentation files for python-pip-requirements-parser"
LICENSE = "MIT"

PV = "32.0.1"

RPM_NAME = "python-pip-requirements-parser-doc-32.0.1-2.4.noarch.rpm"
RPM_HASH = "4b35fad9cc0b6ff739394341b3e113073b894242dd35cf4044642bb0d3c9714a60c6fb09d59062ce98eb501d1f7a4b896f544da9662e54b0e899e54b240a1bff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-pip-requirements-parser-doc"

RDEPENDS:${PN} += ""

inherit rpm
