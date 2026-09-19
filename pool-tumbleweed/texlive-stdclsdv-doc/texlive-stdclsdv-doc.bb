SUMMARY = "Documentation for texlive-stdclsdv"
DESCRIPTION = "This package includes the documentation for texlive-stdclsdv"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1asvn76790"

RPM_NAME = "texlive-stdclsdv-doc-2026.226.1.1asvn76790-64.2.noarch.rpm"
RPM_HASH = "2cdb3422446645c5084300d8b0988114505a4e22379680ac7f44a916092ee0034c84d8e0dde8f845eb3fa56e1ae56059f255f77847b810cf5c8e5326a4b15ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stdclsdv-doc"

RDEPENDS:${PN} += ""

inherit rpm
