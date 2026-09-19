SUMMARY = "Documentation for texlive-splentinex"
DESCRIPTION = "This package includes the documentation for texlive-splentinex"
LICENSE = "OFL-1.1"

PV = "2026.226.1.0svn77682"

RPM_NAME = "texlive-splentinex-doc-2026.226.1.0svn77682-64.2.noarch.rpm"
RPM_HASH = "8277dfab73eb88730d20f7ebbac533177accfcd826a67e78af06cbd1e869bc44f2ce3827b3dd9a60b6e70b9a4a7ed385de358cc86fdb9d12b8a311c6b2146d1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-splentinex-doc"

RDEPENDS:${PN} += ""

inherit rpm
