SUMMARY = "Documentation for texlive-biblatex-chem"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-chem"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2asvn76236"

RPM_NAME = "texlive-biblatex-chem-doc-2026.226.1.2asvn76236-61.2.noarch.rpm"
RPM_HASH = "c19c16a78af9f4c75edfe4214c5495c3b5bd7277aebea1ddd408d35cdea29f1ad1dbbdaacbbdeb851c568af49223c23ff4eed184db0bac82d75c1b7c5c8a306d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-chem-doc"

RDEPENDS:${PN} += ""

inherit rpm
