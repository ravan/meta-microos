SUMMARY = "Documentation for texlive-drac"
DESCRIPTION = "This package includes the documentation for texlive-drac"
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn15878"

RPM_NAME = "texlive-drac-doc-2026.226.1svn15878-59.2.noarch.rpm"
RPM_HASH = "91111cd83d44e3347a516fffc3fcd3944616f2b5a21f2753bedbc6e427208fd41a7e48f81d76b97a8d148f722dcb6365e37fe16fad2cc4efe488d0735d3b6de5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-drac-doc-fr;en \
texlive-drac-doc"

RDEPENDS:${PN} += ""

inherit rpm
