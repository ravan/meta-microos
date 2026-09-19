SUMMARY = "Documentation for texlive-tablefootnote"
DESCRIPTION = "This package includes the documentation for texlive-tablefootnote"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1csvn77682"

RPM_NAME = "texlive-tablefootnote-doc-2026.226.1.1csvn77682-64.2.noarch.rpm"
RPM_HASH = "d5e721207398342ab74286eb8ed8582f320b8eb016bac162134bf2eb3d6559dafe56dd96b836bfecd9b11885ad35ab4a7fa5cc15f7d65ef5e8056d80b993f9aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tablefootnote-doc"

RDEPENDS:${PN} += ""

inherit rpm
