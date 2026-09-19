SUMMARY = "Documentation for texlive-export"
DESCRIPTION = "This package includes the documentation for texlive-export"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8svn27206"

RPM_NAME = "texlive-export-doc-2026.226.1.8svn27206-59.2.noarch.rpm"
RPM_HASH = "f33706bb61905776948576d56c2f06095565c0a8f21761360c91c186682f278863a552fc3c7dc2fd3906e71d7c6d5b21632d10adcbde47f74b3de53547df0cb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-export-doc"

RDEPENDS:${PN} += ""

inherit rpm
