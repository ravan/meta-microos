SUMMARY = "Documentation for texlive-csbulletin"
DESCRIPTION = "This package includes the documentation for texlive-csbulletin"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77112"

RPM_NAME = "texlive-csbulletin-doc-2026.226.svn77112-61.2.noarch.rpm"
RPM_HASH = "a2829e37aea5913aa25165a7a5899d6b502e1b109b97ee3c529753928ad54386d765723d2b5c06f0e64a093321cd6da95322a783fb4b02295c3c6514970d2e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-csbulletin-doc-cs \
texlive-csbulletin-doc"

RDEPENDS:${PN} += ""

inherit rpm
