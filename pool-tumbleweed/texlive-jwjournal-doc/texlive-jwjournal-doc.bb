SUMMARY = "Documentation for texlive-jwjournal"
DESCRIPTION = "This package includes the documentation for texlive-jwjournal"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-jwjournal-doc-2026.226.svn76924-63.2.noarch.rpm"
RPM_HASH = "d3cf6f59660dfd6e031ec59e63fbc3be1507e1c52299c117af63abc09e43a3fecb0dab4d2dbe02828cd174bbfb2218b2edef3737a15ecb720cf7c608138c29a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jwjournal-doc"

RDEPENDS:${PN} += ""

inherit rpm
