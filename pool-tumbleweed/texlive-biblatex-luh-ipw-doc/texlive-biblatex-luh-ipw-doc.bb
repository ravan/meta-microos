SUMMARY = "Documentation for texlive-biblatex-luh-ipw"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-luh-ipw"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn32180"

RPM_NAME = "texlive-biblatex-luh-ipw-doc-2026.226.0.0.3svn32180-61.2.noarch.rpm"
RPM_HASH = "28050fdb981a240c1cf3ccff417fd3792165983d4c37375c918c216a3095d04530e7b8240aae877be5f2159ed184dd36b8df146f74e770f0f2e60a5a218d3392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-luh-ipw-doc-de \
texlive-biblatex-luh-ipw-doc"

RDEPENDS:${PN} += ""

inherit rpm
