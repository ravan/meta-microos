SUMMARY = "Documentation for texlive-rutitlepage"
DESCRIPTION = "This package includes the documentation for texlive-rutitlepage"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0svn76924"

RPM_NAME = "texlive-rutitlepage-doc-2026.226.3.0svn76924-60.2.noarch.rpm"
RPM_HASH = "d55d57e75ba79212863d85cbc8c83972b2f957e6f3ac4677ad733c99e1a8d2dde228b6435097fcc7a5e5c93c1f1000bb256ca2af39ccfcfd2ead013180605f6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rutitlepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
