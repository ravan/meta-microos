SUMMARY = "Documentation for texlive-graphicxbox"
DESCRIPTION = "This package includes the documentation for texlive-graphicxbox"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn32630"

RPM_NAME = "texlive-graphicxbox-doc-2026.226.1.0svn32630-60.4.noarch.rpm"
RPM_HASH = "d561ea14af8b59a590ee850825b82498decc4cb015301fdad07f2e9e7e1a22982614e7ed8c8ae0012c827f22cb2ab111d517bf9e7756575b9bfa55aa499f4724"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicxbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
