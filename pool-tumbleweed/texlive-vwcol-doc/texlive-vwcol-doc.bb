SUMMARY = "Documentation for texlive-vwcol"
DESCRIPTION = "This package includes the documentation for texlive-vwcol"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-vwcol-doc-2026.226.0.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "b790623b8decf6bce95f4e066070590a37398931e7700eae2b933f8dacbf875843c7025d584273250e42919560a0086720b7805d748cf8ea7fb33d2a4ab2b7a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vwcol-doc"

RDEPENDS:${PN} += ""

inherit rpm
