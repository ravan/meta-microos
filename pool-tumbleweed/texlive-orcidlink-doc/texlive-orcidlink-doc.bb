SUMMARY = "Documentation for texlive-orcidlink"
DESCRIPTION = "This package includes the documentation for texlive-orcidlink"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.0svn77682"

RPM_NAME = "texlive-orcidlink-doc-2026.226.1.1.0svn77682-61.2.noarch.rpm"
RPM_HASH = "7a41b98367c255f2c396d08521fe14c7539b89969b699befb4fb5ba0da4d38260678bdbe99093c69df5f8f93ab20eb2ba7b6920ddf170f3ef4141fb34bdc7fc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-orcidlink-doc"

RDEPENDS:${PN} += ""

inherit rpm
