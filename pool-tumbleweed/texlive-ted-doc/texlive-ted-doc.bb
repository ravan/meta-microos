SUMMARY = "Documentation for texlive-ted"
DESCRIPTION = "This package includes the documentation for texlive-ted"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.06svn76924"

RPM_NAME = "texlive-ted-doc-2026.227.1.06svn76924-62.2.noarch.rpm"
RPM_HASH = "efbe79823d533676d01ab4c6fef68668dc88e5399a8c3e99d10fba7151d0c8c3e08b5e9c775298206188ad5f171107002b66b41ec8747c960dc7025bdf272706"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ted-doc-fr \
texlive-ted-doc"

RDEPENDS:${PN} += ""

inherit rpm
