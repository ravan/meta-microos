SUMMARY = "Documentation for texlive-altsubsup"
DESCRIPTION = "This package includes the documentation for texlive-altsubsup"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn62738"

RPM_NAME = "texlive-altsubsup-doc-2026.226.1.1svn62738-61.2.noarch.rpm"
RPM_HASH = "5af5098f1bf04b4adf3285b9d11125acb416ceb0bb7f26f56e997e3dc3e7f2122f075a617cd7728339480c0b94436e9bb0090133193b6f49b2930d933b590ec1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-altsubsup-doc"

RDEPENDS:${PN} += ""

inherit rpm
