SUMMARY = "Documentation for texlive-ctan-o-mat"
DESCRIPTION = "This package includes the documentation for texlive-ctan-o-mat"
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.2svn51578"

RPM_NAME = "texlive-ctan-o-mat-doc-2026.226.1.2svn51578-61.2.noarch.rpm"
RPM_HASH = "b8804530282b870b62f8c5b991e8e1976ac5ede7726877a9f73b80309965248e7c2b26c338585b7d619bad03a9408ca16ec231f1e4508c26590a988eb17c5496"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-ctan-o-mat.1 \
texlive-ctan-o-mat-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
