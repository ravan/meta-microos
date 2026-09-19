SUMMARY = "Documentation for texlive-tikz-kalender"
DESCRIPTION = "This package includes the documentation for texlive-tikz-kalender"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6bsvn77915"

RPM_NAME = "texlive-tikz-kalender-doc-2026.226.0.0.6bsvn77915-59.2.noarch.rpm"
RPM_HASH = "d81118b4cbb19a14469d18b3960ee17a6531957343ee7955d07a8c6c15469dcc7e8ea2f502c017cfb7aad2d8f280ae4a178f6945f5baaa8d3ebed2817bad0a44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-kalender-doc"

RDEPENDS:${PN} += ""

inherit rpm
