SUMMARY = "Documentation for texlive-optional"
DESCRIPTION = "This package includes the documentation for texlive-optional"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2bsvn77682"

RPM_NAME = "texlive-optional-doc-2026.226.2.2bsvn77682-61.2.noarch.rpm"
RPM_HASH = "e2eac7328944f02c0ecc67bccdade6b52286522a62f8cc82ac65dcbe11fca89b1335a8e9ba582b0c29d700634feec872e8519a0ee02c92310026dbf90604b2a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-optional-doc"

RDEPENDS:${PN} += ""

inherit rpm
