SUMMARY = "Documentation for texlive-ftnxtra"
DESCRIPTION = "This package includes the documentation for texlive-ftnxtra"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn77682"

RPM_NAME = "texlive-ftnxtra-doc-2026.226.0.0.1svn77682-60.2.noarch.rpm"
RPM_HASH = "a1c3abd51eba443719ca63cc85d283c405eb288b35381dc1bab728a77579006c041181a6f09f14975ea465616e9b918537eb9df24483f09e868db53d3555d08f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ftnxtra-doc"

RDEPENDS:${PN} += ""

inherit rpm
