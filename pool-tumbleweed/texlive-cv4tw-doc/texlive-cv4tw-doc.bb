SUMMARY = "Documentation for texlive-cv4tw"
DESCRIPTION = "This package includes the documentation for texlive-cv4tw"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn34577"

RPM_NAME = "texlive-cv4tw-doc-2026.226.0.0.2svn34577-61.2.noarch.rpm"
RPM_HASH = "e5fdeb93e6836577686728e949a4cf2d85de0c8d10c43810e6f8b6fd74434eaea9230a40df7fcb3abe2992c2ffab9949258ddd1e50252d0985b62a9f4eaac85d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cv4tw-doc"

RDEPENDS:${PN} += ""

inherit rpm
