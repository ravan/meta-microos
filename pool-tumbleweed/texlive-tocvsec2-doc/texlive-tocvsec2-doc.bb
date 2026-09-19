SUMMARY = "Documentation for texlive-tocvsec2"
DESCRIPTION = "This package includes the documentation for texlive-tocvsec2"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3asvn77682"

RPM_NAME = "texlive-tocvsec2-doc-2026.226.1.3asvn77682-59.2.noarch.rpm"
RPM_HASH = "cc374230fadf8e861eb6526cf392a2a1868829da1d86fa973359bebb833a0b828da4bb663868a3dc4076db1e2f4bea4df28f764d2586c71d69995fd87647a038"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocvsec2-doc"

RDEPENDS:${PN} += ""

inherit rpm
