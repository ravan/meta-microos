SUMMARY = "Documentation for texlive-tikzsymbols"
DESCRIPTION = "This package includes the documentation for texlive-tikzsymbols"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.12asvn61300"

RPM_NAME = "texlive-tikzsymbols-doc-2026.226.4.12asvn61300-59.2.noarch.rpm"
RPM_HASH = "1e91dc9aa04b3901b66ef83327d6bd09836d4d2e45b496c85ac5b9492bb57b0f8282195116c72c6ff8c20652359b786ec7db69046d30389d9e647609afa3e3c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzsymbols-doc"

RDEPENDS:${PN} += ""

inherit rpm
