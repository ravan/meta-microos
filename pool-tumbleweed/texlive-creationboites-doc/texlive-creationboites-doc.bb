SUMMARY = "Documentation for texlive-creationboites"
DESCRIPTION = "This package includes the documentation for texlive-creationboites"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20asvn77768"

RPM_NAME = "texlive-creationboites-doc-2026.226.0.0.20asvn77768-61.2.noarch.rpm"
RPM_HASH = "80def208d756c3fb9ed3bed138d9558a27f6af927668efe050b8e7664b8a28c5071417c31a2d71ed0ea0863fc9f9e9c9e463f9903d6aaed17e3708a2116d2f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-creationboites-doc"

RDEPENDS:${PN} += ""

inherit rpm
