SUMMARY = "Documentation for texlive-prettyref"
DESCRIPTION = "This package includes the documentation for texlive-prettyref"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.3.0svn77682"

RPM_NAME = "texlive-prettyref-doc-2026.226.3.0svn77682-59.2.noarch.rpm"
RPM_HASH = "223e4c03b6ddfa863b7ada10dc6d247947d59235beed4efbb83bac2cc6c225f87a99539b8690bb395ff21315f6cc16534dc180f70002066ed1b36f8cb0673f3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prettyref-doc"

RDEPENDS:${PN} += ""

inherit rpm
