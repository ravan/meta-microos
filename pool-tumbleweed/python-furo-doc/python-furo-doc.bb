SUMMARY = "Documentation files for python-furo"
DESCRIPTION = "HTML Documentation and examples for python-furo."
LICENSE = "MIT"

PV = "2025.12.19"

RPM_NAME = "python-furo-doc-2025.12.19-1.4.noarch.rpm"
RPM_HASH = "4354b43d6ffc005da319303aa47619b4e584e5cd700ef2f07dc81cd3a3f331be28a176f4f14f72d1befeb98d8d8f628f0cdb845025096a137b7357bf402ad9cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-furo-doc"

RDEPENDS:${PN} += ""

inherit rpm
