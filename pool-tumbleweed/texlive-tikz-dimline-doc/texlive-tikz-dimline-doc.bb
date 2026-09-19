SUMMARY = "Documentation for texlive-tikz-dimline"
DESCRIPTION = "This package includes the documentation for texlive-tikz-dimline"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn35805"

RPM_NAME = "texlive-tikz-dimline-doc-2026.226.1.0svn35805-59.2.noarch.rpm"
RPM_HASH = "5808a965e4f72e547d77aec91e67de563003ba97990482c569d5c2f6e10dc539bad04c896527a2e58ba08ae70a83c8090e88f360093ca1b7dbd8f6516a59b11d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-dimline-doc"

RDEPENDS:${PN} += ""

inherit rpm
