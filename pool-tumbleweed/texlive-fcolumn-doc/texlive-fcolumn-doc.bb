SUMMARY = "Documentation for texlive-fcolumn"
DESCRIPTION = "This package includes the documentation for texlive-fcolumn"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.4svn77682"

RPM_NAME = "texlive-fcolumn-doc-2026.226.1.4.4svn77682-59.2.noarch.rpm"
RPM_HASH = "8093f79b48f3f78a64b0cb177f8f85958a19bcc0e364a8a991680cacb121b047396813c312ef515ccdcd03ff53d1889b35f2d8b4f8c7bb24b9aeae2413c277ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fcolumn-doc"

RDEPENDS:${PN} += ""

inherit rpm
