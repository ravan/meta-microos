SUMMARY = "Documentation for texlive-realboxes"
DESCRIPTION = "This package includes the documentation for texlive-realboxes"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-realboxes-doc-2026.226.0.0.2svn77682-60.4.noarch.rpm"
RPM_HASH = "e32899a660451ededc5b23c38ccdcc141502e9c37c5239f3dc45e9c2ecc4fc9a406fa0281d453f61bcd4d2f2698fadb7ff78c9e44c3c95f10d7e36642e392477"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-realboxes-doc"

RDEPENDS:${PN} += ""

inherit rpm
