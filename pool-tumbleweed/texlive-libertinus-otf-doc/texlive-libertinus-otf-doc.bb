SUMMARY = "Documentation for texlive-libertinus-otf"
DESCRIPTION = "This package includes the documentation for texlive-libertinus-otf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.34svn77682"

RPM_NAME = "texlive-libertinus-otf-doc-2026.226.0.0.34svn77682-61.2.noarch.rpm"
RPM_HASH = "8ad176af72da0cbd779c8c751d09700b5fea5c0b3184f948b99f235b121952bcec42911a864678d4b4f69edbee22580e452f83ce81cf1bf145b562805583cb64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-libertinus-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
