SUMMARY = "Documentation for texlive-modeles-factures-belges-assocs"
DESCRIPTION = "This package includes the documentation for texlive-modeles-factures-belges-assocs"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn67840"

RPM_NAME = "texlive-modeles-factures-belges-assocs-doc-2026.226.1.0.1svn67840-61.2.noarch.rpm"
RPM_HASH = "96c5195a0e0e0120dd73532a1024bfe1955bf9f65faeb7b897237a5b4230e95c4f020076df96b7786aacada5f20f3dc199de8631b1a107bdff747d509e099665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modeles-factures-belges-assocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
