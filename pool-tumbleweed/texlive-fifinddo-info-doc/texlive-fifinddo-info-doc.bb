SUMMARY = "Documentation for texlive-fifinddo-info"
DESCRIPTION = "This package includes the documentation for texlive-fifinddo-info"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1bsvn29349"

RPM_NAME = "texlive-fifinddo-info-doc-2026.226.1.1bsvn29349-59.2.noarch.rpm"
RPM_HASH = "942cadd6efb21c0fc6d0c4cc0587783c33c1bac138ad4ecc20c12f7b1dd7bd4ff004e8e3801a9f033ea3a26639cb6f10e93c86605724d7e9265086295d820ec4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fifinddo-info-doc-de;en \
texlive-fifinddo-info-doc"

RDEPENDS:${PN} += ""

inherit rpm
