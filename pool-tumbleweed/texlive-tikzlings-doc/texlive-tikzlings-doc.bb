SUMMARY = "Documentation for texlive-tikzlings"
DESCRIPTION = "This package includes the documentation for texlive-tikzlings"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.5svn77682"

RPM_NAME = "texlive-tikzlings-doc-2026.226.2.5svn77682-59.2.noarch.rpm"
RPM_HASH = "0b7c893079ba53c57447b6691f315ace9171cf177399c6dfc0b79abbc471c2a11f9825084cfb540d365eff4098da8691fb46c52d5c2746f3ef79b4c9a901826f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzlings-doc"

RDEPENDS:${PN} += ""

inherit rpm
