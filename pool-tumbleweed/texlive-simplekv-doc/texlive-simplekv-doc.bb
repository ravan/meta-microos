SUMMARY = "Documentation for texlive-simplekv"
DESCRIPTION = "This package includes the documentation for texlive-simplekv"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.32svn77682"

RPM_NAME = "texlive-simplekv-doc-2026.226.0.0.32svn77682-60.2.noarch.rpm"
RPM_HASH = "f03b544bc0bd31ff5b2a66ab7d4bb2f259585787edddba740f1f9b098c3d74c9f866d7ecad4031207a0945a04aa55c8b2d4a730ba452fb2fc3593739c6df70a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-simplekv-doc-fr \
texlive-simplekv-doc"

RDEPENDS:${PN} += ""

inherit rpm
