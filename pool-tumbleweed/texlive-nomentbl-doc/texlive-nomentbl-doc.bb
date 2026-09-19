SUMMARY = "Documentation for texlive-nomentbl"
DESCRIPTION = "This package includes the documentation for texlive-nomentbl"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn16549"

RPM_NAME = "texlive-nomentbl-doc-2026.226.0.0.4svn16549-61.2.noarch.rpm"
RPM_HASH = "0ba9f81d7c4e8aeeaba1ec3b40de48f9fce5be7b3c3b6753df37aeb93fa0ebde357db6655ed96150d8a30ba53bf1701124422d0b9c21c06ce68cad3948a58691"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nomentbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
