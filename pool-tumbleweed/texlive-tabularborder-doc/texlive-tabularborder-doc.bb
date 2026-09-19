SUMMARY = "Documentation for texlive-tabularborder"
DESCRIPTION = "This package includes the documentation for texlive-tabularborder"
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0asvn17885"

RPM_NAME = "texlive-tabularborder-doc-2026.227.1.0asvn17885-62.2.noarch.rpm"
RPM_HASH = "fc2f6ff70ba12929d678958f85b6d069779935587ea6aabaa5fcc689e38f14bfe6ffb791412abed9e01d98848e26ca2aad05602f437a8ba158760170a6e48352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabularborder-doc"

RDEPENDS:${PN} += ""

inherit rpm
