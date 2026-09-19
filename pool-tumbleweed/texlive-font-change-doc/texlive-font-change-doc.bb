SUMMARY = "Documentation for texlive-font-change"
DESCRIPTION = "This package includes the documentation for texlive-font-change"
LICENSE = "LPPL-1.0"

PV = "2026.226.2015.2svn40403"

RPM_NAME = "texlive-font-change-doc-2026.226.2015.2svn40403-60.2.noarch.rpm"
RPM_HASH = "972a97ef88ea23ac1088be5e0b5609d1a7420e5348e78378a69f4d41ec5e9413dd07ebfaac14e4369df49999fcd3f09afc7589cde5734b74cebf10932d31988d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-font-change-doc"

RDEPENDS:${PN} += ""

inherit rpm
