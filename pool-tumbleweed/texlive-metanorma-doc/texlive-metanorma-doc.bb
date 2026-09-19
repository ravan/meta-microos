SUMMARY = "Documentation for texlive-metanorma"
DESCRIPTION = "This package includes the documentation for texlive-metanorma"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5.0svn55010"

RPM_NAME = "texlive-metanorma-doc-2026.226.0.0.5.0svn55010-61.2.noarch.rpm"
RPM_HASH = "af16fe7fbde389a259ce2aea5d792cf0279a602085781412c641a9f5916be98955f564445eaafe40d7be98682b92b4f7e59c821be68fa82f8c97c578ba894cac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metanorma-doc"

RDEPENDS:${PN} += ""

inherit rpm
