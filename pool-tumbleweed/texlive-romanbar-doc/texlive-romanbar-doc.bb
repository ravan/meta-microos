SUMMARY = "Documentation for texlive-romanbar"
DESCRIPTION = "This package includes the documentation for texlive-romanbar"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0gsvn77682"

RPM_NAME = "texlive-romanbar-doc-2026.226.1.0gsvn77682-60.2.noarch.rpm"
RPM_HASH = "3f379bbef15b9285d1e2b23741c132162c3ea7e288d6cb3026dbf44f3b6db77d0ab72e74a4090baf644c0799004a6563d18e90a274bda0238fe1b18621ac2b50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romanbar-doc"

RDEPENDS:${PN} += ""

inherit rpm
