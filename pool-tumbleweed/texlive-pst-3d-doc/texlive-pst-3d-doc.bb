SUMMARY = "Documentation for texlive-pst-3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-3d"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.10svn77682"

RPM_NAME = "texlive-pst-3d-doc-2026.226.1.10svn77682-59.2.noarch.rpm"
RPM_HASH = "4c99ba9fe68dc2a8fbb5fb8154137b8fff684e1a987039a62ee8f240182303e43bf7c260067583cfb3f62bb21c2b091ad21e860ee260837b2842d3b3a551f778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
