SUMMARY = "Documentation for texlive-chicagolinks"
DESCRIPTION = "This package includes the documentation for texlive-chicagolinks"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn76790"

RPM_NAME = "texlive-chicagolinks-doc-2026.226.2.1svn76790-60.2.noarch.rpm"
RPM_HASH = "bddb116a5deedd86b3e222b956a7f8ac7d97c8839e4df242e5c7a0109aaa7d207598ff925bbe0e9ffe2be7666a9445c7ad241080e8727f1e0b0302ace643f9a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chicagolinks-doc"

RDEPENDS:${PN} += ""

inherit rpm
