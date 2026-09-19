SUMMARY = "Documentation for texlive-ysabeau"
DESCRIPTION = "This package includes the documentation for texlive-ysabeau"
LICENSE = "OFL-1.1"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-ysabeau-doc-2026.226.1.6svn77682-59.4.noarch.rpm"
RPM_HASH = "b5e2bec7b94ea67558f92bd5c39aecffafa38dec9ef0bcfd35ea70c37407b890ea24fefb9e566183b01c8470bdd2706794aa821a131cc65ba1299a9d70c02b2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ysabeau-doc"

RDEPENDS:${PN} += ""

inherit rpm
