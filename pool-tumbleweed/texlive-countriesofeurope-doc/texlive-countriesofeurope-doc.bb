SUMMARY = "Documentation for texlive-countriesofeurope"
DESCRIPTION = "This package includes the documentation for texlive-countriesofeurope"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.23svn77682"

RPM_NAME = "texlive-countriesofeurope-doc-2026.226.0.0.23svn77682-61.2.noarch.rpm"
RPM_HASH = "0435c2577b1d4031730e812115805f8895a195d33bb37173391da85ec923a9d55b2bc054827a5d585ebd436dc5e4f6a8796d8f231c8789580c9e2bb6aa7c4f52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-countriesofeurope-doc"

RDEPENDS:${PN} += ""

inherit rpm
