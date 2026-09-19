SUMMARY = "Documentation for texlive-suppose"
DESCRIPTION = "This package includes the documentation for texlive-suppose"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.2svn59281"

RPM_NAME = "texlive-suppose-doc-2026.226.1.2.2svn59281-64.2.noarch.rpm"
RPM_HASH = "c99deb3d95f7b720bcac556901c22ce67db77cdc5ce8d4319328c54dc8672b2e8d752a542c9966fd30dfe81b732b251d09f06c3459beaf53af88d9cf8942e405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-suppose-doc"

RDEPENDS:${PN} += ""

inherit rpm
