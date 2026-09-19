SUMMARY = "Documentation for texlive-pdfarticle"
DESCRIPTION = "This package includes the documentation for texlive-pdfarticle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn51127"

RPM_NAME = "texlive-pdfarticle-doc-2026.226.1.0svn51127-58.2.noarch.rpm"
RPM_HASH = "7f805482e1e40c4b2eb6fff62e5634fb7cbc1762f91533f02c23787f5f59f93041973c4367c6734cde09d00df70145a7c6a9a495e680dbe7846dd342953179f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pdfarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
