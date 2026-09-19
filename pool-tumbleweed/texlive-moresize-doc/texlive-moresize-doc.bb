SUMMARY = "Documentation for texlive-moresize"
DESCRIPTION = "This package includes the documentation for texlive-moresize"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.9svn78101"

RPM_NAME = "texlive-moresize-doc-2026.226.1.9svn78101-61.2.noarch.rpm"
RPM_HASH = "74e8cbdc92f8b061f39f0e2a05fe954dad4e6c994fca9579e95f2cea7a3b6fd92a0ceb1cf1d72a76cc705daf781581bfb56ac6afb4a89d549cafe7d95769e3a9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moresize-doc"

RDEPENDS:${PN} += ""

inherit rpm
