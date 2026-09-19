SUMMARY = "Documentation for texlive-macros2e"
DESCRIPTION = "This package includes the documentation for texlive-macros2e"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4asvn77050"

RPM_NAME = "texlive-macros2e-doc-2026.226.0.0.4asvn77050-59.2.noarch.rpm"
RPM_HASH = "6ff548ad4ea968f392bb209b82a399c768753b92588bd2a374281b7eb8cb02b5d101937b10429c9e0c299b346d8499418059e3712d4e0de22f8794c93198b756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-macros2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
