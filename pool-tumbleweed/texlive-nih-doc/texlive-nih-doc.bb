SUMMARY = "Documentation for texlive-nih"
DESCRIPTION = "This package includes the documentation for texlive-nih"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-nih-doc-2026.226.svn15878-61.2.noarch.rpm"
RPM_HASH = "7a0dbc8eb3daa46105986835313fef21b9be9151e855a4d99d201bc64d75d4fdbbab3bfa59f74d649ae4077a80c08c667a43de1877d020c4ec7a2e4f0593a0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nih-doc"

RDEPENDS:${PN} += ""

inherit rpm
