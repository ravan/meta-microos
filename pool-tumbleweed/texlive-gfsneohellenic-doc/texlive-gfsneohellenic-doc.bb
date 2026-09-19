SUMMARY = "Documentation for texlive-gfsneohellenic"
DESCRIPTION = "This package includes the documentation for texlive-gfsneohellenic"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn77682"

RPM_NAME = "texlive-gfsneohellenic-doc-2026.226.1.02svn77682-60.2.noarch.rpm"
RPM_HASH = "621089d13a02b6f58b0c1a368339e2f887e2a721c455befce3d3f1e3bad2421b5110c0868e3b654f6b8e69754b336e66d8391aaab91c49f063fd8fb8e9e492b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gfsneohellenic-doc"

RDEPENDS:${PN} += ""

inherit rpm
