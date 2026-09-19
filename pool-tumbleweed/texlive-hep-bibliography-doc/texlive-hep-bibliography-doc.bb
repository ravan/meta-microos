SUMMARY = "Documentation for texlive-hep-bibliography"
DESCRIPTION = "This package includes the documentation for texlive-hep-bibliography"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-bibliography-doc-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "abd121c513319fc1a316cf44bce1d78db116d11a1b482b3d3b1457ea9f86cfd34e7d7c922aaa6b35aeaef94a75b2eb0e84e080d96cf832fed5068a13d161f5f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-bibliography-doc"

RDEPENDS:${PN} += ""

inherit rpm
