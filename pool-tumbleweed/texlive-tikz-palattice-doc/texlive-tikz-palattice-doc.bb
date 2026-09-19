SUMMARY = "Documentation for texlive-tikz-palattice"
DESCRIPTION = "This package includes the documentation for texlive-tikz-palattice"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3svn43442"

RPM_NAME = "texlive-tikz-palattice-doc-2026.226.2.3svn43442-59.2.noarch.rpm"
RPM_HASH = "232a655977d72fcdb09be6ff961dd3e474a898279e514a092047d813b5475dc2f46a92b9b1ff0202022dbfeee360d3132cddb937790a37530f0960c4172685c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-palattice-doc"

RDEPENDS:${PN} += ""

inherit rpm
