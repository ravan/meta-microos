SUMMARY = "Documentation for texlive-intopdf"
DESCRIPTION = "This package includes the documentation for texlive-intopdf"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4.1svn77682"

RPM_NAME = "texlive-intopdf-doc-2026.226.0.0.4.1svn77682-60.2.noarch.rpm"
RPM_HASH = "cde2ad4f4680f8213f278486a0525f5f6120563746f802dd2c349c7cf30282dfd2bf355d591862c3ac18c5594110bd533ab42f1284907ca757e043998513718c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-intopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
