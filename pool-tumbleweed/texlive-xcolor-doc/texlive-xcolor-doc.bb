SUMMARY = "Documentation for texlive-xcolor"
DESCRIPTION = "This package includes the documentation for texlive-xcolor"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.02svn77682"

RPM_NAME = "texlive-xcolor-doc-2026.226.3.02svn77682-59.4.noarch.rpm"
RPM_HASH = "5088ebb0d4d7b72690372f5963cfb5735d399bb91c7063be279deb62315e0e72d302880880cc38c9560bda9abc957046fc6eae6cea1889f2d7f63224b9c8ac07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
