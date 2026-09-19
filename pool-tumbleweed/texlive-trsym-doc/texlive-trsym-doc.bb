SUMMARY = "Documentation for texlive-trsym"
DESCRIPTION = "This package includes the documentation for texlive-trsym"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn18732"

RPM_NAME = "texlive-trsym-doc-2026.226.1.0svn18732-59.2.noarch.rpm"
RPM_HASH = "00c721891ab02267a2d5753f9c0c86911758cb1b1ce5b24424a407f4524b49070344ebe2b09e48c2db64907dda1b39e6a23d3a26b7d79a388f085861db277b99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
