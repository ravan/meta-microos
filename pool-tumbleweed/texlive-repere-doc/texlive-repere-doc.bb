SUMMARY = "Documentation for texlive-repere"
DESCRIPTION = "This package includes the documentation for texlive-repere"
LICENSE = "LPPL-1.0"

PV = "2026.226.23.05.bsvn66998"

RPM_NAME = "texlive-repere-doc-2026.226.23.05.bsvn66998-60.4.noarch.rpm"
RPM_HASH = "0ae659c4d5b73ca1863a8ad388016d4e6a036a642b07f615317c944e9ee5cf53df68dd4ebfef809dcbc0ebe30527573677a687476f87a85d1c4807eb5331f2ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-repere-doc-fr \
texlive-repere-doc"

RDEPENDS:${PN} += ""

inherit rpm
