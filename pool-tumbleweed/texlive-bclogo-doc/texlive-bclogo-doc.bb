SUMMARY = "Documentation for texlive-bclogo"
DESCRIPTION = "This package includes the documentation for texlive-bclogo"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.15svn77682"

RPM_NAME = "texlive-bclogo-doc-2026.226.3.15svn77682-61.2.noarch.rpm"
RPM_HASH = "9af288432c9b2b06a3e7155359eef86ff5feee74626572586ff0890b50b1049b1677e051f6a47f1b0b23a1e159c759cf96b42015b193e64cd29316675b93be5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bclogo-doc-fr \
texlive-bclogo-doc"

RDEPENDS:${PN} += ""

inherit rpm
