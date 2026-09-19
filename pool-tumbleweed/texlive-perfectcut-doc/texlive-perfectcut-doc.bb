SUMMARY = "Documentation for texlive-perfectcut"
DESCRIPTION = "This package includes the documentation for texlive-perfectcut"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn67201"

RPM_NAME = "texlive-perfectcut-doc-2026.226.2.3svn67201-58.2.noarch.rpm"
RPM_HASH = "45044942698e47f7208b69ed1ae8115f5ea1f43df148ed11592ac2bd81bda79ee2ad1a014f664992e226fe957d80c849a82b665dd4889c45d5b1bab6eb2630dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-perfectcut-doc"

RDEPENDS:${PN} += ""

inherit rpm
