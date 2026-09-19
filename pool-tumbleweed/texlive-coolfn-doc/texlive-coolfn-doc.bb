SUMMARY = "Documentation for texlive-coolfn"
DESCRIPTION = "This package includes the documentation for texlive-coolfn"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn69007"

RPM_NAME = "texlive-coolfn-doc-2026.226.1.2.2svn69007-61.2.noarch.rpm"
RPM_HASH = "641103ca5511b477b7b4cef12f8b839f980055006669b95822bfac16d7d5f68526c12574186017713bd827926e797cf059e1cb7d0068fca930d5032141723867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coolfn-doc"

RDEPENDS:${PN} += ""

inherit rpm
