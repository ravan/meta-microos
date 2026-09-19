SUMMARY = "Documentation for texlive-firamath"
DESCRIPTION = "This package includes the documentation for texlive-firamath"
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.3.4svn56672"

RPM_NAME = "texlive-firamath-doc-2026.226.0.0.3.4svn56672-59.2.noarch.rpm"
RPM_HASH = "3896846531adf21a5527204d8b2a755ce62f8d610ae6d2582ccb28f658e763ae33f944d17f0c616d3dc804b6c87307d3f76795db64e2d94a38c9475a627af296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firamath-doc"

RDEPENDS:${PN} += ""

inherit rpm
