SUMMARY = "Documentation for texlive-chemarrow"
DESCRIPTION = "This package includes the documentation for texlive-chemarrow"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.9svn17146"

RPM_NAME = "texlive-chemarrow-doc-2026.226.0.0.9svn17146-60.2.noarch.rpm"
RPM_HASH = "102e9f22028ac38b3fb3e2d1ef2378f8a7cf46779944a944e6bbd1968a1d3a7f7ca459c5c0175670c2ea93336fda053a150ea96c3ee04c026a4d10ba451e76af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chemarrow-doc-de;en \
texlive-chemarrow-doc"

RDEPENDS:${PN} += ""

inherit rpm
