SUMMARY = "Documentation for texlive-cnbwp"
DESCRIPTION = "This package includes the documentation for texlive-cnbwp"
LICENSE = "LPPL-1.0"

PV = "2026.226.2024.02svn69910"

RPM_NAME = "texlive-cnbwp-doc-2026.226.2024.02svn69910-60.2.noarch.rpm"
RPM_HASH = "6e469da0ba51e4ad42886b7d7eea341d33518172d4f63ad36903059b512ab97b464978da975d96d8bcb124cf1c080345d94a09cc321a273b660e86afd70fd70c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cnbwp-doc"

RDEPENDS:${PN} += ""

inherit rpm
