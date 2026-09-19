SUMMARY = "Documentation for texlive-songs"
DESCRIPTION = "This package includes the documentation for texlive-songs"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.1svn51494"

RPM_NAME = "texlive-songs-doc-2026.226.3.1svn51494-64.2.noarch.rpm"
RPM_HASH = "c900afcdb0c5984bae3c0ed509a35c2117e2e2ceac9c52dfc0c4b69560cf6f9e6f9b6340e6cd968a488f96f1ce2d04a2ff44890a7cdbf150a9b6a45c19f9d90b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-songs-doc"

RDEPENDS:${PN} += ""

inherit rpm
