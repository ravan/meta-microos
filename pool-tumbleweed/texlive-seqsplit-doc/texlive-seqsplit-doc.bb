SUMMARY = "Documentation for texlive-seqsplit"
DESCRIPTION = "This package includes the documentation for texlive-seqsplit"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-seqsplit-doc-2026.226.0.0.1svn77682-60.2.noarch.rpm"
RPM_HASH = "fe0618edf14a5cce5ec288dcc8f12826df899adc42281782dfc0fbc04d4afb1d340519722cf516b7714b9126a137b49fe7fad7588dfb4e7d002560ed07e98ba6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seqsplit-doc"

RDEPENDS:${PN} += ""

inherit rpm
