SUMMARY = "Documentation for texlive-sduthesis"
DESCRIPTION = "This package includes the documentation for texlive-sduthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2.1svn41401"

RPM_NAME = "texlive-sduthesis-doc-2026.226.1.2.1svn41401-60.2.noarch.rpm"
RPM_HASH = "57bafecb985ef4a30324ff838f47e7e454f80d6bed5d515de19435bfb06dba623b01e34028951633f2ef217823e9cd2b5581ece1ed6042f5a7bf90f54dc21cfb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-sduthesis-doc-zh \
texlive-sduthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
