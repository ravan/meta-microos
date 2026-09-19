SUMMARY = "Documentation for texlive-wrapfig2"
DESCRIPTION = "This package includes the documentation for texlive-wrapfig2"
LICENSE = "LPPL-1.0"

PV = "2026.226.7.0.2svn77682"

RPM_NAME = "texlive-wrapfig2-doc-2026.226.7.0.2svn77682-59.4.noarch.rpm"
RPM_HASH = "a5dfb1b01ceef8c38fef4ae6982eaefee354ac61d71e8f8bda7a3df8f96a9843d323f0ec2a15deb4274b88d88dcc456f7e7da111ff7c055159c2320573648b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wrapfig2-doc"

RDEPENDS:${PN} += ""

inherit rpm
