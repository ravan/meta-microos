SUMMARY = "Documentation for texlive-colorweb"
DESCRIPTION = "This package includes the documentation for texlive-colorweb"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn31490"

RPM_NAME = "texlive-colorweb-doc-2026.226.1.3svn31490-60.2.noarch.rpm"
RPM_HASH = "6260c93e5956f1834398965d9619821f2418fa4d24eb905bc3fddaffccb1dc8cfbd8bdafbf8d45a95bf638411c1c2dfa5774d43500207b8da4be6c1f515389c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorweb-doc"

RDEPENDS:${PN} += ""

inherit rpm
