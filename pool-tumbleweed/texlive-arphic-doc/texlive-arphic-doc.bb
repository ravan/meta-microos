SUMMARY = "Documentation for texlive-arphic"
DESCRIPTION = "This package includes the documentation for texlive-arphic"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-arphic-doc-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "01c84de51fc57dcb6d04477f10c4d447db6405d675dd55b3baa0c4ec5bdfd4e6deae49d02784dd459e5525c77e363a99319a7079658f626acac776d6b5c60dfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arphic-doc"

RDEPENDS:${PN} += ""

inherit rpm
