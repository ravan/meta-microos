SUMMARY = "Documentation for texlive-fitch"
DESCRIPTION = "This package includes the documentation for texlive-fitch"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-fitch-doc-2026.226.1.0svn77682-59.2.noarch.rpm"
RPM_HASH = "bc79e3864da9b4f51bfac345ee7805d761da7797ffaa67ced5b69fe28b03e376016f9e977a96e831233ae1c1406b9f7b0654f06f78dbe1867cdfcfd17f8b0b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fitch-doc"

RDEPENDS:${PN} += ""

inherit rpm
