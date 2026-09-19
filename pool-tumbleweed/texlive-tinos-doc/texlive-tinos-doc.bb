SUMMARY = "Documentation for texlive-tinos"
DESCRIPTION = "This package includes the documentation for texlive-tinos"
LICENSE = "Apache-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-tinos-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "0dff34ed6f9dee73f97d59a7060a2e61128a4d472ec3092d65d79bdb881431f4596881de27f116a37cbfffecef4dd0696eaeb724183e506a9dbc9b026b0c551d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tinos-doc"

RDEPENDS:${PN} += ""

inherit rpm
