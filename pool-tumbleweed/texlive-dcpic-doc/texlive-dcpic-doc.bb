SUMMARY = "Documentation for texlive-dcpic"
DESCRIPTION = "This package includes the documentation for texlive-dcpic"
LICENSE = "LPPL-1.0"

PV = "2026.226.5.0.0svn30206"

RPM_NAME = "texlive-dcpic-doc-2026.226.5.0.0svn30206-59.2.noarch.rpm"
RPM_HASH = "408195a02c8df5e623c02d3b068a4859850ac7cc685c4bfd5fdd627de426b0fe02cc7d528bd7f44527acecdb72cdb7aea09026822555cab01b2b4e607df46877"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-dcpic-doc-en;pt \
texlive-dcpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
