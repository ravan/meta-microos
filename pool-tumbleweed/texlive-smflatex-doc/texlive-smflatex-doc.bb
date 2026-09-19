SUMMARY = "Documentation for texlive-smflatex"
DESCRIPTION = "This package includes the documentation for texlive-smflatex"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn58910"

RPM_NAME = "texlive-smflatex-doc-2026.226.1.6svn58910-64.2.noarch.rpm"
RPM_HASH = "7059ee9e69b8bc39bad82f5813530e52bb768c43f8cd877e2cf0a3b3aaf8535a678c35fde0ff28917eb53032b96b0323026f8e915d5ccd39eba579428c987f49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-smflatex-doc-fr \
texlive-smflatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
