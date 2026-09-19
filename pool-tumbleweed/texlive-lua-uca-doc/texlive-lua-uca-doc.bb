SUMMARY = "Documentation for texlive-lua-uca"
DESCRIPTION = "This package includes the documentation for texlive-lua-uca"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1esvn74807"

RPM_NAME = "texlive-lua-uca-doc-2026.226.0.0.1esvn74807-59.2.noarch.rpm"
RPM_HASH = "1644831f435baf0e64756525e7d918159644c21466950baa34716d96aaac0862007266521761de2b72eb6c48ef6c4c72b7fb7bb4802e75a2ca443b186d2d26b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-uca-doc"

RDEPENDS:${PN} += ""

inherit rpm
