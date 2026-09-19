SUMMARY = "Documentation for texlive-uhhassignment"
DESCRIPTION = "This package includes the documentation for texlive-uhhassignment"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn44026"

RPM_NAME = "texlive-uhhassignment-doc-2026.226.1.0svn44026-60.2.noarch.rpm"
RPM_HASH = "faa791234caf7763fa7108e2794e4051f9de5bdff0b527a85fb6edf4a3bbbf2f3f55dd36d6ca0dc628f80bb12955c9973b2b7dc95f6282033d3e3888f6304d39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uhhassignment-doc"

RDEPENDS:${PN} += ""

inherit rpm
