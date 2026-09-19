SUMMARY = "Documentation for texlive-ku-template"
DESCRIPTION = "This package includes the documentation for texlive-ku-template"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn45935"

RPM_NAME = "texlive-ku-template-doc-2026.226.0.0.02svn45935-63.2.noarch.rpm"
RPM_HASH = "8705e3bb2267f77f978bb2abab2ada2f422c94e83587a5884146ca16347f2dfe4cd69ca8eae4626b8d76790d0efd8c4ae97511cfb26cf8887dcc78a023882892"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ku-template-doc"

RDEPENDS:${PN} += ""

inherit rpm
