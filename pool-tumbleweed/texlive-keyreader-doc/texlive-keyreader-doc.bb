SUMMARY = "Documentation for texlive-keyreader"
DESCRIPTION = "This package includes the documentation for texlive-keyreader"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5bsvn28195"

RPM_NAME = "texlive-keyreader-doc-2026.226.0.0.5bsvn28195-63.2.noarch.rpm"
RPM_HASH = "fe216072c3aebc07bfa26ad3dea8afb1edbccf75bc9f5caeba0eccc7eb17034ed9a7b452626bb36584099010f560c5240d529017ac04a19c03795245083c7019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyreader-doc"

RDEPENDS:${PN} += ""

inherit rpm
