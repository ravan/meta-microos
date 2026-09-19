SUMMARY = "Documentation for texlive-exsheets"
DESCRIPTION = "This package includes the documentation for texlive-exsheets"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.21ksvn76924"

RPM_NAME = "texlive-exsheets-doc-2026.226.0.0.21ksvn76924-59.2.noarch.rpm"
RPM_HASH = "2d1ec5d3cedc6a1102304948c0161fcaa1406fa74ef83dfbe1ff0fa1d89c0006e2085885bb4fac44293216b9048f2dc6fdd73267a20bc03df188e32f8baa1f0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exsheets-doc"

RDEPENDS:${PN} += ""

inherit rpm
