SUMMARY = "Documentation for texlive-xistercian"
DESCRIPTION = "This package includes the documentation for texlive-xistercian"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-xistercian-doc-2026.226.1.3svn77682-59.4.noarch.rpm"
RPM_HASH = "a01f2ca6f86546516f5378cd99d349ffffd9646b887acc03e99895f696cdfce8a85a4e4beefc0ed1a3d71a04f911eccaeb42f203fcf7b802c5f566521e16f5ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xistercian-doc"

RDEPENDS:${PN} += ""

inherit rpm
