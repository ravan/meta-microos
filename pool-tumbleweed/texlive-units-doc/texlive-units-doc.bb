SUMMARY = "Documentation for texlive-units"
DESCRIPTION = "This package includes the documentation for texlive-units"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.9bsvn42428"

RPM_NAME = "texlive-units-doc-2026.226.0.0.9bsvn42428-60.2.noarch.rpm"
RPM_HASH = "bc3b64a1c3587003200e352671e15bd357d02d8964fe34367fd6aae2a3daa2a728f7681635069c24133290d2dbfec0d0e7ffd7c6ba3b605a66033df2b11b2c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-units-doc"

RDEPENDS:${PN} += ""

inherit rpm
