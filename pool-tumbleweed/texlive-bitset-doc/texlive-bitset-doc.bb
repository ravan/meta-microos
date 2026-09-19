SUMMARY = "Documentation for texlive-bitset"
DESCRIPTION = "This package includes the documentation for texlive-bitset"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn77682"

RPM_NAME = "texlive-bitset-doc-2026.226.1.3svn77682-59.2.noarch.rpm"
RPM_HASH = "4f425da9a934b6786f877537162188711a088a0a63592ac48c2c2855e41ec5b3bfceb138e2c86d5f6436a6fccc44532bb17c2ed135c531d2ac8b91a097a56fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitset-doc"

RDEPENDS:${PN} += ""

inherit rpm
