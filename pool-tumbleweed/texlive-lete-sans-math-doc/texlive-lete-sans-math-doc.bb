SUMMARY = "Documentation for texlive-lete-sans-math"
DESCRIPTION = "This package includes the documentation for texlive-lete-sans-math"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.50svn77682"

RPM_NAME = "texlive-lete-sans-math-doc-2026.226.0.0.50svn77682-61.2.noarch.rpm"
RPM_HASH = "9024979344d8e74a3b4a486f29c7fcba2e78dd083e7b112f98842e28331368a26d591f84d3bd13694721ffc6ae4e1c4f53854bcf6fe1a8db74d3f98ba52c1d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lete-sans-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
