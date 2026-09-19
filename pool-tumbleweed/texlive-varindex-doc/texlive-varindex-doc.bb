SUMMARY = "Documentation for texlive-varindex"
DESCRIPTION = "This package includes the documentation for texlive-varindex"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn32262"

RPM_NAME = "texlive-varindex-doc-2026.226.2.3svn32262-60.2.noarch.rpm"
RPM_HASH = "e6218a93dfda0924f4089c72bd2d92b9caa8cd55aa42780516f6dad00f7b68858150b74a23e9b9312be7d0e627bf5c07e5e08ad2a9b790eb1cb3d01a7c034545"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
