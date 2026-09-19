SUMMARY = "Documentation for texlive-extpfeil"
DESCRIPTION = "This package includes the documentation for texlive-extpfeil"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn77682"

RPM_NAME = "texlive-extpfeil-doc-2026.226.0.0.4svn77682-59.2.noarch.rpm"
RPM_HASH = "e9a62fc9482599060a55c6da1f6829938a8cc140f274faadf4ea0da9937d1cff6b1f24ec2a54e24c99d3389d6d0e4fa21e9690158b52a79afdc7c9d816b0b1ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-extpfeil-doc-de \
texlive-extpfeil-doc"

RDEPENDS:${PN} += ""

inherit rpm
