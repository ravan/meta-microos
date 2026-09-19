SUMMARY = "Documentation for texlive-footnotehyper"
DESCRIPTION = "This package includes the documentation for texlive-footnotehyper"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1fsvn77682"

RPM_NAME = "texlive-footnotehyper-doc-2026.226.1.1fsvn77682-60.2.noarch.rpm"
RPM_HASH = "e8c900870dd18a49850d1652eea2f239a02e08c7e917b81abb6213d289fde26c91f28d5d83b675195efb5de24235b5bd7fc27331ef45468ff4416084a1a86362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnotehyper-doc"

RDEPENDS:${PN} += ""

inherit rpm
