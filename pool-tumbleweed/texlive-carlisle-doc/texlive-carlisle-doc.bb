SUMMARY = "Documentation for texlive-carlisle"
DESCRIPTION = "This package includes the documentation for texlive-carlisle"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59577"

RPM_NAME = "texlive-carlisle-doc-2026.226.svn59577-59.2.noarch.rpm"
RPM_HASH = "4f0ea4792e9a3de2cc557e027b28de5f9ddce00087d17e9af63bebbeed632dcc2bb51d1a109e92931ffe632beb172b40d3ee6ef94b1ccd20d69d535c36b577e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carlisle-doc"

RDEPENDS:${PN} += ""

inherit rpm
