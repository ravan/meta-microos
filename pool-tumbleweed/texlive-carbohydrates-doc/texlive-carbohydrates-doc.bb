SUMMARY = "Documentation for texlive-carbohydrates"
DESCRIPTION = "This package includes the documentation for texlive-carbohydrates"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn39000"

RPM_NAME = "texlive-carbohydrates-doc-2026.226.0.0.1svn39000-59.2.noarch.rpm"
RPM_HASH = "e019ec7524ac672d73895935e4ee8ab6e3d60ac617a5865b86651abaadc617071f4649e035f9232ffc8ae2a6e2f3c7f656963a2dd935fe2fd4add8a448e2a547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carbohydrates-doc"

RDEPENDS:${PN} += ""

inherit rpm
