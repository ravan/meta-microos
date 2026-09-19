SUMMARY = "Documentation for texlive-mmap"
DESCRIPTION = "This package includes the documentation for texlive-mmap"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.03svn77682"

RPM_NAME = "texlive-mmap-doc-2026.226.1.03svn77682-61.2.noarch.rpm"
RPM_HASH = "294491abb078f24c7be0325f9be58118d6c8e13a9eeeec4b786b2ceeaf44b7419a49e7f824d9e29666f5d7271c7a4e5fa7ac17349ebf921adadcc6b287833e87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mmap-doc"

RDEPENDS:${PN} += ""

inherit rpm
