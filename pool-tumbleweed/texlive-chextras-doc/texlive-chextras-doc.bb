SUMMARY = "Documentation for texlive-chextras"
DESCRIPTION = "This package includes the documentation for texlive-chextras"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.01svn27118"

RPM_NAME = "texlive-chextras-doc-2026.226.1.01svn27118-60.2.noarch.rpm"
RPM_HASH = "40259cda14c298d6c28d3c323ed12a8e8b510c6d70ab362f25ff6c4be9526951116f63de47611b3f2e1a06665863920d5dda1b2d566ebe620a73cccb60f83af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chextras-doc"

RDEPENDS:${PN} += ""

inherit rpm
