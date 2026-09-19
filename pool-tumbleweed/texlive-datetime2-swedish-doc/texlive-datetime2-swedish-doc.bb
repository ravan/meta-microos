SUMMARY = "Documentation for texlive-datetime2-swedish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-swedish"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn36700"

RPM_NAME = "texlive-datetime2-swedish-doc-2026.226.1.0svn36700-59.2.noarch.rpm"
RPM_HASH = "17ee67f0964c053d003f74e24ad4282a49369d9e95d81a028f6958b61db872ef141e6ac1e04f9f411c693d1aefc768f8b4d8ee68f1aaaa81f15df92a67b5797e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-swedish-doc"

RDEPENDS:${PN} += ""

inherit rpm
