SUMMARY = "Documentation for texlive-scalebar"
DESCRIPTION = "This package includes the documentation for texlive-scalebar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-scalebar-doc-2026.226.1.0svn15878-60.2.noarch.rpm"
RPM_HASH = "039837e8da065e2a3f83dc49ab83659cfff6362380d3ea308763d4dbaaaf1f35b7386d391bbf9ac1b59c340d789d926431605c0209162447486e880e178b7a8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scalebar-doc"

RDEPENDS:${PN} += ""

inherit rpm
