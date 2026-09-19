SUMMARY = "Documentation for texlive-songproj"
DESCRIPTION = "This package includes the documentation for texlive-songproj"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.2.0svn76924"

RPM_NAME = "texlive-songproj-doc-2026.226.1.2.0svn76924-64.2.noarch.rpm"
RPM_HASH = "2386c435ce59027c883b2bf54a9c3b1ac138d54dfad8eb9ecf65d4806f16d5f44b0a33a592a943717c0c279d30292de5098ce2c2d5d44180fe97015d0bc76c48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-songproj-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
